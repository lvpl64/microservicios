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

public class PersonaRequest {
    private String nombres;
    private String apellidos;
    private LocalDateTime fechaRegistro;
    private String telefono;
    private Integer edad;
    private LocalDateTime fechaupdatePers;
}
