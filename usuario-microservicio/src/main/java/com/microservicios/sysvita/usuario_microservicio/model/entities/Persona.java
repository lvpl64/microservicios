package com.microservicios.sysvita.usuario_microservicio.model.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;

@Entity
@Table(name = "persona")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    private String nombres;
    private String apellidos;
    private LocalDateTime fechaRegistro;
    private String telefono;
    private Integer edad;
    private LocalDateTime fechaupdatePers;

    // Getters y setters
}

