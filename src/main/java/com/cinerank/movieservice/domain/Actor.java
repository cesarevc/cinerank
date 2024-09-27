package com.cinerank.movieservice.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="actores")
public class Actor {
	
	@Id
	private String id;
	private String nombre;
	private String edad;
}
