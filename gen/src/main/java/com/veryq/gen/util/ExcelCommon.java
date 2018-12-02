package com.veryq.gen.util;


import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

/**
 *
 * Excel公共封装类<br>
 * 说明：该类为Excel读、写的公共类包括:<br>
 * 1).获取单元格的值;<br>
 * 2).判断Sheet、Row、Cell是否存在;<br>
 * 3).加控制台遍历List<List<Object>>集合对象;<br>
 *
 *
 * @author 赖奇
 * @version 1.0
 * @since 2014-7-8
 */
public class ExcelCommon {
    /**
     *
     * 获取Cell的内容
     *
     * @param cell
     * @return 单元格的内容
     */
    protected static Object getCellValue(Cell cell) {
        Object obj = null;
        if(cell == null){
            return "";
        }
        int cellType = cell.getCellType();
        switch (cellType) {
            case Cell.CELL_TYPE_BOOLEAN:
                obj = cell.getBooleanCellValue();
                break;
            case Cell.CELL_TYPE_FORMULA:
                obj = cell.getCellFormula();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                obj = cell.getNumericCellValue();
                break;
            case Cell.CELL_TYPE_STRING:
                obj = cell.getStringCellValue();
                break;
            case Cell.CELL_TYPE_BLANK:
                obj = "";
                break;
            default:
                obj = cell.getRichStringCellValue();
                throw new RuntimeException("单元格为未知类型!");
        }
        return obj;
    }

    /**
     *
     * 验证Sheet表对象是否存在,返回Boolean结果
     *
     * @param sheet
     *            验证的Sheet表对象
     * @return 是否存在Sheet表的Boolean值
     */
    protected static boolean isExistSheet(Sheet sheet) {
        return isExist(sheet);
    }

    /**
     *
     * 验证一行对象是否存在,返回Boolean结果
     *
     * @param row
     *            验证的行对象
     * @return 是否存在行的Boolean值
     */
    protected static boolean isExistRow(Row row) {
        return isExist(row);
    }

    /**
     *
     * 验证一单元格是否存在 ,返回Boolean结果
     *
     * @param cell
     *            验证的单元格对象
     * @return 是否存在列的Boolean值
     */
    protected static boolean isExistCell(Cell cell) {
        return isExist(cell);
    }

    /**
     * 对象是否为空对象
     *
     * @param object
     *            验证的对象
     * @return 对象是否为空
     */
    protected static boolean isExist(Object object) {
        if (object == null) {
            return false;
        }
        return true;
    }

    /**
     *
     * 控制台遍历出List<List<Object>>对象
     *
     * @param datas
     */
    public static void control(List<List<Object>> datas) {
        for (int i = 0; i < datas.size(); i++) {
            List<Object> rowData = datas.get(i);
            StringBuffer sbf = new StringBuffer("第【" + i + "】行：");
            for (Object object : rowData) {
                sbf.append("\t" + String.valueOf(object));
            }
            System.out.println(sbf.toString());
        }
    }
}