package com.cinerank.movieservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "CINERANK Microservice Endpoints",
			description = "Definición de los Endpoints para el sistema CINERANK",
			contact = @Contact(
				name = "cesarevc",
				url = "https://github.com/cesarevc",
				email = "cesarevc.dev@outlook.com")
		)
)
public class OpenApiConfig { }
