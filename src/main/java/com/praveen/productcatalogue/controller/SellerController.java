package com.praveen.productcatalogue.controller;

import com.praveen.productcatalogue.entity.SellerDTO;
import com.praveen.productcatalogue.exception.ProductNotFoundException;
import com.praveen.productcatalogue.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SellerController {

    @Autowired
    SellerService sellerService;

    @PostMapping("/seller/save")
    public void save(@RequestBody SellerDTO seller) throws ProductNotFoundException {
        sellerService.save(seller);
    }

    @DeleteMapping("/seller/delete/{id}")
    public void delete(@PathVariable int id) {
        sellerService.delete(id);
    }

}
