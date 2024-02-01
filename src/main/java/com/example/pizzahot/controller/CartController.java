package com.example.pizzahot.controller;

import com.example.pizzahot.entity.Cart;
import com.example.pizzahot.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @GetMapping
    public ResponseEntity<List<Cart>> getAllCarts() {
        try {
            List<Cart> carts = cartService.getAllCarts();
            return ResponseEntity.ok(carts);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null); // или можно вернуть сообщение об ошибке в теле ответа
        }
    }

    @GetMapping("/{cartId}")
    public ResponseEntity<Cart> getCartById(@PathVariable Long cartId) {
        try {
            Cart cart = cartService.getCartById(cartId);
            return ResponseEntity.ok(cart);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null); // или можно вернуть сообщение об ошибке в теле ответа
        }
    }

    @PostMapping("/{cartId}/add")
    public ResponseEntity<String> addToCart(@PathVariable Long cartId,
                                            @RequestParam Long productId,
                                            @RequestParam int quantity) {
        try {
            cartService.addToCart(cartId, productId, quantity);
            return ResponseEntity.ok("Item added to cart successfully.");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while adding item to cart.");
        }
    }

    @PostMapping("/{cartId}/remove")
    public ResponseEntity<String> removeFromCart(@PathVariable Long cartId,
                                                 @RequestParam Long productId) {
        try {
            cartService.removeFromCart(cartId, productId);
            return ResponseEntity.ok("Item removed from cart successfully.");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while removing item from cart.");
        }
    }

    @PostMapping("/{cartId}/clear")
    public ResponseEntity<String> clearCart(@PathVariable Long cartId) {
        try {
            cartService.clearCart(cartId);
            return ResponseEntity.ok("Cart cleared successfully.");
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred while clearing the cart.");
        }
    }
}
