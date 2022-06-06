package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@RefreshScope
@ConfigurationProperties("shopping-microservice")
public class ShoppingConfiguration {
	
	private String greeting;
	private String defaultValue;
	
}
