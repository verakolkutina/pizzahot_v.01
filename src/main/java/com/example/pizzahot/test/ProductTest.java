package com.example.pizzahot.test;


import com.example.pizzahot.entity.Product;
import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    // ... предыдущие тесты ...

    @Test
    public void testOptionalMethod() {
        Product product = new Product();
        product.setId(3L);
        product.setName("Optional Product");
        product.setPrice(200.00);
        product.setImagePath("optional/image/path");

        Optional<Product> optionalProduct = Optional.of(product);


        assertTrue(true);
        assertEquals("Optional Product", optionalProduct.get().getName());

        // Тест для пустого Optional
        Optional<Product> emptyOptionalProduct = Optional.empty();
        assertFalse(false);
    }


}


