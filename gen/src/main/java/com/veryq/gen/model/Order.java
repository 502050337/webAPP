package com.veryq.gen.model;

import lombok.Data;
import java.util.List;


@Data
public class Order {
    private String id;
    private String title;
    private List<Row> items;
}
