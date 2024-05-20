package com.praveen.productcatalogue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PRODUCT")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private int productId;
    private String productName;
    private double price;
    private String color;
    private String brand;
    private int size;
    private String sku;
}
