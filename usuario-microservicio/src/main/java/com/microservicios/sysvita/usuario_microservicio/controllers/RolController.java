package com.microservicios.sysvita.usuario_microservicio.controllers;

import com.microservicios.sysvita.usuario_microservicio.model.dtos.RolRequest;
import com.microservicios.sysvita.usuario_microservicio.model.dtos.RolResponse;
import com.microservicios.sysvita.usuario_microservicio.services.RolService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/rol")
@RequiredArgsConstructor

public class RolController {
    private final RolService rolService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addRol(@RequestBody RolRequest rolRequest){
        this.rolService.addRol(rolRequest);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RolResponse> getAllRol(){
        return this.rolService.getAllRols();
    }
}
