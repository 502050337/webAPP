package com.veryqy.gen.test;

import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;
import com.deepoove.poi.data.style.TableStyle;
import com.veryqy.gen.bo.FileConvertor;
import com.veryqy.gen.model.excel.ExcelContractor;
import org.jodconverter.JodConverter;
import org.jodconverter.office.LocalOfficeManager;
import org.jodconverter.office.OfficeException;
import org.jodconverter.office.OfficeUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/**
 * http://deepoove.com/poi-tl/
 * Java中Word转PDF解决方案
 * https://www.jianshu.com/p/6341014659f2?utm_campaign=maleskine
 * <p>
 * PDF Conversions in Java
 * https://www.baeldung.com/pdf-conversions-java
 * <p>
 * https://github.com/yeokm1/docs-to-pdf-converter
 * <p>
 * Docx4j的Word转PDF及HTML的实现
 * https://angelozerr.wordpress.com/2012/12/06/how-to-convert-docxodt-to-pdfhtml-with-java/
 * <p>
 * https://www.programcreek.com/java-api-examples/?api=org.docx4j.Docx4J
 * <p>
 * https://blog.csdn.net/j1231230/article/details/80712531
 * <p>
 * XDocReport
 * https://github.com/opensagres/xdocreport
 */

public class Main {


    public static void main(String[] args) throws Exception {

//        String path=Main.class.getClass().getResource("application.properties").getPath();
//        System.out.println(path);

        TableStyle headStyle = new TableStyle();
        TableStyle rowStyle = new TableStyle();
        Style headTextStyle = new Style();
        headTextStyle.setFontFamily("Hei");
        headTextStyle.setFontSize(9);
        headTextStyle.setColor("7F7F7F");
        headStyle.setBackgroundColor("F2F2F2");
        headStyle.setAlign(STJc.CENTER);
        rowStyle.setAlign(STJc.CENTER);


        ExcelContractor data = new ExcelContractor();
        data.setAgreementId("11111111");
        data.setPersonName("熊余光");
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
        String dir = Main.class.getResource("/").getPath();
        String sourcepath = dir + "contract-template.docx";
        String destpath = dir + "contract-template" + time + ".docx";
        String pdfpath = dir + "contract-template" + time + ".pdf";
//        System.out.println(sourcepath);
//        System.out.println(destpath);
        FileConvertor.genWord(sourcepath, data, destpath);
        toPdf(destpath, pdfpath);
    }



    private static void toPdf(String in, String out) throws OfficeException {
        File inputFile = new File(in);
        File outputFile = new File(out);
        final LocalOfficeManager officeManager = LocalOfficeManager.install();
        try {
            //https://cdn2.jianshu.io/p/0a1f284931a4
            long start = System.currentTimeMillis();
            System.out.println("start start" + start);
            officeManager.start();
            System.out.println("convert start " + (System.currentTimeMillis() - start) / 1000);
            start = System.currentTimeMillis();
            JodConverter.convert(inputFile).to(outputFile).execute();
            System.out.println("convert 1  " + (System.currentTimeMillis() - start) / 1000);
            start = System.currentTimeMillis();
            JodConverter.convert(inputFile).to(outputFile).execute();
            System.out.println("convert 2  " + (System.currentTimeMillis() - start) / 1000);
        } finally {
            OfficeUtils.stopQuietly(officeManager);
        }
    }

}


//    public static void docxToHtml() throws Exception {
//        HWPFDocumentCore wordDocument = WordToHtmlUtils.loadDoc(new FileInputStream("d:/hello.docx"));
//        WordToHtmlConverter wordToHtmlConverter = new WordToHtmlConverter(
//                DocumentBuilderFactory.newInstance().newDocumentBuilder()
//                        .newDocument());
//        wordToHtmlConverter.processDocument(wordDocument);
//        Document htmlDocument = wordToHtmlConverter.getDocument();
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        DOMSource domSource = new DOMSource(htmlDocument);
//        StreamResult streamResult = new StreamResult(out);
//        TransformerFactory tf = TransformerFactory.newInstance();
//        Transformer serializer = tf.newTransformer();
//        serializer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
//        serializer.setOutputProperty(OutputKeys.INDENT, "yes");
//        serializer.setOutputProperty(OutputKeys.METHOD, "html");
//        serializer.transform(domSource, streamResult);
//        out.close();
//        String result = new String(out.toByteArray());
//        System.out.println(result);
//    }

//        XWPFTemplate template = XWPFTemplate.compile("d:/hello.docx").render(new HashMap<String, Object>(){{
//            put("title", "Poi-tl 模板引擎");
//        }});
//        FileOutputStream out = new FileOutputStream("d:/out_template.docx");
//        template.write(out);
//        out.flush();
//        out.close();
//        template.close();
