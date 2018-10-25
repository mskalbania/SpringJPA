package edu.sping.jpa.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Item {

    private long id;
    private String name;
    private BigDecimal price;
}
