package com.veryq.gen.Controller;

import com.deepoove.poi.XWPFTemplate;
import com.deepoove.poi.data.MiniTableRenderData;
import com.deepoove.poi.data.RowRenderData;
import com.deepoove.poi.data.TextRenderData;
import com.deepoove.poi.data.style.Style;
import com.deepoove.poi.data.style.TableStyle;
import com.veryq.gen.Model.Contractor;
import org.jodconverter.JodConverter;
import org.jodconverter.office.LocalOfficeManager;
import org.jodconverter.office.OfficeException;
import org.jodconverter.office.OfficeUtils;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STJc;


import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
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
        rowStyle = new TableStyle();
        rowStyle.setAlign(STJc.CENTER);


        Contractor data = new Contractor();
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



        URL url= Main.class.getResource("/");
        String dir=url.getPath();
        String time=System.currentTimeMillis()+"";
        String sourcepath= dir+"contract-template.docx";; //System.getProperty("user.dir")+File.separator+"contract-template.docx";
        String destpath=dir+time+".docx";
        System.out.println(sourcepath);
        System.out.println(destpath);
        genWord(sourcepath,data,destpath);
        toPdf(destpath,dir+time+".pdf");
    }


    private static void genWord(String templateFile, Object data, String outFile) throws Exception {
        XWPFTemplate template = XWPFTemplate.compile(templateFile).render(data);
        FileOutputStream out = new FileOutputStream(outFile);
        template.write(out);
        out.flush();
        out.close();
        template.close();

//        XWPFTemplate template = XWPFTemplate.compile(templateFile).render(new HashMap<String, Object>(){{
//            put("title", "Poi-tl 模板引擎");
//        }});
//        FileOutputStream out = new FileOutputStream(outFile);
//        template.write(out);
//        out.flush();
//        out.close();
//        template.close();


    }

    public static void toPdf(String in,String out) throws OfficeException {


//        File inputFile = new File("document.doc");
//        File outputFile = new File("document.pdf");
//
//        String[] args = {"cmd","/c","\\path to libreoffice executable","-headless",  "-accept='socket,host=127.0.0.1,port=8100;urp;'", "-nofirststartwizard"};
//
//        try{
//            Runtime rt = Runtime.getRuntime();
//            ProcessBuilder pb = new ProcessBuilder(args);
//            Process pr = pb.start();
//
//            // connect to an OpenOffice.org instance running on port 8100
//            OpenOfficeConnection connection = new SocketOpenOfficeConnection(8100);
//            connection.connect();
//        }catch{Exception e){
//        }


        File inputFile = new File(in);
        File outputFile = new File(out);
        final LocalOfficeManager officeManager = LocalOfficeManager.install();
        try {
            //https://cdn2.jianshu.io/p/0a1f284931a4
           long start= System.currentTimeMillis();
            System.out.println("start start"+start);
            officeManager.start();
            System.out.println("convert start "+(System.currentTimeMillis()-start)/1000);
            start=System.currentTimeMillis();
            JodConverter
                    .convert(inputFile)
                    .to(outputFile)
                    .execute();
            System.out.println("convert 1  "+(System.currentTimeMillis()-start)/1000);
            start=System.currentTimeMillis();
            JodConverter
                    .convert(inputFile)
                    .to(outputFile)
                    .execute();
            System.out.println("convert 2  "+(System.currentTimeMillis()-start)/1000);
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
