package com.example.firstspringapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages ="com.example.firstspringapp")
public class SpringAppApplication {

	public static void main(String[] args) {
	SpringApplication.run(SpringAppApplication.class, args);

	}

}
