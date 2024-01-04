package com.example.pizzahot.controller;

import com.example.pizzahot.entity.Cart;
import com.example.pizzahot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{cartId}")
    public Cart getCartById(@PathVariable Long cartId) {
        return cartService.getCartById(cartId);
    }

    @PostMapping("/{cartId}/add/{productId}/{quantity}")
    public void addToCart(@PathVariable Long cartId,
                          @PathVariable Long productId,
                          @PathVariable int quantity) {
        cartService.addToCart(cartId, productId, quantity);
    }

    @PostMapping("/{cartId}/remove/{productId}")
    public void removeFromCart(@PathVariable Long cartId,
                               @PathVariable Long productId) {
        cartService.removeFromCart(cartId, productId);
    }

    @PostMapping("/{cartId}/clear")
    public void clearCart(@PathVariable Long cartId) {
        cartService.clearCart(cartId);
    }
}