package com.veryq.gen.controller;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;
import com.deepoove.poi.data.style.TableStyle;
import com.veryq.gen.model.Contractor;
import org.apache.commons.io.IOUtils;
import org.jodconverter.JodConverter;
import org.jodconverter.office.LocalOfficeManager;
import org.jodconverter.office.OfficeException;
import org.jodconverter.office.OfficeUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Arrays;


@RestController
@RequestMapping("/contractor")
public class ContractorController {

    @Autowired
    LocalOfficeManager localOfficeManager;


    @RequestMapping("/genpdf")
    public void  genpdf(@RequestBody Contractor person, HttpServletRequest request, HttpServletResponse response) throws Exception {
        TableStyle headStyle = new TableStyle();
        TableStyle rowStyle = new TableStyle();
        Style headTextStyle = new Style();
        headTextStyle.setFontFamily("Hei");
        headTextStyle.setFontSize(9);
        headTextStyle.setColor("7F7F7F");
        headStyle.setBackgroundColor("F2F2F2");
        headStyle.setAlign(STJc.CENTER);
        rowStyle.setAlign(STJc.CENTER);
        com.veryq.gen.model.excel.Contractor data = new com.veryq.gen.model.excel.Contractor();
        data.setContract_sn("11111111");
        data.setName("熊余光");
        data.setTitle("ffffffff");
        RowRenderData header = RowRenderData.build(new TextRenderData("日期", headTextStyle),
                new TextRenderData("订单编号", headTextStyle), new TextRenderData("销售代表", headTextStyle),
                new TextRenderData("离岸价", headTextStyle), new TextRenderData("发货方式", headTextStyle),
                new TextRenderData("条款", headTextStyle), new TextRenderData("税号", headTextStyle));
        RowRenderData row = RowRenderData.build("2018-06-12", "SN18090", "李四", "5000元", "快递", "附录A", "T11090");
        row.setStyle(rowStyle);
        MiniTableRenderData miniTableRenderData = new MiniTableRenderData(header, Arrays.asList(row), MiniTableRenderData.WIDTH_A4_MEDIUM_FULL);
        miniTableRenderData.setStyle(headStyle);
        data.setOrder(miniTableRenderData);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd_HH_mm_ss");
        String time = dateformat.format(System.currentTimeMillis());
        String dir = ContractorController.class.getResource("/").getPath();
        String sourcepath = dir + "contract-template.docx";
        String destpath = dir + "contract-template" + time + ".docx";
        String pdfFileName =  "contract-template" + time + ".pdf";
        String pdfpath = dir + pdfFileName;
        WordConvertor.genWord(sourcepath, data, destpath);
        toPdf(destpath, pdfpath);
        File targetFile = new File(pdfpath);
        response.setHeader("content-disposition", "inline;filename="+ URLEncoder.encode("pdfFileName", "UTF-8"));
        IOUtils.copy(new FileInputStream(targetFile),response.getOutputStream());
    }


    private static void toPdf(String in, String out) throws OfficeException {
        File inputFile = new File(in);
        File outputFile = new File(out);
        JodConverter.convert(inputFile).to(outputFile).execute();
    }

}