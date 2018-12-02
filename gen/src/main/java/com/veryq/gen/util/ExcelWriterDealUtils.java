package com.veryq.gen.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * Excel文件写入封装 使用说明：<br>
 * 1、使用loadWorkbook(String excelFilePath)方法加载Workbook工作薄对象,即可使用静态workbook对象;<br>
 * 2、使用saveFile()方法保存Workbook内容到文件中,并关闭文件流; <br>
 * 3、使用setRowValue(Row row, List<Object> rowData)方法设置一行数据,并返回修改后的Row行对象; <br>
 * 4、使用setCellValue(Cell cell, Object value)方法设置单元格值,并返回修改后的Cell单元格对象; <br>
 * 5、使用createCellStyle(boolean isContentStyle)方法创建单元格样式,isContentStyle设置是否为文本样式,还有一种是表头样式;<br>
 * 6、使用setSheetAndHead(String sheetName, String[] headCellContent)方法同时创建Sheet并设置一行列头;起到简化的作用,返回Sheet;<br>
 * 7、使用setGivenRowDatas(Sheet sheet, int startRowIndex, List<List<Object>> rowsDatas方法设置从给定Sheet表、给定开始行批量新增、更新内容<br>
 * 8、使用isExistRow(Row row)方法验证一行对象是否存在,返回Boolean结果;<br>
 * 9、使用isExistRow(Sheet sheet, int rowIndex)方法验证指定Sheet表下的下标索引行是否存在,存在则返回原行对象,不存在则创建Row对象后返回 <br>
 * 10、使用isExistCell(Cell cell)方法验证一单元格是否存在 ,返回Boolean结果 <br>
 * 11、使用isExistCell(Row row, int cellIndex)方法验证指定Row行的单元格下标索引是否存在,存在则返回原单元格对象,不存在则创建单元格对象后返回 <br>
 * 12、使用saveFile(Workbook workbook, String saveExcelPath)方法进行保存,此方法是该类中的saveFile()方法的扩展,适用于外部,并适用于空内容的Exce文件操作;
 *
 * @author 赖奇
 * @version 1.0
 * @since 2014-6-26
 */
public class ExcelWriterDealUtils extends ExcelCommon {

    /**
     * 工作薄对象
     */
    protected static Workbook workbook;

    /**
     * 写入Excel文件路径
     */
    protected static String excelFilePath;

    /**
     * 文件读取流
     */
    private static FileInputStream fis;

    /**
     *
     * 加载Workbook工作薄对象,即可使用静态workbook对象
     *
     * @param excelFilePath
     *            Excel文件路径
     */
    public static void loadWorkbook(String excelFilePath) {
        // try
        // {
        ExcelWriterDealUtils.excelFilePath = excelFilePath;
        // saveFile(new XSSFWorkbook() , excelFilePath);
        // fis = new FileInputStream(excelFilePath);
        if (excelFilePath.endsWith(".xlsx")) {
            workbook = new XSSFWorkbook();
        } else if (excelFilePath.endsWith(".xls")) {
            workbook = new HSSFWorkbook();
        }
        // }
        // catch (IOException e)
        // {
        // e.printStackTrace();
        // }
    }

    /**
     *
     * 保存Workbook内容到文件中
     */
    public static void saveFile() {
        FileOutputStream fos = null;
        try {
            if (fis != null) {
                fis.close();// 先关闭
            }
            fos = new FileOutputStream(excelFilePath);
            workbook.write(fos);
            fos.flush();
            System.out.println(excelFilePath + ":文件写入成功...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();// 关闭读取流
                }
                if (fos != null) {
                    fos.close();// 关闭文件流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * 保存一个为Excel的文件
     *
     * @param workbook
     *            工作薄对象
     * @param saveExcelPath
     *            保存到Excel的文件路径
     */
    public static void saveFile(Workbook workbook, String saveExcelPath) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(saveExcelPath);
            workbook.createSheet("Sheet1");
            workbook.write(fos);
            fos.flush();
            // System.out.println(excelFilePath + ":文件写入成功...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();// 关闭文件流
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *
     * 设置一行的数据,返回设置后的行对象
     *
     * @param row
     *            行对象
     * @param rowData
     *            行数据
     * @return 设置后的行对象
     */
    public static Row setRowValue(Row row, List<Object> rowData) {
        for (int i = 0; i < rowData.size(); i++) {
            Cell cell = isExistCell(row, i);
            setCellValue(cell, rowData.get(i));
        }
        return row;
    }

    /**
     *
     * 设置单元格值
     *
     * @param cell
     *            需要设置的单元格
     * @param value
     *            设置给单元格cell的值
     * @return 设置好的单元格列对象
     */
    public static Cell setCellValue(Cell cell, Object value) {
        if (value instanceof String) {
            cell.setCellValue((String) value);
            cell.setCellType(Cell.CELL_TYPE_STRING);
        } else if (value instanceof Date) {
            cell.setCellValue((Date) value);
            cell.setCellType(Cell.CELL_TYPE_STRING);
        } else if (value instanceof Boolean) {
            cell.setCellValue((Boolean) value);
            cell.setCellType(Cell.CELL_TYPE_BOOLEAN);
        } else if (value instanceof Double) {
            cell.setCellValue((Double) value);
            cell.setCellType(Cell.CELL_TYPE_NUMERIC);
        } else if (value instanceof Calendar) {
            cell.setCellValue((Calendar) value);
            cell.setCellType(Cell.CELL_TYPE_STRING);
        } else if (value instanceof RichTextString) {
            cell.setCellValue((RichTextString) value);
            cell.setCellType(Cell.CELL_TYPE_STRING);
        } else {
            cell.setCellValue(String.valueOf(value));
            cell.setCellType(Cell.CELL_TYPE_STRING);
            // System.out.println("错误提示: 您设置的单元格内容【"+value+"】不符合要求,不是常用类型!");
        }
        return cell;
    }

    /**
     *
     * 创建单元格样式： 内容样式、表格列头样式
     *
     * @param isContentStyle
     *            是否为内容样式
     * @return 单元格样式
     */
    public static CellStyle createCellStyle(boolean isContentStyle) {
        CellStyle cellStyle = workbook.createCellStyle();
        if (isContentStyle) {

        } else {

        }
        return cellStyle;
    }

    /**
     *
     * 创建指定的Sheet表名称及表头,返回Sheet表对象
     *
     * @param sheetName
     *            Sheet表名称
     * @param headCellContent
     *            表头列属性
     * @return 返回创建好后的Sheet表对象
     */
    public static Sheet setSheetAndHead(String sheetName,
                                        String[] headCellContent) {
        Sheet sheet = isExistSheet(sheetName);
        Row headRow = isExistRow(sheet, 0);
        List<Object> headRowDatas = new ArrayList<Object>();
        for (String headCellValue : headCellContent) {
            headRowDatas.add(headCellValue);
        }
        setRowValue(headRow, headRowDatas);
        return sheet;
    }

    /**
     *
     * 设置从给定Sheet表、给定开始行批量新增、更新内容,返回结束行下标索引
     *
     * @param sheet
     *            指定Sheet表
     * @param startRowIndex
     *            新增、更新开始行索引号
     * @param rowsDatas
     *            行内容数据
     * @return 返回Sheet表更新、新增后的行号
     */
    public static int setGivenRowDatas(Sheet sheet, int startRowIndex,
                                       List<List<Object>> rowsDatas) {
        int rowSize = rowsDatas.size();
        int endIndex = startRowIndex + rowSize;
        for (int i = 0; i < rowSize; i++) {
            Row row = isExistRow(sheet, startRowIndex + i);
            setRowValue(row, rowsDatas.get(i));
        }
        return endIndex;
    }

    /**
     *
     * 验证指定Sheet表名称是否存在,存在则返回原Sheet表对象,不存在则创建Sheet表对象后返回
     *
     * @param sheetName
     *            需要验证的Sheet表名称
     * @return Sheet表(存在就返回,不存在就新建)
     */
    public static Sheet isExistSheet(String sheetName) {
        Sheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) {
            return workbook.createSheet(sheetName);
        } else {
            System.out.println("错误提示: 您设置的Sheet表名称【" + sheetName
                    + "】已存在,请重新设置!");
            return sheet;
        }
    }

    /**
     *
     * 验证指定Sheet表下的下标索引行是否存在,存在则返回原行对象,不存在则创建Row对象后返回
     *
     * @param sheet
     *            指定的Sheet对象
     * @param rowIndex
     *            指定的下标索引行号
     * @return Row行(存在就返回,不存在就新建)
     */
    public static Row isExistRow(Sheet sheet, int rowIndex) {
        Row row = sheet.getRow(rowIndex);
        if (row == null) {
            return sheet.createRow(rowIndex);
        } else {
            // System.out.println("警告提示: 您设置的Sheet表名称【"+sheet.getSheetName()+"】中的第【"+rowIndex+"】行已存在!");
            return row;
        }
    }

    /**
     *
     * 验证指定Row行的单元格下标索引是否存在,存在则返回原单元格对象,不存在则创建单元格对象后返回
     *
     * @param row
     *            指定的Row行对象
     * @param cellIndex
     *            指定的下标索引单元格列号
     * @return Cell行(存在就返回,不存在就新建)
     */
    public static Cell isExistCell(Row row, int cellIndex) {
        Cell cell = row.getCell(cellIndex);
        if (cell == null) {
            return row.createCell(cellIndex);
        } else {
            System.out.println("指定的列已存在");
            return cell;
        }
    }

    /**
     *
     * 设置单元格合并
     *
     * @param sheet
     *            指定合并的Sheet表
     * @param firstRow
     *            开始行
     * @param lastRow
     *            结束行
     * @param firstCol
     *            开始列
     * @param lastCol
     *            结束列
     */
    public static void setCellMerge(Sheet sheet, int firstRow, int lastRow,
                                    int firstCol, int lastCol) {
        sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol,
                lastCol));
    }

    /**
     *
     * 设置指定列的单元格内如如果相同则进行单元格合并（需修改）
     *
     * @param sheet
     *            Sheet表
     * @param headRowData
     *            开始行数据
     * @param mergeCells
     *            合并的单元格列
     * @param startRow
     *            开始行
     */
    public static void setCellMerge(Sheet sheet,
                                    Map<Object, Object> headRowData, String[] mergeCells, int startRow) {
        if (headRowData.keySet().containsAll(Arrays.asList(mergeCells))) {
            int lastRowNum = sheet.getLastRowNum();
            if (lastRowNum > 0) {
                int temp = startRow;
                for (String mergeCell : mergeCells) {
                    Integer cellIndex = (Integer) headRowData.get(mergeCell);
                    Row row = sheet.getRow(startRow);
                    if (row == null) {
                        continue;
                    }
                    Cell cell2 = row.getCell(cellIndex);
                    if (cell2 == null) {
                        continue;
                    }
                    Object cellValue = getCellValue(cell2);
                    int startMergerIndex = startRow;

                    while (startRow < (lastRowNum - 1)) {
                        Row eqRow = sheet.getRow(++startRow);
                        Cell cell = eqRow.getCell(cellIndex);
                        Object cellValue2 = getCellValue(cell);
                        System.out.println(cellValue + "\t" + cellValue2);
                        // 相同进行合并
                        if (!cellValue2.equals(cellValue)) {
                            System.out.println("里：" + startMergerIndex + "\t"
                                    + lastRowNum + "\t" + cellIndex + "\t"
                                    + cellIndex);
                            setCellMerge(sheet, startMergerIndex, startRow - 1,
                                    cellIndex, cellIndex);
                            startMergerIndex = startRow;
                            cellValue = cellValue2;
                        }
                    }
                    System.out.println(startMergerIndex + "\t" + lastRowNum
                            + "\t" + cellIndex + "\t" + cellIndex);
                    setCellMerge(sheet, startMergerIndex, lastRowNum,
                            cellIndex, cellIndex);
                    startRow = temp;
                }
            }
        } else {
            System.out.println("错误提示: 你需要合并的列不存在!");
        }
    }
}
