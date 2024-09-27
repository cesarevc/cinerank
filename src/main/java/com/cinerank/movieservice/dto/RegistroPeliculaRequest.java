package com.cinerank.movieservice.dto;

import java.util.List;

import com.cinerank.movieservice.domain.Actor;
import com.cinerank.movieservice.domain.Pelicula;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class RegistroPeliculaRequest {
	
	@NotNull
	@Valid
	private Pelicula pelicula;

}