package edu.sping.jpa.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Purchase {

    private long id;
    private String purchaser;
    private LocalDateTime purchaseDate;
    private List<Item> items;
}
