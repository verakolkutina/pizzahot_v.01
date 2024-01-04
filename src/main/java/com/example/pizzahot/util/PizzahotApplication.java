package com.example.pizzahot.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan(basePackages = "entity")
public class PizzahotApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzahotApplication.class, args);
	}

}
