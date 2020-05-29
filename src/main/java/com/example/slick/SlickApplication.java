package com.example.slick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class SlickApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlickApplication.class, args);
	}

	@Bean
	public Consumer<String> print() {
		return val -> System.out.println(val);
	}
}
