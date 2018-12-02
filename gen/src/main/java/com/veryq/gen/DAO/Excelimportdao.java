package com.veryq.gen.DAO;

import com.veryqy.jooq.tables.pojos.Commodity;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static com.veryqy.jooq.Tables.COMMODITY;

@Component
public class Excelimportdao {

    final
    DSLContext ctx;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public Excelimportdao(DSLContext ctx) {
        this.ctx = ctx;
    }

    public int add(Commodity model){
        String uuid = UUID.randomUUID().toString();
        model.setId(uuid);
        return ctx.newRecord(COMMODITY,model).store();
    }

    public List<Commodity> commodityquery(){
        ArrayList<Commodity> list=null;
        Result<Record> result = ctx.select().from(COMMODITY).fetch();
        if(result !=null) {
            list=new ArrayList<Commodity>();
            for(Record record : result) {
                Commodity temp=new Commodity();
                temp.setId((String) record.getValue("id"));
                temp.setCol1((String) record.getValue("col1"));
                temp.setCol2((String) record.getValue("col2"));
                temp.setCol3((String) record.getValue("col3"));
                temp.setCol4((String) record.getValue("col4"));
                temp.setCol5((String) record.getValue("col5"));
                temp.setCol6((String) record.getValue("col6"));
                temp.setCol7((String) record.getValue("col7"));
                temp.setCol8((String) record.getValue("col8"));
                temp.setCol9((String) record.getValue("col9"));
                temp.setCol10((String) record.getValue("col10"));
                list.add(temp);
            }
        }
        return list;
    }
}
