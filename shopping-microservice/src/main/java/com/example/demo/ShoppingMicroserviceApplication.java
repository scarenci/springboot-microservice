package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ShoppingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingMicroserviceApplication.class, args);
	}

}
