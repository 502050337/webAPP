package com.veryq.gen.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


/**
 *
 * Excel文件读取封装 使用说明：<br>
 * 1、使用loadExcelFile(String excelFilePath)方法加载Excel文件,即可使用workbook静态对象;<br>
 * 2、使用closeDestory()方法销毁文件流,即调用该方法后,类资源不可用;<br>
 * 3、使用Map<Object, Object> getRowDataToMap(Row row, boolean isValueKey), 需了解参数isValueKey的意义,获取Excel文件一行的内容,以Map存储,该方法常用于Excel表格头列的获取;<br>
 * 4、使用List<String> getRowDataToList(Row row)方法 获取Excel文件一行的内容,以List存储,List可包含重复值,常用于正文内容的获取;<br>
 * 5、使用Map<Object, List<String>> getBatchRowDataToList(Sheet sheet, int startRowIndex, int endRowIndex) 批量查询,获取Excel文件中指定开始下标索引与结束下标索引号之间的内容;<br>
 * 6、使用Object getCellValue(Cell cell)方法获取指定单元格的内容;<br>
 * 7、使用getGivenSheetDatas(String excelFilePath, String[] sheetNames, int headIndex, String[] attributes, boolean isMerge, String[] mergeAttributes)<br>
 *      获取指定Excel文件、指定Sheet集、指定表格列集、指定需要合并列的内容 ,适用于较大数据,使用该方法不需要loadExcelFile()以及closeDestory()方法; 整个的加载Excel文件与关闭、销毁文件流自动在方法体完成;
 * 8、使用getByGivenAttributeAndRowValue(Map<Object, Object> headDataMap, Row row, String[] attributes) 获取一行指定列的数据集;<br>
 * 9、使用getMergeCellRowsData(Sheet sheet, Map<Object, Object> headRowData, int rowIndex, String[] attributes, String mergeAttribute, boolean isMerge, String[] mergeAttributes) 根据指定Sheet表及开始行进行获取一个合并单元集;<br>
 * 10、使用getCellToDate(Object cellDateValue)将读取到的Cell单元格为日期类型时,通过表示5位数的Double类型,转换成Java的Date <br>
 * 11、使用deleteRows(Sheet sheet, int startRow, int endRow)方法删除指定开始至结束行,并保存至原路径中;<br>
 * 12、使用getExcelWorkbook()方法获取加载Excel文件后的Workbook对象<br>
 *
 * 注意：deleteRows方法未完善,由于此方法不用于查询的功能范围内
 * @author qiqitrue
 * @version 1.0
 * @since 2015-1-5
 */
public class ExcelReadDealUtils extends ExcelCommon {
    /**
     * excel工作对象
     */
    public static Workbook workbook;

    /**
     * excel文件流,用于closeDestory销毁一次打开会话
     */
    private static FileInputStream fis;

