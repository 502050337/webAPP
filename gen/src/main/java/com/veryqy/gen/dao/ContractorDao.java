package com.veryqy.gen.dao;

import com.veryqy.gen.util.NullAwareBeanUtilsBean;
import com.veryqy.jooq.tables.pojos.Commodity;
import com.veryqy.jooq.tables.pojos.Contractor;
import com.veryqy.jooq.tables.pojos.Order;
import com.veryqy.jooq.tables.pojos.Row;
import com.veryqy.jooq.tables.records.ContractorRecord;
import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.lang3.StringUtils;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import static com.veryqy.jooq.Tables.*;

@Component
public class ContractorDao {

    private final DSLContext ctx;

    @Autowired
    public ContractorDao(DSLContext ctx) {
        this.ctx = ctx;
    }

    public int add(Commodity model) {
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        return ctx.newRecord(COMMODITY, model).store();
    }

    public List<Commodity> commodityquery() {
        return ctx.select().from(COMMODITY).fetch().into(Commodity.class);
    }

    public void save(Contractor model) {
        int row=ctx.newRecord(CONTRACTOR, model).store();
        if(row==1){
            return;
        }
        throw new RuntimeException("保存失败");
    }


    public void update(Contractor model) {
        if(model.getId()==null){
            throw new  RuntimeException("更新时ID不能为空");
        }
        ContractorRecord record = getContractorRecord(model.getId());
        BeanUtilsBean notNull=new NullAwareBeanUtilsBean();
        try {
            notNull.copyProperties(record, model);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        int row = ctx.executeUpdate(record);
        if(row!=1) throw new  RuntimeException("更新失败");
    }

    private ContractorRecord getContractorRecord(String id) {
       return ctx.selectFrom(CONTRACTOR).where(CONTRACTOR.ID.eq(id)).fetchOne();
    }


    public void delete(String  id) {
        int row=ctx.delete(CONTRACTOR).where(CONTRACTOR.ID.eq(id)).execute();
        if(row==1){
            return;
        }
        throw new RuntimeException("保存失败");
    }

    public void deleteOrdersByContractorId(String  contractorID) {
        ctx.delete(ORDER).where(ORDER.CONTRACTOR_ID.eq(contractorID)).execute();
    }

    public void deleteRowByOrderId(String  orderId) {
       ctx.delete(ROW).where(ROW.ORDER_ID.eq(orderId)).execute();
    }

    public String save(Order model) {
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        int row= ctx.newRecord(ORDER, model).store();
        if(row==1){
            return uuid;
        }
        throw new RuntimeException("保存失败");
    }


    public String save(Row model) {
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        int row= ctx.newRecord(ROW, model).store();
        if(row==1){
            return uuid;
        }
        throw new RuntimeException("保存失败");
    }

    public Contractor getContractorById(String id) {
        return ctx.select().from(CONTRACTOR).where(CONTRACTOR.ID.eq(id)).fetchOne().into(Contractor.class);
    }

    public List<Order> getOrdersByContractId(String contractId) {
        return ctx.select().from(ORDER).where(ORDER.CONTRACTOR_ID.eq(contractId)).fetch().into(Order.class);
    }

    public List<Contractor> searchContractor(Contractor contractor) {
        SelectConditionStep<Record7<String, String, String, String, String, Timestamp, String>> where = ctx.select(CONTRACTOR.ID,CONTRACTOR.AGREEMENT_ID,CONTRACTOR.NAME,CONTRACTOR.PERSON_IDNO,CONTRACTOR.PERSON_NAME,CONTRACTOR.CREATE_DATE,CONTRACTOR.CREATE_BY).from(CONTRACTOR).where(CONTRACTOR.ID.eq(CONTRACTOR.ID));
        if(StringUtils.isNotEmpty(contractor.getPersonIdno())){
            where=where.and(CONTRACTOR.PERSON_IDNO.like(contractor.getPersonIdno()));
        }
        if(StringUtils.isNotEmpty(contractor.getPersonName())){
            where=where.and(CONTRACTOR.PERSON_NAME.like(contractor.getPersonName()));
        }
        if(StringUtils.isNotEmpty(contractor.getAgreementId())){
            where=where.and(CONTRACTOR.AGREEMENT_ID.like(contractor.getAgreementId()));
        }
        return where.orderBy(CONTRACTOR.CREATE_DATE).fetch().into(Contractor.class);
    }


}
