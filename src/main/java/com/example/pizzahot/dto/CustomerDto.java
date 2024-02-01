package com.example.pizzahot.dto;

public class CustomerDto {


        private Long id;
        private Long customerId;
        private String username;
        private String password;
        private Long cartId;

        // Constructors, getters, and setters

        public CustomerDto() {
        }

        public CustomerDto(Long id, Long customerId, String username, String password, Long cartId) {
            this.id = id;
            this.customerId = customerId;
            this.username = username;
            this.password = password;
            this.cartId = cartId;
        }

    }


