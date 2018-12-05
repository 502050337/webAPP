package com.veryq.gen.controller;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;
import com.deepoove.poi.data.style.TableStyle;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.veryq.gen.model.Contractor;
import com.veryq.gen.model.Order;
import com.veryq.gen.model.Row;
import com.veryq.gen.model.excel.ExcelContractor;
import org.apache.commons.io.IOUtils;
import org.jodconverter.JodConverter;
import org.jodconverter.office.LocalOfficeManager;
import org.jodconverter.office.OfficeException;
import org.jodconverter.office.OfficeUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contractor")
public class ContractorController {

    @Autowired
    LocalOfficeManager localOfficeManager;
    @RequestMapping("/hello")
    public String  hello(){
        return "Hello Word";
    }

    @RequestMapping("/genpdf")
    public void  genpdf(@RequestBody Contractor person, HttpServletRequest request, HttpServletResponse response) throws Exception {
        TableStyle headStyle = new TableStyle();
        headStyle.setBackgroundColor("F2F2F2");
        headStyle.setAlign(STJc.CENTER);
        List<Order> orders =  person.getOrders();
        for(Order orders1:orders){
            String title = orders1.getTitle();
            TableTypeEnum table = TableTypeEnum.fromTitle(title);
            AtomicLong index = new AtomicLong();
            List<RowRenderData> itemsRowDaa=orders1.getItems().stream().map(item->item.toRowRenderData(index.incrementAndGet(),table)).collect(Collectors.toList());
            ExcelContractor data = new ExcelContractor();
            data.setTitle(title);
            data.setContract_sn(person.getPerson().getIdno());
            data.setName(person.getPerson().getName());
            MiniTableRenderData miniTableRenderData = new MiniTableRenderData(table.getHeader(), itemsRowDaa, MiniTableRenderData.WIDTH_A4_MEDIUM_FULL);
            miniTableRenderData.setStyle(headStyle);
            data.setOrder(miniTableRenderData);

            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
            String time = dateformat.format(System.currentTimeMillis());
            String dir = ContractorController.class.getResource("/").getPath();
            //模版路径
            String sourcepath = dir + "contract-template.docx";
            String filenam = data.getName() + "的拆迁合同" + time;
            //文件名
            String wordFileName = filenam + ".docx";
            String pdfFileName = filenam + ".pdf";
            //文件所在路径
            String wordpath = dir + wordFileName;
            String pdfpath = dir + pdfFileName;
            //生成word
            WordConvertor.genWord(sourcepath, data, wordpath);
            //word 转pdf
            toPdf(wordpath, pdfpath);
            File targetFile = new File(pdfpath);
            response.setHeader("Access-Control-Expose-Headers","Content-Disposition");
            response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(pdfFileName, "UTF-8"));
            IOUtils.copy(new FileInputStream(targetFile),response.getOutputStream());

            return;
        }

    }



    private static void toPdf(String in, String out) throws OfficeException {
        File inputFile = new File(in);
        File outputFile = new File(out);
        JodConverter.convert(inputFile).to(outputFile).execute();
    }

}