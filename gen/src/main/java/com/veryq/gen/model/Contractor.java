package com.veryq.gen.model;

import lombok.Data;
import java.util.List;
import com.veryq.gen.model.Person;

@Data
public class Contractor {
    public Person person;
    public List<Order> orders;
}
