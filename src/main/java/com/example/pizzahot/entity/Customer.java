package com.example.pizzahot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;


@Entity
@Table(name = "customers")
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;



    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Getter
    @OneToMany(mappedBy = "customer")
    private Collection<Order> order;

    public void setOrder(Collection<Order> order) {
        this.order = order;
    }

    public String getName() {
        return null;
    }

    public Long getEmail() {
        return null;
    }
}

