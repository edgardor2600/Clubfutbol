package com.clubFutbol.app.Repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.clubFutbol.app.Entity.Asociaciones;

public interface AsociacionRepository extends MongoRepository<Asociaciones, String>{
	boolean existsByNombre(String nombre);
}
