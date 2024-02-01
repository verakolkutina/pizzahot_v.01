package com.example.pizzahot.test;

import com.example.pizzahot.entity.Customer;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void testCustomerGetterAndSetter() {
        // Arrange
        Customer customer = new Customer();

        // Act
        customer.setId(1L);
        customer.setCustomerId(100L);
        customer.setUsername("JohnDoe");
        customer.setPassword("password123");
        customer.setCartId(50L);

        // Assert
        assertEquals(Optional.of(1L), customer.getId());
        assertEquals(Optional.of(100L), customer.getCustomerId());
        assertEquals("JohnDoe", customer.getUsername());
        assertEquals("password123", customer.getPassword());
        assertEquals(Optional.of(50L), Optional.ofNullable(customer.getCartId()));
    }

    @Test
    public void testCustomerToString() {
        // Arrange
        Customer customer = new Customer();
        customer.setId(1L);
        customer.setCustomerId(100L);
        customer.setUsername("JohnDoe");
        customer.setPassword("password123");
        customer.setCartId(50L);

        // Act
        String result = customer.toString();

        // Assert
        assertEquals("Customer{id=1, customerId=100, username='JohnDoe', password='password123', cartId=50}", result);
    }
}
