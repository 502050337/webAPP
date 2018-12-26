package com.veryqy.gen.bo;

import com.veryqy.gen.dao.ContractorDao;
import com.veryqy.gen.model.Contractor;
import com.veryqy.gen.model.Order;
import com.veryqy.gen.util.ExcelUtil;
import com.veryqy.jooq.tables.pojos.Commodity;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;


@Service
public class ContractorService {

    private final ContractorDao dao;

    @Autowired
    public ContractorService(ContractorDao dao) {
        this.dao = dao;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.substringAfterLast("220-100-300","-"));
    }

    @Transactional
    public Integer excelimport(File excelFile) {
        int count = 0;
        try {
            FileInputStream in = new FileInputStream(excelFile); // 文件流
            ExcelUtil.checkExcelVaild(excelFile);
//            Workbook workbook = getWorkbok(in,excelFile);
            Workbook workbook = WorkbookFactory.create(in); // 这种方式 Excel2003/2007/2010都是可以处理的
//            int sheetCount = workbook.getNumberOfSheets(); // Sheet的数量
            Sheet sheet = workbook.getSheetAt(0);   // 遍历第一个Sheet

            for (Row row : sheet) {
                if (count < 1) {
                    count++;
                    continue;
                }
                Integer commodity = saveCommodity(row);
                count += commodity;
                System.out.println("count = " + count);
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


    private Integer saveCommodity(Row row) {
        Commodity model = new Commodity();
        if (row.getCell(0) != null) {
            model.setCategory(ExcelUtil.getValue(row.getCell(0)) + "");
        }
        if (row.getCell(1) != null) {
            model.setSubcategory(ExcelUtil.getValue(row.getCell(1)) + "");
        }
        if (row.getCell(2) != null) {
            model.setName(ExcelUtil.getValue(row.getCell(2)) + "");
        }
        if (row.getCell(3) != null) {
            model.setUnit(ExcelUtil.getValue(row.getCell(3)) + "");
        }
        if (row.getCell(4) != null) {

            if (ExcelUtil.getValue(row.getCell(4)).toString().contains("—")) {
                String price = StringUtils.substringAfterLast(ExcelUtil.getValue(row.getCell(4)).toString(), "—");
                model.setPrice(price);
            } else if (ExcelUtil.getValue(row.getCell(4)).toString().contains("-")) {
                String price = StringUtils.substringAfterLast(ExcelUtil.getValue(row.getCell(4)).toString(), "-");
                model.setPrice(price);
            } else {
                String price = ExcelUtil.getValue(row.getCell(4)) + "";
                model.setPrice(price);
            }
        }
        if (row.getCell(5) != null) {
            model.setRemark(ExcelUtil.getValue(row.getCell(5)) + "");
        }
        if (row.getCell(6) != null) {
            model.setSubname(ExcelUtil.getValue(row.getCell(6)) + "");
        }
        if (row.getCell(7) != null) {
            model.setCol8(ExcelUtil.getValue(row.getCell(7)) + "");
        }
        if (row.getCell(8) != null) {
            model.setCol9(ExcelUtil.getValue(row.getCell(8)) + "");
        }
        model.setCol10("1");
        return dao.add(model);
    }


    @Transactional
    public void save(String userId, Contractor contractor){
        if (StringUtils.isNotEmpty(contractor.getId())) {
            //更新记录
            //清理行
            List<com.veryqy.jooq.tables.pojos.Order> orderList = dao.getOrdersByContractId(contractor.getId());
            for (com.veryqy.jooq.tables.pojos.Order one : orderList) {
                dao.deleteRowByOrderId(one.getId());
            }
            //清理表
            dao.deleteOrdersByContractorId(contractor.getId());

            //更新合同信息
            com.veryqy.jooq.tables.pojos.Contractor jooqContractor= contractor.toJOOQContractor();
            jooqContractor.setCreateDate(new Timestamp(System.currentTimeMillis()));
            jooqContractor.setCreateBy(userId);
            dao.update(jooqContractor);
        }else{
            //新增记录
            String contratorId=UUID.randomUUID().toString();
            contractor.setId(contratorId);
            com.veryqy.jooq.tables.pojos.Contractor jooqContractor= contractor.toJOOQContractor();
            jooqContractor.setCreateDate(new Timestamp(System.currentTimeMillis()));
            jooqContractor.setCreateBy(userId);
            dao.save(jooqContractor);
        }

        List<Order> orders = contractor.getOrders();
        for (Order one : orders) {
            com.veryqy.jooq.tables.pojos.Order jooqOrder = one.toJooqOrder();
            jooqOrder.setContractorId(contractor.getId());
            String orderId=dao.save(jooqOrder);
            one.getItems().stream().filter(item->item.isChecked()).forEach(item->{
                com.veryqy.jooq.tables.pojos.Row row = item.toJooqRow();
                row.setOrderId(orderId);
                dao.save(row);
            });
        }
    }

    public com.veryqy.jooq.tables.pojos.Contractor getContractorById(String id){
      return  dao.getContractorById(id);
    }

    public List<com.veryqy.jooq.tables.pojos.Contractor> searchContractor(com.veryqy.jooq.tables.pojos.Contractor contractor){
        return  dao.searchContractor(contractor);
    }

}
