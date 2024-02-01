package com.example.pizzahot.dto;

public class ProductDto {


        private Long id;
        private String name;
        private double price;
        private String imagePath;

        // Constructors, getters, and setters

        public ProductDto() {
        }

        public ProductDto(Long id, String name, double price, String imagePath) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.imagePath = imagePath;
        }

        // Getters and setters
    }


