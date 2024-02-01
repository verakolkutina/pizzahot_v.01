package com.example.pizzahot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "com.example.pizzahot.entity")
public class PizzahotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzahotApplication.class, args);
	}

}
