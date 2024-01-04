package com.example.pizzahot.service;

import jakarta.persistence.criteria.Order;

public interface OrderService {
    Order createOrder(Long customerId, Long cartId);

    Order getOrderById(Long orderId);


}
