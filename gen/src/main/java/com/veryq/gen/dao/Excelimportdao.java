package com.veryq.gen.dao;

import com.veryqy.jooq.tables.pojos.Commodity;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

import static com.veryqy.jooq.Tables.COMMODITY;

@Component
public class Excelimportdao {

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

}
