package com.veryq.gen.dao;

import com.veryqy.jooq.tables.pojos.Commodity;
import com.veryqy.jooq.tables.pojos.Contractor;
import com.veryqy.jooq.tables.pojos.Order;
import com.veryqy.jooq.tables.pojos.Row;
import org.apache.commons.lang3.StringUtils;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import static com.veryqy.jooq.Tables.*;

@Component
public class ContractorDao {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    DSLContext ctx;

    public int add(Commodity model) {
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        return ctx.newRecord(COMMODITY, model).store();
    }

    public List<Commodity> commodityquery() {
        return ctx.select().from(COMMODITY).fetch().into(Commodity.class);
    }

    public String save(Contractor model) {
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        int row=ctx.newRecord(CONTRACTOR, model).store();
        if(row==1){
            return uuid;
        }
        throw new RuntimeException("保存失败");
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


    public List<Contractor> searchContractor(Contractor contractor) {
        SelectConditionStep<Record5<String, String, String, Timestamp, String>> where = ctx.select(CONTRACTOR.ID,CONTRACTOR.AGREEMENT_ID,CONTRACTOR.NAME,CONTRACTOR.CREATE_DATE,CONTRACTOR.CREATE_BY).from(CONTRACTOR).where(CONTRACTOR.ID.eq(CONTRACTOR.ID));
        if(StringUtils.isNotEmpty(contractor.getPersonIdno())){
            where=where.and(CONTRACTOR.PERSON_IDNO.like(contractor.getPersonIdno()));
        }
        if(StringUtils.isNotEmpty(contractor.getPersonName())){
            where=where.and(CONTRACTOR.PERSON_NAME.like(contractor.getPersonName()));
        }
        if(StringUtils.isNotEmpty(contractor.getAgreementId())){
            where=where.and(CONTRACTOR.AGREEMENT_ID.like(contractor.getAgreementId()));
        }
        return where.fetch().into(Contractor.class);
    }


}
