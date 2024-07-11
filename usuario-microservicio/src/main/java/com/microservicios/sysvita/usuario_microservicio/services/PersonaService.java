package com.microservicios.sysvita.usuario_microservicio.services;

import com.microservicios.sysvita.usuario_microservicio.model.dtos.PersonaRequest;
import com.microservicios.sysvita.usuario_microservicio.model.dtos.PersonaResponse;
import com.microservicios.sysvita.usuario_microservicio.model.entities.Persona;
import com.microservicios.sysvita.usuario_microservicio.repositories.PersonaRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j

public class PersonaService {
    private final PersonaRepository personaRepository;
    
    public void addPersona(PersonaRequest personaRequest){
        var persona = Persona.builder()
                .nombres(personaRequest.getNombres())
                .apellidos(personaRequest.getApellidos())
                .fechaRegistro(personaRequest.getFechaRegistro())
                .telefono(personaRequest.getTelefono())
                .edad(personaRequest.getEdad())
                .fechaupdatePers(personaRequest.getFechaupdatePers())
                .build();
        personaRepository.save(persona);         
        log.info("Persona added: {}", persona);
    }
    public List<PersonaResponse> getAllPersonas(){
        var personas = personaRepository.findAll();
        return personas.stream().map(this::mapToPersonaResponse).toList();
    }
    private PersonaResponse mapToPersonaResponse(Persona persona){
        return PersonaResponse.builder()
                .idPersona(persona.getIdPersona())
                .nombres(persona.getNombres())
                .apellidos(persona.getApellidos())
                .fechaRegistro(persona.getFechaRegistro())
                .telefono(persona.getTelefono())
                .edad(persona.getEdad())
                .fechaupdatePers(persona.getFechaupdatePers())
                .build();          
    }
    
}
