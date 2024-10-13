package com.clubFutbol.app.Repositorio;



import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.clubFutbol.app.Entity.Competiciones;

public interface CompeticionRepository extends MongoRepository<Competiciones, String>{
	 boolean existsByNombre(String nombre);
	 List<Competiciones> findByNombre(String nombre);
	

}