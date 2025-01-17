package com.praveen.productcatalogue.repository;

import com.praveen.productcatalogue.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByProductName(String name);
    List<Product> findByBrand(String brand);
    List<Product> findByColor(String color);
    List<Product> findByPrice(Double price);
    List<Product> findBySku(String sku);
    List<Product> findBySize(int size);
}
