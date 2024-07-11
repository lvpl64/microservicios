package com.microservicios.sysvita.usuario_microservicio.repositories;

import com.microservicios.sysvita.usuario_microservicio.model.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}