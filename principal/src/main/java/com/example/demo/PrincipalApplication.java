package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer // Agregar notacion
@SpringBootApplication
public class PrincipalApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipalApplication.class, args);
	}

}