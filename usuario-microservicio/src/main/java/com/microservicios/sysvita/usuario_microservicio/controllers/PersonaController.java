package com.microservicios.sysvita.usuario_microservicio.controllers;

import com.microservicios.sysvita.usuario_microservicio.model.dtos.PersonaRequest;
import com.microservicios.sysvita.usuario_microservicio.model.dtos.PersonaResponse;
import com.microservicios.sysvita.usuario_microservicio.services.PersonaService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/persona")
@RequiredArgsConstructor

public class PersonaController {
    private final PersonaService personaService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPersona(@RequestBody PersonaRequest personaRequest){
        this.personaService.addPersona(personaRequest);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PersonaResponse> getAllPersona(){
        return this.personaService.getAllPersonas();
    }
}
