package com.example.pizzahot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "pizza_arts")
public class Product {

    public static final Product PIZZA_CHEESE = new Product("Pizza cheese") ;
    public static final Product PIZZA_CHOCO = new Product("Pizza Chocolate");
    public static final Product PIZZA_MEAT = new Product("Pizza Meat");


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "art")
    private String art;


    @Column(name = "key_ingredients")
    private String keyIngredients;

    @Column(name = "price")
    private double price;


    @Column(name = "image_path")
    private String imagePath;



    public Product(String pizzaCheese) {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public void setKeyIngredients(String keyIngredients) {
        this.keyIngredients = keyIngredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", art='" + art + '\'' +
                ", keyIngredients='" + keyIngredients + '\'' +
                ", price=" + price +
                '}';
    }
}
