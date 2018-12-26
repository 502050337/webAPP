package com.veryqy.gen.util;


import com.veryqy.gen.test.Main;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.wp.usermodel.HeaderFooterType;
import org.apache.poi.xwpf.usermodel.*;
import org.jooq.DSLContext;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.net.URL;

public class ExcelUtil {

    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    /**
     * 读取Excel测试，兼容 Excel 2003/2007/2010
     */
    public static void main(String[] args) {
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

}
