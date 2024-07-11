package com.example.logapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:secret.properties")
public class LogAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(LogAppApplication.class, args);
	}
}
