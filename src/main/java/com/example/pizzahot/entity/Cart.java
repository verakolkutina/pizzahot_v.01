package com.example.pizzahot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "carts")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId;


    @Column(name = "cart_name")
    private String cartName;


    public Cart() {
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    /**
     */



    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", cartName='" + cartName + '\'' +
                '}';
    }
}
