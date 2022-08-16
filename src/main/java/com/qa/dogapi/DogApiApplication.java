package com.qa.dogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogApiApplication.class, args);
	}
	
	//Beans -- Function that is no longer managed by us and instead by the framework
	//By saying this is a bean -- Im telling Spring that it is under its control
	
	// Inversion of Control --
	
	@Bean
	public void helloWorld() {
		System.out.println("Hello World");
	}

}
