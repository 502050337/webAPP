package com.veryq.gen.controller;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.style.TableStyle;
import com.veryq.gen.bo.ExcelImportBo;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
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
    ExcelImportBo bo;

    @RequestMapping("/excelimport")
    public String excelimport() {
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

    @RequestMapping("/genpdf")
    public void genpdf(@RequestBody Contractor contractor, HttpServletRequest request, HttpServletResponse response) throws Exception {
        TableStyle headStyle = new TableStyle();
        headStyle.setBackgroundColor("FFFFFF");
        headStyle.setAlign(STJc.CENTER);
        List<Order> orders = contractor.getOrders();
        for (Order orders1 : orders) {
            String title = orders1.getTitle();
            TableTypeEnum table = TableTypeEnum.fromTitle(title);

            AtomicLong index = new AtomicLong();
            List<RowRenderData> indexeditems = orders1.getItems().stream().peek(item -> {
                Long i = index.incrementAndGet();
                item.setSeq(i.toString());
            }).map(item -> item.toRowRenderData(table)).collect(Collectors.toList());


            Double totalSum = orders1.getItems().stream().mapToDouble(item -> item.getTotal()).sum();
            indexeditems.add(new Row("总价", totalSum).toRowRenderData(table));


            List<RowRenderData> styledItems = indexeditems.stream().peek(item -> item.setStyle(headStyle)).collect(Collectors.toList());


            ExcelContractor data = new ExcelContractor();
            data.setTitle(table.getTitle());
            data.setContract_sn(contractor.getPerson().getIdno());
            data.setName(contractor.getPerson().getName());
            MiniTableRenderData miniTableRenderData = new MiniTableRenderData(table.getHeader(), styledItems, MiniTableRenderData.WIDTH_A4_MEDIUM_FULL);
            miniTableRenderData.setStyle(headStyle);
            data.setOrder(miniTableRenderData);

            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
            String time = dateformat.format(System.currentTimeMillis());

            String dir = System.getProperty("user.home") + File.separator + "genpdf" + File.separator;
            File dirFile = new File(dir);
            if (!dirFile.exists()&& !dirFile .isDirectory()) {
                System.out.println(dir+",不存在");
                dirFile.mkdirs();
            }
            //模版路径
            String sourcepath = dir + "model1.docx";
            String filenam = data.getName() + "_附属物" + time;
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

    @RequestMapping("/commodityquery")
    public List<Commodity> commodityquery() {
        return bo.commodityquery();
    }


}