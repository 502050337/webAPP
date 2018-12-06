package com.veryq.gen.bo;

import com.veryq.gen.dao.Excelimportdao;
import com.veryq.gen.util.CurrencyUtils;
import com.veryqy.jooq.tables.pojos.Commodity;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.List;

import static com.veryq.gen.util.ExcelUtil.*;

@Component
public class ExcelImportBo {


    @Autowired
    Excelimportdao dao;

    @Transactional
    public Integer excelimport(File excelFile) {
        int count = 0;
        try {
            FileInputStream in = new FileInputStream(excelFile); // 文件流
            checkExcelVaild(excelFile);
//            Workbook workbook = getWorkbok(in,excelFile);
            Workbook workbook = WorkbookFactory.create(in); // 这种方式 Excel2003/2007/2010都是可以处理的
//            int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
            Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet
//            System.out.println("Sheet的数量" + sheetCount);
//            System.out.println("总行数" + sheet.getLastRowNum());

            for (Row row : sheet) {
                Integer Commodity = getcommodity(row);
                count += Commodity;
            }
        } catch (Exception e) {
            count = -1;
            e.printStackTrace();
        }
        return count;
    }

    public List<Commodity> commodityquery() {
        return dao.commodityquery();
    }

    private Integer getcommodity(Row row) {
        Commodity model = new Commodity();
        if (row.getCell(0) != null) {
            model.setCategory(getValue(row.getCell(0)) + "");
        }
        if (row.getCell(1) != null) {
            model.setSubcategory(getValue(row.getCell(1)) + "");
        }
        if (row.getCell(2) != null) {
            model.setName(getValue(row.getCell(2)) + "");
        }
        if (row.getCell(3) != null) {
            model.setUnit(getValue(row.getCell(3)) + "");
        }
        if (row.getCell(4) != null) {

            if (getValue(row.getCell(4)).toString().contains("—")) {
                String price = StringUtils.substringBeforeLast(getValue(row.getCell(4)).toString(), "—");
                String price1 = CurrencyUtils.yuanToFen(price);
                model.setPrice(price1);
            } else if (getValue(row.getCell(4)).toString().contains("-")) {
                String price = StringUtils.substringBeforeLast(getValue(row.getCell(4)).toString(), "-");
                String price1 = CurrencyUtils.yuanToFen(price);
                model.setPrice(price1);
            } else {
                String price1 = CurrencyUtils.yuanToFen(getValue(row.getCell(4)) + "");
                model.setPrice(price1);
            }
        }
        if (row.getCell(5) != null) {
            model.setRemark(getValue(row.getCell(5)) + "");
        }
        if (row.getCell(6) != null) {
            model.setSubname(getValue(row.getCell(6)) + "");
        }
        if (row.getCell(7) != null) {
            model.setCol8(getValue(row.getCell(7)) + "");
        }
        if (row.getCell(8) != null) {
            model.setCol9(getValue(row.getCell(8)) + "");
        }

        return dao.add(model);
    }

}
