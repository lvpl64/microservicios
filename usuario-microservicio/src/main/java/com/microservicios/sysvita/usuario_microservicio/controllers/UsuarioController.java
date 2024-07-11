package com.microservicios.sysvita.usuario_microservicio.controllers;

import com.microservicios.sysvita.usuario_microservicio.model.dtos.UsuarioRequest;
import com.microservicios.sysvita.usuario_microservicio.model.dtos.UsuarioResponse;
import com.microservicios.sysvita.usuario_microservicio.services.UsuarioService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/usuario")
@RequiredArgsConstructor
        
public class UsuarioController {
    
    private final UsuarioService usuarioService;
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addUsuario(@RequestBody UsuarioRequest usuarioRequest){
        this.usuarioService.addUsuario(usuarioRequest);
    }
    
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioResponse> getAllUsuario(){
        return this.usuarioService.getAllUsuarios();
    }
}
