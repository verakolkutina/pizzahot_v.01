package com.example.pizzahot.exception;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(Long customerId) {
        super("Customer not found with id: " + customerId);
    }

}
