package com.example.pizzahot.service;

import com.example.pizzahot.entity.Cart;
import com.example.pizzahot.entity.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public interface CartService {
    Cart getCartById(Long cartId);

    void addToCart(Long cartId, Long productId, int quantity);

    void removeFromCart(Long cartId, Long productId);

    void clearCart(Long cartId);

    void updateCartItemQuantity(Long cartId, Product product, int newQuantity);

    void updateCartItemQuantity(Long cartId, com.example.pizzahot.service.Product product, int newQuantity);

    List<Product> getAllCartProducts(Long cartId);

    double calculateTotalPrice(Long cartId);

    boolean isProductInCart(Long cartId, Product product);

    boolean isProductInCart(Long cartId, com.example.pizzahot.service.Product product);

    List<Cart> getAllCarts();
}
