package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;

@OpenAPIDefinition(info =
@Info(title = "",
	  version = "",
	  description = ""))
public class OpenApiConfiguration {

	@Bean
	public OpenAPI customopenAPI() {
		return new OpenAPI()
				.components(new Components())
				.info(
					new io.swagger.v3.oas.models.info.Info()
							.title( "Book Service API")
							.version("v1")
							.license(
								new io.swagger.v3.oas.models.info.License()
								.name ("Apache 2.0")
								.url ("http: //springdoc.org")
							)
				);
	}
}