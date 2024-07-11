package com.microservicios.sysvita.usuario_microservicio.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class RolRequest {
    private String nombreRol;
}
