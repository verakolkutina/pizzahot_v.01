package com.example.pizzahot.service.impl;

import com.example.pizzahot.entity.Product;
import com.example.pizzahot.service.ProductService;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductById(Long productId) {
        // Реализация получения продукта по идентификатору
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        // Реализация получения всех продуктов
        return Arrays.asList
                (Product.PIZZA_CHEESE,
                Product.PIZZA_CHOCO,
                Product.PIZZA_MEAT);
    }
}

