package com.veryqy.gen.controller;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.style.TableStyle;
import com.veryqy.gen.bo.ContractorService;
import com.veryqy.gen.bo.FileConvertor;
import com.veryqy.gen.bo.TableTypeEnum;
import com.veryqy.gen.model.Contractor;
import com.veryqy.gen.model.Order;
import com.veryqy.gen.model.Row;
import com.veryqy.gen.model.excel.ExcelContractor;
import com.veryqy.gen.util.JSON;
import com.veryqy.jooq.tables.pojos.Commodity;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.jooq.tools.StringUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contractor")
@Slf4j
public class ContractorController {

    private final
    ContractorService bo;

    @Autowired
    public ContractorController(ContractorService bo) {
        this.bo = bo;
    }


    @GetMapping("/{id}")
    @ResponseBody
    public String getContractorById(@PathVariable("id")  String id, HttpServletRequest request, HttpServletResponse response) {
       if(id==null)
       {
            throw new RuntimeException("id 必填");
       }
       return bo.getContractorById(id).getJosn();
    }

    @PostMapping("/_search")
    @ResponseBody
    public List<com.veryqy.jooq.tables.pojos.Contractor> searchContractor(@RequestBody  Contractor contractor, HttpServletRequest request, HttpServletResponse response) {
        com.veryqy.jooq.tables.pojos.Contractor jooqContractor=new com.veryqy.jooq.tables.pojos.Contractor();
        BeanUtils.copyProperties(contractor,jooqContractor);
        return   bo.searchContractor(jooqContractor);
    }


    @RequestMapping("/_excelimport")
    public String excelimport(MultipartFile tmpFile) {
        String mssg = "";
        if (tmpFile != null) {
            // 获取物理路径
            String dir = System.getProperty("user.home") + File.separator + "excelimport" + File.separator;
            File dirFile = new File(dir);
            if (!dirFile.exists() && !dirFile.isDirectory()) {
                System.out.println(dir + ",不存在");
                dirFile.mkdirs();
            }
            String tmpFileName = tmpFile.getOriginalFilename(); // 上传的文件名
            File excelFile = new File(dir + tmpFileName);
            Integer count = bo.excelimport(excelFile);
            if (count < 0) {
                mssg = "导入失败";
            } else {
                mssg = "导入成功";
            }
        }
        return mssg;
    }


    @RequestMapping("/_excelimport1")
    public String _excelimport1() {
        String dir = System.getProperty("user.home") + File.separator + "genpdf" + File.separator;
        File dirFile=new File(dir);
        if(!dirFile.exists()) {
            dirFile.mkdirs();
        }
        File excelFile = new File(dir+"1.xlsx");
        String mssg;
        Integer count = bo.excelimport(excelFile);
        if (count < 0) {
            mssg = "导入失败";
        } else {
            mssg = "导入成功";
        }
        return mssg;
    }

