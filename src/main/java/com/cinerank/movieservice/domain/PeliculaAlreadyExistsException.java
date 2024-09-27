package com.cinerank.movieservice.domain;

public class PeliculaAlreadyExistsException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PeliculaAlreadyExistsException(String nombre) {
		super("Ya existe una pelicula registrada con este nombre " + nombre);
	}
}
