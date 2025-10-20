package com.produit.produit.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "produit")
public class Produit {
    @Id
    @GeneratedValue
    private long produit_id;
    private String name;
    private double price;

    @ManyToMany
    @JoinTable(
            name = "produit_category",
            joinColumns = @JoinColumn(name = "produit_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categoryList;
}
