package com.microservicios.sysvita.usuario_microservicio.repositories;

import com.microservicios.sysvita.usuario_microservicio.model.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol,Long>{
    
}
