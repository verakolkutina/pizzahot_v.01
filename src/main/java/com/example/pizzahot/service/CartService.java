package com.example.pizzahot.service;

import com.example.pizzahot.entity.Cart;

import java.util.List;

public interface CartService {
    Cart getCartById(Long cartId);

    void addToCart(Long cartId, Long productId, int quantity);

    void removeFromCart(Long cartId, Long productId);

    void clearCart(Long cartId);

    void updateCartItemQuantity(Long cartId, Product product, int newQuantity);

    List<Product> getAllCartProducts(Long cartId);

    double calculateTotalPrice(Long cartId);

    boolean isProductInCart(Long cartId, Product product);
}
