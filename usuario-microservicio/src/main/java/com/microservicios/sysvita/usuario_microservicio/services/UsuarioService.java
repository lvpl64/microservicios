package com.microservicios.sysvita.usuario_microservicio.services;

import com.microservicios.sysvita.usuario_microservicio.model.dtos.UsuarioRequest;
import com.microservicios.sysvita.usuario_microservicio.model.dtos.UsuarioResponse;
import com.microservicios.sysvita.usuario_microservicio.model.entities.Persona;
import com.microservicios.sysvita.usuario_microservicio.model.entities.Rol;
import com.microservicios.sysvita.usuario_microservicio.model.entities.Usuario;
import com.microservicios.sysvita.usuario_microservicio.repositories.PersonaRepository;
import com.microservicios.sysvita.usuario_microservicio.repositories.RolRepository;
import com.microservicios.sysvita.usuario_microservicio.repositories.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PersonaRepository personaRepository;
    private final RolRepository rolRepository;

    public void addUsuario(UsuarioRequest usuarioRequest) {
        Persona persona = personaRepository.findById(usuarioRequest.getIdPersona())
                .orElseThrow(() -> new RuntimeException("Persona not found"));
        Rol rol = rolRepository.findById(usuarioRequest.getIdRol())
                .orElseThrow(() -> new RuntimeException("Rol not found"));

        Usuario usuario = Usuario.builder()
                .persona(persona)
                .rol(rol)
                .email(usuarioRequest.getEmail())
                .password(usuarioRequest.getPassword())
                .fechaupdateUsur(usuarioRequest.getFechaupdateUsur())
                .build();

        usuarioRepository.save(usuario);
        log.info("Usuario added: {}", usuario);
    }

    public List<UsuarioResponse> getAllUsuarios() {
        var usuarios = usuarioRepository.findAll();
        return usuarios.stream().map(this::mapToUsuarioResponse).toList();
    }

    private UsuarioResponse mapToUsuarioResponse(Usuario usuario) {
        return UsuarioResponse.builder()
                .idUsuario(usuario.getIdUsuario())
                .idPersona(usuario.getPersona().getIdPersona())
                .idRol(usuario.getRol().getIdRol())
                .email(usuario.getEmail())
                .password(usuario.getPassword())
                .fechaupdateUsur(usuario.getFechaupdateUsur())
                .build();
    }
}

