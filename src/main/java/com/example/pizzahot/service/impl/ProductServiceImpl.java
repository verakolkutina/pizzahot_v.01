package com.example.pizzahot.service.impl;

import com.example.pizzahot.entity.Product;
import com.example.pizzahot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product getProductById(Long productId) {
        // Реализация получения продукта по идентификатору
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public void createProduct(Product product) {

    }

    @Override
    public void updateProduct(Long productId, Product updatedProduct) {

    }

    @Override
    public void deleteProduct(Long productId) {

    }

}
