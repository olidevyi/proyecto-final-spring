package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuloProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuloProductoApplication.class, args);
		System.out.println("Ejecutando el modulo de la tabla producto");
	}

}
