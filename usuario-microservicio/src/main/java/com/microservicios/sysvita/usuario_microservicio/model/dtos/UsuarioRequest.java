package com.microservicios.sysvita.usuario_microservicio.model.dtos;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
        
public class UsuarioRequest {
    private Long idPersona;
    private Long idRol;
    private String email;
    private String password;
    private LocalDateTime fechaupdateUsur;
}
