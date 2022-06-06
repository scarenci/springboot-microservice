package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("catalog-microservice")
public class CatalogController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private ProductService productService;
		
	@GetMapping
	public List<Product> getAllProduct(){
		String port = environment.getProperty("local.server.port");
		return productService.getAllProducts().stream().map(product -> {
			product.setPort(port);
			return product;
		}).toList();
	}
}