package com.example.demo;

import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LambdaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaSpringApplication.class, args);
	}
	
	@Bean
	public Function<String, String> getName(){
		return (input) -> "shubham";
	}

	@Bean
	public Supplier<String> getT(){
		return () -> "shubham";
	}
}
