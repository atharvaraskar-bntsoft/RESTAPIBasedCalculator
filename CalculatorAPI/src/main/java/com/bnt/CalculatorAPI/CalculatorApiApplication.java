package com.bnt.CalculatorAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApiApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Calculator");
		SpringApplication.run(CalculatorApiApplication.class, args);
	}

}
