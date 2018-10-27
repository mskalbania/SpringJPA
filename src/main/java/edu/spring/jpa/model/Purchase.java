package edu.spring.jpa.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@NamedEntityGraphs({
        @NamedEntityGraph(name = "purchaseWithoutItems"),
        @NamedEntityGraph(name = "purchaseWithItems", attributeNodes = {@NamedAttributeNode("items")})
})
public class Purchase {

    @Id
    @GeneratedValue
    private long id;
    private String purchaser;
    private LocalDateTime purchaseDate;
    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Item> items;
}
