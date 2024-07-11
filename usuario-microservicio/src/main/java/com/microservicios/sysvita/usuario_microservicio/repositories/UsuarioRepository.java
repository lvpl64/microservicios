package com.microservicios.sysvita.usuario_microservicio.repositories;

import com.microservicios.sysvita.usuario_microservicio.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
    
}
