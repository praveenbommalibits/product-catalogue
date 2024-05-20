package com.praveen.productcatalogue.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SellerDTO {

    //private int id;
    private String productName;
    private String sellerName;
    private int quantity;
}
