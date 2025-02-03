package com.cinerank.movieservice.domain;

import java.util.Collection;
import java.util.LinkedHashSet;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="peliculas")
public class Pelicula {
	
	@Id
	private String id;
	@NotBlank(message="Nombre no puede ser blanco")
	private String nombre;
	private String calificacion;
	private String clasificacion;
	@NotBlank(message="Genero no puede ser blanco")
	private String genero;
	private Collection<Actor> actores = new LinkedHashSet<>();

}
