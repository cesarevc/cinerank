package com.cinerank.movieservice.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import com.cinerank.movieservice.domain.Pelicula;
import com.cinerank.movieservice.dto.RegistroPeliculaRequest;

@RequestMapping(path="api/peliculas", produces="application/json")
@CrossOrigin(origins="*")
@Tag(name="pelicula", description="API del Recurso Pelicula")
public interface PeliculaApi {
	
	@Operation(summary = "Registrar Pelicula")
	@ApiResponses(value = { 
	  @ApiResponse(responseCode = "201", 
		description = "Pelicula Registrada Exitosamente", 
	    content = { 
	    	@Content(mediaType="application/json", 
	    	schema = @Schema(implementation=Pelicula.class)) }),
	  @ApiResponse(responseCode = "409", 
	  	description="Ya existe una Pelicula con el nombre especificado", 
	    content = @Content) })
	@PostMapping(path="registro", consumes="application/json")
	@ResponseStatus(HttpStatus.CREATED)
	Pelicula registrarPelicula(
		@NotNull @Valid @RequestBody RegistroPeliculaRequest request);

}
