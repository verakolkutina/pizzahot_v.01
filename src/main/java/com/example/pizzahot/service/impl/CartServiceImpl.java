package com.example.pizzahot.service.impl;

import com.example.pizzahot.entity.Cart;
import com.example.pizzahot.service.CartService;
import com.example.pizzahot.service.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Component
public class CartServiceImpl implements CartService {
    @Override
    public Cart getCartById(Long cartId) {
        return null;
    }

    @Override
    public void addToCart(Long cartId, Long productId, int quantity) {

    }

    @Override
    public void removeFromCart(Long cartId, Long productId) {

    }

    @Override
    public void clearCart(Long cartId) {

    }

    @Override
    public void updateCartItemQuantity(Long cartId, com.example.pizzahot.entity.Product product, int newQuantity) {

    }

    @Override
    public void updateCartItemQuantity(Long cartId, Product product, int newQuantity) {

    }

    @Override
    public List<com.example.pizzahot.entity.Product> getAllCartProducts(Long cartId) {
        return null;
    }

    @Override
    public double calculateTotalPrice(Long cartId) {
        return 0;
    }

    @Override
    public boolean isProductInCart(Long cartId, com.example.pizzahot.entity.Product product) {
        return false;
    }

    @Override
    public boolean isProductInCart(Long cartId, Product product) {
        return false;
    }

    @Override
    public List<Cart> getAllCarts() {
        return null;
    }
}