    /**
     * 使用示例
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 加载excel文件对象
        loadExcelFile("D:/新建 Microsoft Excel 工作表.xlsx");
        // 获取指定sheet名称的excel Sheet对象
        Sheet sheet = workbook.getSheet("Sheet1");
        // 验证是否存在,有些时候没有必要验证
        if (isExistSheet(sheet)) {
            // 获取Sheet最后行号
            int lastRowNum = sheet.getLastRowNum();
            // 获取表头转换成Map形式存储
            Map<Object, Object> headMap = getRowDataToMap(sheet.getRow(0), true);
            // 定义要获取Excel中的表头列
            String[] attributes = new String[] { "关联ID", "英文名", "中文名", "时间",
                    "台风编号", "强度等级", "纬度", "经度", "风速", "阵风", "气压", "风向", "移速",
                    "6级风圈", "7级风圈", "8级风圈", "10级风圈" };
            // 从索引为2开始，需注意根据实际情况来定
            for (int i = 2; i <= lastRowNum; i++) {
                // 获取行对象
                Row row = sheet.getRow(i);
                // 验证是否存在行
                if (isExistRow(row)) {
                    // 获取一行指定列的信息
                    List<Object> byGivenAttributeAndRowValue = getByGivenAttributeAndRowValue(headMap, row, attributes);
                    for (int j = 0; j < byGivenAttributeAndRowValue.size(); j++) {
                        // 特殊的单元格，日期处理
                        if (j == 3) {
                            System.out.print(getCellToDate(byGivenAttributeAndRowValue.get(j)) + "\t");
                        }
                        // 普通的单元格，转换成字符串输出
                        else {
                            System.out.print(String.valueOf(byGivenAttributeAndRowValue.get(j)) + "\t");
                        }
                    }
                    System.out.println();
                }
            }
        }
        // 销毁打开会话的文件
        closeDestory();
    }

    /**
     *
     * 加载Excel文件,创建Workbook对象
     *
     * @param excelFilePath
     *            Excel文件路径
     */
    public static void loadExcelFile(String excelFilePath) {
        try {
            fis = new FileInputStream(excelFilePath);
            if (excelFilePath.endsWith(".xlsx")) {
                workbook = new XSSFWorkbook(fis);
            } else if (excelFilePath.endsWith(".xls")) {
                workbook = new HSSFWorkbook(fis);
            } else {
                throw new RuntimeException("错误提示: 您设置的Excel文件名不合法!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取Excel文件的Workbook对象
     * @return
     */
    public static Workbook getExcelWorkbook(){
        if(!isExist(workbook)){
            throw new RuntimeException("错误提示：请先进行Excel加载,初始化Workbook对象!");
        }
        return workbook;
    }


    /**
     *
     * 关闭Excel文件流
     * @throws IOException
     */
    public static void closeDestory() throws IOException {
        if(fis == null){
            throw new RuntimeException("错误提示：Excel文件未加载或未初始化文件!");
        }
        fis.close();
    }

    /********************************************row行操作********************************************/

    /**
     *
     * 获取一行的内容,Map存储,存储方式由参数定义
     *
     * @param row
     *            行对象
     * @param isValueKey
     *            是否以单元格内容作为Key?key为单元格内容, value为下标索引：key为下标索引, value为单元格内容
     * @return 一行的内容,Map存储
     */
    public static Map<Object, Object> getRowDataToMap(Row row, boolean isValueKey) {
        Map<Object, Object> headDatas = new HashMap<Object, Object>();
        short countCellNum = row.getLastCellNum();
        // 在外面判断isValueKey是为了提高效率,放在循环体中降低效率
        if (isValueKey) {
            for (int j = 0; j < countCellNum; j++) {
                Cell cell = row.getCell(j);
                if (isExistCell(cell)) {
                    // Key=单元格内容, Value=下标索引
                    headDatas.put(getCellValue(cell), j);
                }
            }
        } else {
            for (int j = 0; j < countCellNum; j++) {
                Cell cell = row.getCell(j);
                if (isExistCell(cell)) {
                    // Key=下标索引, Value=单元格内容
                    headDatas.put(j, getCellValue(cell));
                }
            }
        }
        return headDatas;
    }

    /**
     *
     * 获取一行的内容,List存储
     *
     * @param row
     *            行对象
     * @return 一行的内容
     */
    public static List<Object> getRowDataToList(Row row) {
        List<Object> rowData = new ArrayList<Object>();
        if (isExistRow(row)) {
            short countCellNum = row.getLastCellNum();
            for (int i = 0; i < countCellNum; i++) {
                Cell cell = row.getCell(i);
                if (isExistCell(cell)) {
                    rowData.add(getCellValue(cell));
                }
            }
        }
        return rowData;
    }

    /**
     *
     * 获取sheet批量行内容，以List存储
     *
     * @param sheet
     *            Sheet表对象
     * @param startRowIndex
     *            开始行下标索引号
     * @param endRowIndex
     *            结束行下标索引号
     * @return 批量内容行内容
     */
    public static List<List<Object>> getBatchRowDataToList(Sheet sheet, int startRowIndex, int endRowIndex) {
        List<List<Object>> batchDatas = new ArrayList<List<Object>>();
        if(startRowIndex > endRowIndex){
            throw new RuntimeException("错误提示：开始行不能大于结束行!");
        }
        // 获取sheet总行数
        int lastRowNum = sheet.getLastRowNum();
        if(startRowIndex > lastRowNum || endRowIndex > lastRowNum){
            throw new RuntimeException("错误提示：开始行或结束行不能超过sheet最大行数!");
        }
        for (int i = startRowIndex; i <= endRowIndex; i++) {
            Row row = sheet.getRow(i);
            batchDatas.add(getRowDataToList(row));// 此处不需要验证row是否为空,在底层getRowData已验证
        }
        return batchDatas;
    }


    /**
     *
     * 获取指定Excel文件、指定Sheet集、指定表格列集、指定需要合并列的数据
     *
     * @param excelFilePath
     *            Excel文件路径,包括Excel文件名
     * @param sheetNames
     *            要解析的Sheet名称集,null表示全部获取
     * @param headIndex
     *            Sheet表头下标,从0开始
     * @param attributes
     *            需要获取Excel列
     * @param isMerge
     *            是否需要合并的列,若为false,mergeAttributes可设置为null
     * @param mergeAttributes
     *            需要合并的列(在需要获取Excel列中)
     * @return 整个Excel处理后的数据
     * @throws IOException
     */
    public static List<List<Object>> getGivenSheetDatas(String excelFilePath, String[] sheetNames, int headIndex, String[] attributes, boolean isMerge, String[] mergeAttributes) throws IOException {
        // 定义存储Excel内容集合,List<Object>表示一行的内容
        List<List<Object>> excelDatas = new ArrayList<List<Object>>();
        // 列表头,key=单元格内容,value=列下标索引号
        Map<Object, Object> headDatasMap = new HashMap<Object, Object>();
        // 加载文件
        loadExcelFile(excelFilePath);
        // 定义需进行解析的Sheet集
        List<Sheet> sheets = new ArrayList<Sheet>();
        // 按指定的Sheet进行解析
        if (sheetNames != null) {
            for (int i = 0; i < sheetNames.length; i++) {
                // 获取第i个Sheet表对象
                Sheet sheet = workbook.getSheet(sheetNames[i]);
                if (!isExistSheet(sheet)) {
                    throw new RuntimeException("错误提示: 您指定的Sheet集中的【" + sheetNames[i]    + "】不存在,请检查原Excel文件!");
                }
                // 添加至解析的Sheet集中
                else {
                    sheets.add(sheet);
                }
            }
        }
        // 没有指定Sheet,则全部
        else {
            int length = workbook.getNumberOfSheets();
            for (int i = 0; i < length; i++) {
                Sheet sheet = workbook.getSheet(workbook.getSheetName(i));
                sheets.add(sheet);
            }
        }
        // 以上是获取需要读取的Sheet表
        for (Sheet sheet : sheets) {
            // 获取表头列行是否存在
            Row headRow = sheet.getRow(headIndex);
            if (headRow == null) {
                System.out.println("错误提示: 您指定的表格列头行【" + headIndex + "】不存在!");
            }
            // 存在着指定的表头列行
            else {
                // 转换成Map,Key=表头列名称,Value=列名称下标索引
                headDatasMap = getRowDataToMap(headRow, true);
                int eqCount = 0;// 实际存在的列个数
                // 定义需要获取到的列在实际中不存在的列集合
                List<String> noEqAttributes = new ArrayList<String>();
                for (String attribute : attributes) {
                    if (headDatasMap.get(attribute) != null) {
                        eqCount++;
                    }
                    // 不存在的列数
                    else {
                        noEqAttributes.add(attribute);
                    }
                }
                System.out.println("提示：Sheet表名称为[" + sheet.getSheetName()   + "]中需导入的列数与存在的列数之比：" + attributes.length + ":" + eqCount);
                if (attributes.length != eqCount) {
                    System.out.println("错误提示: 实际不存在的属性集(程序中需要获取的列在Sheet中不存在的列)：");
                    for (int j = 0; j < noEqAttributes.size(); j++) {
                        System.out.print(noEqAttributes.get(j) + "\t");
                    }
                    System.out.println();
                }
                // 全部等于进行解析该Sheet页的所有内容
                else {
                    // 获取当前Sheet表总行数
                    int rowCount = sheet.getLastRowNum();
                    // 从索引号为列头行号索引+1开始进行读取
                    for (int k = (headIndex + 1); k <= rowCount; k++) {
                        Row row = sheet.getRow(k);
                        if (!isExistRow(row)) {
                            System.out.println("错误提示: 在第" + k + "行出现空行。");
                            continue;
                        }
                        // 一行数据
                        List<Object> rowDatas = getByGivenAttributeAndRowValue(headDatasMap, row, attributes);
                        excelDatas.add(rowDatas);// 添加一行数据
                    }
                }
            }
        }
        // 需要合并
        if (isMerge) {
            // 记录需要合并的列Index
            List<Integer> mergerIndex = new ArrayList<Integer>();
            for (String mergerAttribute : mergeAttributes) {
                Integer integerIndex = (Integer) headDatasMap.get(mergerAttribute);
                if (integerIndex != null) {
                    mergerIndex.add(integerIndex);
                }
            }
            for (int i = 0; i < excelDatas.size(); i++) {
                List<Object> rowDatas = excelDatas.get(i);
                for (int j = 0; j < mergerIndex.size(); j++) {
                    if (rowDatas.get(mergerIndex.get(j)).equals("")) {
                        // 在第一行不为空的情况下
                        if (i != 0) {
                            Object value = excelDatas.get(i - 1).get(mergerIndex.get(j));
                            rowDatas.set(mergerIndex.get(j), value);
                        }
                    }
                }
            }
        }
        closeDestory();
        return excelDatas;
    }

    /**
     *
     * 获取一行指定列的数据集
     *
     * @param headDataMap
     *            表列头Map数据,key=单元格内容,value为下标索引号
     * @param row
     *            需获取的指定行
     * @param attributes
     *            需获取的指定单元格
     * @return 一行指定列的数据集
     */
    public static List<Object> getByGivenAttributeAndRowValue(Map<Object, Object> headDataMap, Row row, String[] attributes) {
        List<Object> datas = new ArrayList<Object>();
        for (int i = 0; i < attributes.length; i++) {
            Integer index = (Integer) headDataMap.get(attributes[i]);
            if(index == null){
                System.out.println("查询列："+attributes[i]+"失败！");
            }
            else{
                Cell cell = row.getCell(index);
                Object cellValue = getCellValue(cell);
                if (cellValue == null) {
                    cellValue = "";
                }
                datas.add(cellValue);
            }

        }
        return datas;
    }

    /**
     *
     * 根据指定Sheet表及开始行进行获取一个合并单元集,若没理解,好比是从数据库中只取一个表,并把表的所有字段返回
     *
     * @param sheet
     *            指定Sheet表对象
     * @param headRowData
     *            表头列,使用getRowDataToMap(Row, boolean)方法获取
     * @param rowIndex
     *            开始行对象,即有内容的开始行
     * @param attributes
     *            需要获取的单元格列对象
     * @param mergeAttribute
     *            根据那一个单元格进行合并
     * @param isMerge
     *            是否需要合并
     * @param mergeAttributes
     *            需要合并的单元格集
     * @return 返回一个合并单元集
     */
    public static List<List<Object>> getMergeCellRowsData(Sheet sheet,Map<Object, Object> headRowData, int rowIndex, String[] attributes, String mergeAttribute, boolean isMerge, String[] mergeAttributes) {
        List<List<Object>> rowsData = null;
        // 需要获取的单元格列名称在表格表头行中完全存在
        if (headRowData.keySet().containsAll(Arrays.asList(attributes))) {
            Row row = sheet.getRow(rowIndex);
            // 存在的列索引
            Integer existCellIndex = (Integer) headRowData.get(mergeAttribute);
            Cell cell = row.getCell(existCellIndex);
            Object cellValue = getCellValue(cell);
            if (String.valueOf(cellValue).isEmpty()) {// 值是空的
                System.out.println("错误提示: 给定的行【" + rowIndex + "】的【"+ mergeAttribute + "】为空, 请检查!");
            } else {
                rowsData = new ArrayList<List<Object>>();
                rowsData.add(getByGivenAttributeAndRowValue(headRowData, row, attributes));// 第一行
                while (true) {
                    Row row2 = sheet.getRow(++rowIndex);
                    Cell cell2 = row2.getCell(existCellIndex);
                    if (String.valueOf(getCellValue(cell2)).isEmpty()) {
                        rowsData.add(getByGivenAttributeAndRowValue(headRowData, row2, attributes));
                    } else {
                        // 需要合并
                        if (isMerge) {
                            // 记录需要合并的列Index
                            List<Integer> mergerIndex = new ArrayList<Integer>();
                            for (String mergerAttribute : mergeAttributes) {
                                Integer integerIndex = (Integer) headRowData.get(mergerAttribute);
                                if (integerIndex != null) {
                                    mergerIndex.add(integerIndex);
                                }
                            }
                            for (int i = 0; i < rowsData.size(); i++) {
                                List<Object> rowDatas = rowsData.get(i);
                                for (int j = 0; j < mergerIndex.size(); j++) {
                                    if (rowDatas.get(mergerIndex.get(j)).equals("")) {
                                        // 在第一行不为空的情况下
                                        if (i != 0) {
                                            Object value = rowsData.get(i - 1).get(mergerIndex.get(j));
                                            rowDatas.set(mergerIndex.get(j), value);
                                        }
                                    }
                                }
                            }
                        }
                        return rowsData;
                    }
                }
            }
        } else {
            System.out.println("错误提示: 要获取表头列在【" + sheet.getSheetName() + "】中的列头不完全存在, 请检查!");
        }
        return rowsData;// 此时这里是返回Null
    }

    /**
     *
     * 将读取到的Cell单元格为日期类型时,通过表示5位数的Double类型,转换成Java的Date
     *
     * @param cellDateValue
     *            单元格日期类型
     * @return 返回Java Date类型
     */
    public static Date getCellToDate(Object cellDateValue) {
        if(cellDateValue == null || cellDateValue.equals("")){
            return null;
        }
        double parseDouble = Double.parseDouble(cellDateValue.toString());
        Date javaDate = HSSFDateUtil.getJavaDate(parseDouble);
        return javaDate;
    }

    /**
     *
     * 指定Sheet表中进行删除指定开始到结束行中间的行
     *
     * @param sheet
     *            指定的Sheet表
     * @param startRow
     *            指定的开始行
     * @param endRow
     *            指定的结束行
     */
    public static void deleteRows(Sheet sheet, int startRow, int endRow) {
        int lastRowNum = sheet.getLastRowNum();
        // 开始删除行与结束删除行的范围在该Sheet里
        if (startRow < lastRowNum && endRow < lastRowNum) {
            sheet.shiftRows(startRow, endRow, -1);// 删除从startRow行到endRow行，然后使下方单元格上移
        }
        // 待添加保存处理
    }

    /**
     *
     * 指定Sheet表中查找关键字
     *
     * @param sheet
     *            指定Sheet表
     * @param keyWord
     *            查找的关键字
     * @param isGoEnd
     *            是否一找到底,如果找到一个了,就返回,还是继续找
     * @return 返回控制台提示信息
     */
    public static String isExistKeyWord(Sheet sheet, String keyWord, boolean isGoEnd) {
        if (isExistSheet(sheet)) {
            StringBuffer sbf = new StringBuffer();
            int findCount = 0;
            int lastRowNum = sheet.getLastRowNum();
            for (int i = 0; i <= lastRowNum; i++) {
                Row row = sheet.getRow(i);
                if (isExistRow(row)) {
                    short lastCellNum = row.getLastCellNum();
                    for (int j = 0; j <= lastCellNum; j++) {
                        Cell cell = row.getCell(j);
                        if (isExistCell(cell)) {
                            Object cellValue = getCellValue(cell);
                            if (cellValue == null) {
                                continue;
                            } else {
                                if (String.valueOf(cellValue).contains(keyWord)) {
                                    // 整个Sheet不停歇地找
                                    if (isGoEnd) {
                                        findCount++;
                                        // 此处需加一个换行符
                                        StringBuffer temp = new StringBuffer("提示：在Sheet表为【"+ sheet.getSheetName()   + "】中的第【" + i + "】行【"   + j + "】列查找到关键字【"   + keyWord + "】\n");
                                        System.out.println(temp.toString());
                                        sbf.append(temp);
                                    } else {
                                        return "提示：在Sheet表为【"   + sheet.getSheetName() + "】中的第【" + i + "】行【" + j + "】列查找到关键字【" + keyWord + "】";
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("查找结束提示：在Sheet表为【" + sheet.getSheetName()    + "】中总计找到关键字【" + keyWord + "】个数：" + findCount);
            return sbf.toString();
        }
        return null;// 即表示不存在
    }
}