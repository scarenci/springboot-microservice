package com.example.demo.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.response.Product;

@FeignClient(name ="catalog-microservice")
public interface ProductProxy {

	@GetMapping(path = "/catalog-microservice")
	public List<Product> getAllProduct();
}
