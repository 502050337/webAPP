package com.veryq.gen.model;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Row {
    private String id;
    private String col1;
    private String col5;
    private String col6;
    private String col7;
    private String col8;
    private String col9;
    private String col10;
    private String price;
    private String count;
    private String name;

    public static void main(String[] args) {
        Row row=Row.builder().name("11").col1("111").build();
    }
}
