package com.veryqy.gen.model;

import lombok.Data;
import java.util.List;


@Data
public class Order {
    private String id; //表ID
    private String title; //表名
    private List<Row> items; //表格内容
    public com.veryqy.jooq.tables.pojos.Order toJooqOrder(){
        com.veryqy.jooq.tables.pojos.Order order=new com.veryqy.jooq.tables.pojos.Order();
        order.setTitle(this.getTitle());
        return order;
    }
}
