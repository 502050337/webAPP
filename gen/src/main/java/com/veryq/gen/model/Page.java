package com.veryq.gen.model;

import lombok.Data;


@Data
public class Page<T> {
    Long total;
    T items;
}
