package com.veryq.gen.model;

import lombok.Data;
import java.util.List;


@Data
public class Contractor {
    Person person;
    List<Order> orders;
}
