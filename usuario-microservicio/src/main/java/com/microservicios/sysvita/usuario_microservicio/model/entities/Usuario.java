package com.microservicios.sysvita.usuario_microservicio.model.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.*;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_rol", nullable = false)
    private Rol rol;

    private String email;
    private String password;
    private LocalDateTime fechaupdateUsur; 
}