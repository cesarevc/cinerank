package com.cinerank.movieservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cinerank.movieservice.domain.Pelicula;

public interface PeliculaRepository 
	extends MongoRepository<Pelicula, String>{
	
	Optional<Pelicula> findByNombre(String nombre);

}