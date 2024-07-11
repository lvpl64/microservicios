/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.microservicios.sysvita.usuario_microservicio.services;

import com.microservicios.sysvita.usuario_microservicio.model.dtos.RolRequest;
import com.microservicios.sysvita.usuario_microservicio.model.dtos.RolResponse;
import com.microservicios.sysvita.usuario_microservicio.model.entities.Rol;
import com.microservicios.sysvita.usuario_microservicio.repositories.RolRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j

public class RolService {
    private final RolRepository rolRepository;
    public void addRol(RolRequest rolRequest){
        var rol = Rol.builder()
                .nombreRol(rolRequest.getNombreRol())
                .build();
        rolRepository.save(rol);        
        log.info("Rol added: {}", rol);
    }
    public List<RolResponse> getAllRols(){
        var rols = rolRepository.findAll();
        return rols.stream().map(this::mapToRolResponse).toList();
    }
    private RolResponse mapToRolResponse(Rol rol) {
        return RolResponse.builder()
            .idRol(rol.getIdRol())
            .nombreRol(rol.getNombreRol())
            .build();  // Añade esta llamada a .build()
        }
}
