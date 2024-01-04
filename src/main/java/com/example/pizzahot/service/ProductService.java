package com.example.pizzahot.service;

import com.example.pizzahot.entity.Product;

import java.util.List;


public interface ProductService {
    Product getProductById(Long productId);

    List<Product> getAllProducts();

    // Другие методы ?
}

