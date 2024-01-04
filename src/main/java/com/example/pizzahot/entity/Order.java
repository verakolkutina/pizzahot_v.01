package com.example.pizzahot.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

/*    @ManyToOne
    @JoinColumn(name = "customers_id")
    private Customer customer;
    выдает ошибку  - колонку  customer_id не видит*/



    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
