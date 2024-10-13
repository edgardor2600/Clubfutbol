package com.clubFutbol.app.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubFutbol.app.Entity.Clubes;

public interface ClubRepository extends MongoRepository<Clubes, String>{
	boolean existsByNombre(String nombre);
}