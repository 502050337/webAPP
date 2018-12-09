package com.veryq.gen.controller;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.style.TableStyle;
import com.veryq.gen.bo.ContractorService;
import com.veryq.gen.bo.FileConvertor;
import com.veryq.gen.bo.TableTypeEnum;
import com.veryq.gen.model.Contractor;
import com.veryq.gen.model.Order;
import com.veryq.gen.model.Row;
import com.veryq.gen.model.excel.ExcelContractor;
import com.veryq.gen.test.Main;
import com.veryqy.jooq.tables.pojos.Commodity;
import org.apache.commons.io.IOUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contractor")
public class ContractorController {

    @Autowired
    ContractorService bo;


    @GetMapping("/{id}")
    public void getContractorById(@PathVariable("id")  String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        bo.getContractorById(id);
    }


    @PostMapping("/_search")
    public List<com.veryqy.jooq.tables.pojos.Contractor> searchContractor(@RequestBody  Contractor contractor, HttpServletRequest request, HttpServletResponse response) throws Exception {
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
                mssg = "导入失败";
            }
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
                return item;
            }).map(item -> item.toRowRenderData(table)).collect(Collectors.toList());

            Double totalSum = orders1.getItems().stream().mapToDouble(item ->
                    Double.parseDouble(item.getTotal())
            ).sum();

            indexeditems.add(new Row("总价", totalSum.toString()).toRowRenderData(table));
            List<RowRenderData> styledItems = indexeditems.stream().peek(item -> item.setStyle(headStyle)).collect(Collectors.toList());

            ExcelContractor data = new ExcelContractor();
            data.setTitle(table.getTitle());
            data.setPersonIdno(contractor.getPerson().getIdno());
            data.setAgreementId(contractor.getAgreementId());
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

            FileConvertor.toPdf(wordpath, pdfpath);//word 转pdf
            File targetFile = new File(pdfpath);
            response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
            response.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(pdfFileName, "UTF-8"));
            IOUtils.copy(new FileInputStream(targetFile), response.getOutputStream());

            return;
        }
    }


    @PutMapping
    public void save(@RequestBody Contractor contractor, HttpServletRequest request, HttpServletResponse response) throws Exception {
        bo.save("1",contractor);
    }


    @RequestMapping("/commoditys")
    public List<Commodity> getCommoditys() {
        return bo.commodityquery();
    }



    public static void main(String[] args) {
        Double d = Double.parseDouble("1000.56") + Double.parseDouble("1000.56");
        System.out.println(d);
    }

    public String ttttttt() {
        URL url = Main.class.getResource("/");
        String dir = url.getPath();
        File excelFile = new File(dir + "征收集体土地构筑物、附属设施补偿标准.xlsx");
        String mssg;
        Integer count = bo.excelimport(excelFile);
        if (count < 0) {
            mssg = "导入失败";
        } else {
            mssg = "导入失败";
        }
        return mssg;
    }


}