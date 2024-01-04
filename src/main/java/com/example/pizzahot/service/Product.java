package com.example.pizzahot.service;

import lombok.Getter;

@Getter
public enum Product {
    PIZZA_CHEESE("Pizza Cheese"),
    PIZZA_CHOCO("Pizza Chocolate"),
    PIZZA_MEAT("Pizza Meat");

    private final String displayName;

    Product(String displayName) {
        this.displayName = displayName;
    }

}
