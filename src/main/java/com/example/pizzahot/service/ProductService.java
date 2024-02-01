package com.example.pizzahot.service;

import com.example.pizzahot.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface ProductService {
    Product getProductById(Long productId);

    List<Product> getAllProducts();

    void createProduct(Product product);

    void updateProduct(Long productId, Product updatedProduct);

    void deleteProduct(Long productId);

    // Другие методы ?
}

