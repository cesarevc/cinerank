package com.cinerank.movieservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cinerank.movieservice.domain.Pelicula;
import com.cinerank.movieservice.dto.RegistroPeliculaRequest;
import com.cinerank.movieservice.service.PeliculaService;

@RestController
public class PeliculaController implements PeliculaApi {

	@Autowired
	private PeliculaService peliculaService;
	
	@Override
	public Pelicula registrarPelicula(RegistroPeliculaRequest request) {
		return peliculaService.registrarPelicula(
			request.getPelicula());
	}

}