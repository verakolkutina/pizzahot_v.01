package com.example.pizzahot.test;

import com.example.pizzahot.entity.Cart;
import org.testng.annotations.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CartTest {

    @Test
    public void testCartGetterAndSetter() {
        // Arrange
        Cart cart = new Cart();

        // Act
        cart.setId(1L);
        cart.setCustomerId(100L);

        // Assert
        assertEquals(Optional.of(1L), Optional.ofNullable(cart.getId()));
        assertEquals(Optional.of(100L), Optional.ofNullable(cart.getCustomerId()));
    }

    @Test
    public void testCartToString() {
        // Arrange
        Cart cart = new Cart();
        cart.setId(1L);
        cart.setCustomerId(100L);

        // Act
        String result = cart.toString();

        // Assert
        assertEquals("Cart{id=1, customerId=100}", result);
    }
}
