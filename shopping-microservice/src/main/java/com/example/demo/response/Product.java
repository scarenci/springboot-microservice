package com.example.demo.response;

import java.io.Serializable;

import lombok.Data;

@Data
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;

	private long id;
	
	private String name;
	
	private String description;
	
	private String port;
	
}
