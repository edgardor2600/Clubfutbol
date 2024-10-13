package com.clubFutbol.app.Repositorio;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubFutbol.app.Entity.Entrenadores;

public interface EntrenadorRepository extends MongoRepository<Entrenadores, String>{
	boolean existsByNombre(String nombre);
}