package com.cinerank.movieservice.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cinerank.movieservice.domain.Pelicula;
import com.cinerank.movieservice.domain.PeliculaAlreadyExistsException;
import com.cinerank.movieservice.repository.PeliculaRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService {
	
	@Autowired
	private PeliculaRepository peliculaRepository;
	
	private static final Logger LOG = 
			LoggerFactory.getLogger(PeliculaServiceImpl.class);

	@Override
	public Pelicula registrarPelicula(Pelicula pelicula) {
		// validacion pelicula existente
		Optional<Pelicula> peliculaExistente = 
				peliculaRepository.findByNombre(pelicula.getNombre());
		if (peliculaExistente.isPresent()) {
			throw new PeliculaAlreadyExistsException(pelicula.getNombre());
		}
		
		
		// guardar usuario
		peliculaRepository.save(pelicula);
		LOG.info("Pelicula Registrado: " + pelicula);
		
		return pelicula;
	}

}
