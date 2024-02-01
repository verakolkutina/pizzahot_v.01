package com.example.pizzahot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "name")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "cart_id")
    private Long cartId;

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", cartId=" + cartId +
                '}';
    }
}