    @PostMapping("/genpdf")
    public void genpdf(@RequestBody Contractor contractor, HttpServletRequest request, HttpServletResponse response) throws Exception {
        TableStyle headStyle = new TableStyle();
        headStyle.setBackgroundColor("FFFFFF");
        headStyle.setAlign(STJc.CENTER);
        List<Order> orders = contractor.getOrders();
        for (Order orders1 : orders) {
            String title = orders1.getTitle();
            TableTypeEnum table = TableTypeEnum.fromTitle(title);

            AtomicLong index = new AtomicLong();
            List<RowRenderData> indexeditems = orders1.getItems().stream().map(item -> {
                Long i = index.incrementAndGet();
                item.setSeq(i.toString());
                item.setTotal(null);//重置总金额
                return item;
            }).map(item -> item.toRowRenderData(table)).collect(Collectors.toList());

            Double totalSum = orders1.getItems().stream().mapToDouble(item ->
                    Double.parseDouble(item.getTotalString())
            ).sum();
            DecimalFormat df = new DecimalFormat("0.00");
            indexeditems.add(new Row("总价",  df.format(totalSum)).toRowRenderData(table));
            List<RowRenderData> styledItems = indexeditems.stream().peek(item -> item.setStyle(headStyle)).collect(Collectors.toList());

            ExcelContractor data = new ExcelContractor();
            data.setTitle(table.getTitle());
            data.setPersonIdno(contractor.getPerson().getIdno());
            data.setAgreementId(contractor.getAgreementId());
            data.setPersonAddress(contractor.getPerson().getAddress());
            data.setPersonName(contractor.getPerson().getName());
            MiniTableRenderData miniTableRenderData = new MiniTableRenderData(table.getHeader(), styledItems, MiniTableRenderData.WIDTH_A4_MEDIUM_FULL);
            miniTableRenderData.setStyle(headStyle);
            data.setOrder(miniTableRenderData);

            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
            String time = dateformat.format(System.currentTimeMillis());

            String dir = System.getProperty("user.home") + File.separator + "genpdf" + File.separator;
            File dirFile = new File(dir);
            if (!dirFile.exists() && !dirFile.isDirectory()) {
                System.out.println(dir + ",不存在");
                dirFile.mkdirs();
            }
            //模版路径
            String sourcepath = dir + "model1.docx";
            String filenam = data.getPersonName() + "_附属物" + time;
            //文件名
            String wordFileName = filenam + ".docx";
            String pdfFileName = filenam + ".pdf";
            //文件所在路径
            String wordpath = dir + wordFileName;
            String pdfpath = dir + pdfFileName;

            FileConvertor.genWord(sourcepath, data, wordpath);//生成word
            FileInputStream in = new FileInputStream(wordpath);
//            ExcelUtil excelutil = new ExcelUtil();
//            excelutil.createFooter(new XWPFDocument(in),"公司电话","公司地址");
            FileConvertor.toPdf(wordpath, pdfpath);//word 转pdf
            File targetFile = new File(pdfpath);
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(pdfFileName, "UTF-8"));
            IOUtils.copy(new FileInputStream(targetFile), response.getOutputStream());

            return;
        }
    }

    /**
     *
     * http://localhost:8080/gen/contractor
     * @param contractor json内容
     * @param request 备用参数
     * @param response 备用参数
     */
    @PutMapping
    public void save(@RequestBody Contractor contractor, HttpServletRequest request, HttpServletResponse response) {
        if(contractor==null){
            throw new RuntimeException("合同不能未空");
        }
        if(contractor.getOrders()==null){
            throw new RuntimeException("合同订单数不能未空");
        }
        if(contractor.getOrders().size()==0){
            throw new RuntimeException("合同订单数不能为0");
        }
        for(Order order:contractor.getOrders()){
            for(Row row:order.getItems()){
                if(row.isChecked()){
                    if(!NumberUtils.isParsable(row.getPrice())){
                        throw new RuntimeException(
                                "表:"+StringUtils.defaultString(order.getTitle())
                                + "\n 分类:"+StringUtils.defaultString(row.getCategory())
                                + "\n 名称:"+StringUtils.defaultString(row.getName())
                                + "\n 价格"+StringUtils.defaultString(row.getPrice())+"有错误，请检查"
                                );
                    }
                    if(!NumberUtils.isParsable(row.getCount())){
                        throw new RuntimeException(
                                "表:"+StringUtils.defaultString(order.getTitle())
                                        + "\n 分类:"+StringUtils.defaultString(row.getCategory())
                                        + "\n 名称:"+StringUtils.defaultString(row.getName())
                                        + "\n 数量"+StringUtils.defaultString(row.getCount())+"有错误，请检查"
                        );
                    }
                }
            }
        }
        String j=JSON.stringify(contractor);
        log.debug("save",j);
//        if(1==1){
//            throw new RuntimeException("111111111");
//        }
        bo.save("1",contractor);
    }


    @RequestMapping("/commoditys")
    public List<Commodity> getCommoditys() {
        return bo.commodityquery();
    }



    public static void main(String[] args) {
        try {
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(111.12151D));
//            String wordpath = "E:/model2.docx";
//            FileInputStream in = new FileInputStream(wordpath);
//            ExcelUtil excelutil = new ExcelUtil();
//            excelutil.createFooter(new XWPFDocument(in),"公司电话","公司地址");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}