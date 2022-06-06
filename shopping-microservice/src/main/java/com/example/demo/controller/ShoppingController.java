package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.ShoppingConfiguration;
import com.example.demo.proxy.ProductProxy;
import com.example.demo.response.Product;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Shopping endpoint")
@RestController
@RequestMapping("shopping-microservice")
public class ShoppingController {

	@Autowired
	private ShoppingConfiguration configuration;
	
	@Autowired
	private ProductProxy productProxy;
	
	@GetMapping
	public String index() {
		return configuration.getGreeting()+" =)";
	}
	
	@Operation(summary = "List products")
	@GetMapping(path = "/product")
	public List<Product> getAllProducts() {
		return productProxy.getAllProduct();
	}
	
}
