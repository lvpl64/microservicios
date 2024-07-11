/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

public class PersonaResponse {
    private Long idPersona;
    private String nombres;
    private String apellidos;
    private LocalDateTime fechaRegistro;
    private String telefono;
    private Integer edad;
    private LocalDateTime fechaupdatePers;
}
