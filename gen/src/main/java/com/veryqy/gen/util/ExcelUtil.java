package com.veryqy.gen.util;

/**
 *
 */

import com.veryqy.gen.test.Main;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.*;
import org.jooq.DSLContext;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.net.URL;

/**
 *
 * Description: Excel操作
 *
 * CreateTime: 2017年12月11日  下午3:08:09
 *
 * Change History:
 *
 *        Date             CR Number              Name              Description of change
 *
 */
public class ExcelUtil {

    @Autowired
    DSLContext ctx;

    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    /**
     * 读取Excel测试，兼容 Excel 2003/2007/2010
     * @throws Exception 错误
     */
    public static void main(String[] args) throws Exception {
//        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        try {
            // 同时支持Excel 2003、2007
            URL url = Main.class.getResource("/");
            String dir = url.getPath();
            File excelFile = new File(dir + "征收集体土地构筑物、附属设施补偿标准.xlsx"); // 创建文件对象
            FileInputStream in = new FileInputStream(excelFile); // 文件流
            checkExcelVaild(excelFile);
            Workbook workbook = WorkbookFactory.create(in); // 这种方式 Excel2003/2007/2010都是可以处理的

//            int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
            /*
             * 设置当前excel中sheet的下标：0开始
             */
            Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet
            //获取总行数
            System.out.println(sheet.getLastRowNum());

            // 为跳过第一行目录设置count
            int count = 0;
            for (Row row : sheet)
                try {
                    // 跳过第一和第二行的目录
                    if (count < 2) {
                        count++;
                        continue;
                    }

                    //如果当前行没有数据，跳出循环
//                    if(row.getCell(0).toString().equals("")){
//                        return;
//                    }

                    //获取总列数(空格的不计算)
                    int columnTotalNum = row.getPhysicalNumberOfCells();
                    System.out.println("总列数：" + columnTotalNum);

                    System.out.println("最大列数：" + row.getLastCellNum());

                    //for循环的，不扫描空格的列
//                    for (Cell cell : row) {
//                    	System.out.println(cell);
//                    }
                    int end = row.getLastCellNum();
                    for (int i = 0; i < end; i++) {
                        Cell cell = row.getCell(i);
                        if (cell == null) {
                            System.out.print("null" + "\t");
                            continue;
                        }
                        Object obj = getValue(cell);
                        System.out.print(obj + "\t");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断文件是否是excel
     * @throws Exception 错误
     */
    public static void checkExcelVaild(File file) throws Exception {
        if (!file.exists()) {
            throw new Exception("文件不存在");
        }
        if (!(file.isFile() && (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))) {
            throw new Exception("文件不是Excel");
        }
    }

    public static Object getValue(Cell cell) {
        Object obj = null;
        switch (cell.getCellTypeEnum()) {
            case _NONE://什么都没有  -1
                obj = "";
                break;
            case NUMERIC://数值型  0
                obj = cell.getNumericCellValue();
                break;
            case STRING:// 字符串型  1
                obj = cell.getStringCellValue();
                break;
            case FORMULA://公式型  2
                obj = "";
                break;
            case BLANK://空值  3
                obj = "";
                break;
            case BOOLEAN://布尔型  4
                obj = cell.getBooleanCellValue();
                break;
            case ERROR://错误  5
                obj = cell.getErrorCellValue();
                break;
        }
        return obj;
    }

////1. 生成带公司logo的页眉
//    public void createHeader(XWPFDocument doc, String orgFullName, String logoFilePath) throws Exception {
//        /*
//         * 对页眉段落作处理，使公司logo图片在页眉左边，公司全称在页眉右边
//         * */
//        CTSectPr sectPr = doc.getDocument().getBody().addNewSectPr();
//        XWPFHeaderFooterPolicy headerFooterPolicy = new XWPFHeaderFooterPolicy(doc,     sectPr);
//        XWPFHeader header = headerFooterPolicy.createHeader(XWPFHeaderFooterPolicy.DEFAULT);
//
//        XWPFParagraph paragraph = header.getParagraphArray(0);
//        paragraph.setAlignment(ParagraphAlignment.LEFT);
//        paragraph.setBorderBottom(Borders.THICK);
//
//        CTTabStop tabStop = paragraph.getCTP().getPPr().addNewTabs().addNewTab();
//        tabStop.setVal(STTabJc.RIGHT);
//        int twipsPerInch =  1440;
//        tabStop.setPos(BigInteger.valueOf(6 * twipsPerInch));
//
//        XWPFRun run = paragraph.createRun();
//        setXWPFRunStyle(run,"新宋体",10);
//
//        /*
//         * 根据公司logo在ftp上的路径获取到公司到图片字节流
//         * 添加公司logo到页眉，logo在左边
//         * */
//        if (StringUtils.isNotEmpty(logoFilePath)) {
//            String imgFile = FileUploadUtil.getLogoFilePath(logoFilePath);
//            byte[] bs = FtpUtil.downloadFileToIo(imgFile);
//            InputStream is = new ByteArrayInputStream(bs);
//
//            XWPFPicture picture = run.addPicture(is, XWPFDocument.PICTURE_TYPE_JPEG, imgFile, Units.toEMU(80), Units.toEMU(45));
//
//            String blipID = "";
//            for(XWPFPictureData picturedata : header.getAllPackagePictures()) { //这段必须有，不然打开的logo图片不显示
//                blipID = header.getRelationId(picturedata);
//            }
//            picture.getCTPicture().getBlipFill().getBlip().setEmbed(blipID);
//            run.addTab();
//            is.close();
//        }
//
//        /*
//         * 添加字体页眉，公司全称
//         * 公司全称在右边
//         * */
//        if (StringUtils.isNotEmpty(orgFullName)) {
//            run = paragraph.createRun();
//            run.setText(orgFullName);
//            setXWPFRunStyle(run,"新宋体",10);
//        }
//    }

    //2. 生成带公司地址和电话的页脚
    public void createFooter(XWPFDocument document, String telephone, String orgAddress) throws Exception {
        /**
         * https://poi.apache.org/components/document/quick-guide-xwpf.html
         * http://svn.apache.org/repos/asf/poi/trunk/src/examples/src/org/apache/poi/xwpf/usermodel/examples/
         * http://svn.apache.org/repos/asf/poi/trunk/src/examples/src/org/apache/poi/xwpf/usermodel/examples/BetterHeaderFooterExample.java
         *
         * */

        try (XWPFDocument doc = document) {

            XWPFParagraph p = doc.createParagraph();

            XWPFRun r = p.createRun();
            r.setText("Some Text");
            r.setBold(true);
            r = p.createRun();
            r.setText("Goodbye");
            r.getCTR().addNewPgNum();


            // create header/footer functions insert an empty paragraph
            XWPFHeader head = doc.createHeader(HeaderFooterType.DEFAULT);
            head.createParagraph().createRun().setText("header");

            XWPFFooter foot = doc.createFooter(HeaderFooterType.DEFAULT);
            foot.createParagraph().createRun().setText("footer");

            try (OutputStream os = new FileOutputStream(new File("d:/header2.docx"))) {
                doc.write(os);
            }
        }

//        /*
//         * 生成页脚段落
//         * 给段落设置宽度为占满一行
//         * 为公司地址和公司电话左对齐，页码右对齐创造条件
//         * */
//        CTSectPr sectPr = document.getDocument().getBody().addNewSectPr();
//        XWPFHeaderFooterPolicy headerFooterPolicy = new XWPFHeaderFooterPolicy(document, sectPr);
//        XWPFFooter footer = headerFooterPolicy.createFooter(STHdrFtr.DEFAULT);
//        XWPFParagraph paragraph = footer.getParagraphArray(0);
//        paragraph.setAlignment(ParagraphAlignment.LEFT);
//        paragraph.setVerticalAlignment(TextAlignment.CENTER);
//        paragraph.setBorderTop(Borders.THICK);
//        CTTabStop tabStop = paragraph.getCTP().getPPr().addNewTabs().addNewTab();
//        tabStop.setVal(STTabJc.RIGHT);
//        int twipsPerInch = 1440;
//        tabStop.setPos(BigInteger.valueOf(6 * twipsPerInch));
//
//        /*
//         * 给段落创建元素
//         * 设置元素字面为公司地址+公司电话
//         * */
//        XWPFRun run = paragraph.createRun();
//        run.setText((StringUtils.isNotEmpty(orgAddress) ? orgAddress : "") + (StringUtils.isNotEmpty(telephone) ? "  " + telephone : ""));
//        setXWPFRunStyle(run, "仿宋", 10);
//        run.addTab();
//
//        /*
//         * 生成页码
//         * 页码右对齐
//         * */
//        run = paragraph.createRun();
//        run.setText("第");
//        setXWPFRunStyle(run, "仿宋", 10);
//
//        run = paragraph.createRun();
//        CTFldChar fldChar = run.getCTR().addNewFldChar();
//        fldChar.setFldCharType(STFldCharType.Enum.forString("begin"));
//
//        run = paragraph.createRun();
//        CTText ctText = run.getCTR().addNewInstrText();
//        ctText.setStringValue("PAGE  \\* MERGEFORMAT");
//        ctText.setSpace(SpaceAttribute.Space.Enum.forString("preserve"));
//        setXWPFRunStyle(run, "仿宋", 10);
//
//        fldChar = run.getCTR().addNewFldChar();
//        fldChar.setFldCharType(STFldCharType.Enum.forString("end"));
//
//        run = paragraph.createRun();
//        run.setText("页 总共");
//        setXWPFRunStyle(run, "仿宋", 10);
//
//        run = paragraph.createRun();
//        fldChar = run.getCTR().addNewFldChar();
//        fldChar.setFldCharType(STFldCharType.Enum.forString("begin"));
//
//        run = paragraph.createRun();
//        ctText = run.getCTR().addNewInstrText();
//        ctText.setStringValue("NUMPAGES  \\* MERGEFORMAT ");
//        ctText.setSpace(SpaceAttribute.Space.Enum.forString("preserve"));
//        setXWPFRunStyle(run, "仿宋", 10);
//
//        fldChar = run.getCTR().addNewFldChar();
//        fldChar.setFldCharType(STFldCharType.Enum.forString("end"));
//
//        run = paragraph.createRun();
//        run.setText("页");
//        setXWPFRunStyle(run, "仿宋", 10);

    }

//3.其中设置段落元素字体的方法

    /**
     * 设置页脚的字体样式
     *
     * @param r1 段落元素
     */
    private void setXWPFRunStyle(XWPFRun r1, String font, int fontSize) {
        r1.setFontSize(fontSize);
        CTRPr rpr = r1.getCTR().isSetRPr() ? r1.getCTR().getRPr() : r1.getCTR().addNewRPr();
        CTFonts fonts = rpr.isSetRFonts() ? rpr.getRFonts() : rpr.addNewRFonts();
        fonts.setAscii(font);
        fonts.setEastAsia(font);
        fonts.setHAnsi(font);
    }
}
