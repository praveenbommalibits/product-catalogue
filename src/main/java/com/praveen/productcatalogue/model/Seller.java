package com.praveen.productcatalogue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SELLER")
@Data
@NoArgsConstructor
public class Seller {

    @Id
    @GeneratedValue
    private int id;
    private String sellerName;
    private int productId;
    private int quantity;
}
