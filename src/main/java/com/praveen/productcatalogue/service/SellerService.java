package com.praveen.productcatalogue.service;

import com.praveen.productcatalogue.entity.SellerDTO;
import com.praveen.productcatalogue.exception.ProductNotFoundException;
import com.praveen.productcatalogue.model.Product;
import com.praveen.productcatalogue.model.Seller;
import com.praveen.productcatalogue.repository.ProductRepository;
import com.praveen.productcatalogue.repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    SellerRepository sellerRepo;

    @Autowired
    ProductRepository productRepo;

    public void save(SellerDTO sellerDto) throws ProductNotFoundException {
        List<Product> product = productRepo.findByProductName(sellerDto.getProductName());
        if(product.size()==0)
            throw new ProductNotFoundException("Product not found in DB!!");
        else
        {
            Seller s = new Seller();
            //		s.setId(sellerDto.getId());
            s.setSellerName(sellerDto.getSellerName());
            s.setQuantity(sellerDto.getQuantity());
            s.setProductId(product.get(0).getProductId());

            sellerRepo.save(s);
        }
    }

    public void delete(int id) {
        sellerRepo.deleteById(id);
    }
}