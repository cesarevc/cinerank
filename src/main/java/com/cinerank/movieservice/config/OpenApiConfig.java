package com.cinerank.movieservice.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
		info = @Info(
			version = "v1",
			title = "CINERANK Peliculas Microservice Endpoints", 
			description = "Definición de los Endpoints de "
					+ "Peliculas Service para el sistema CINERANK by César Vázquez  ", 
			contact = @Contact(
				name = "UNAM", 
				url = "https://www.unam.mx/", 
			email = "cesar.evc@outlook.com")))
public class OpenApiConfig {

}
