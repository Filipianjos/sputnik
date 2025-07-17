package com.sputnik.suputnik.usuarios.services;

import com.sputnik.suputnik.usuarios.models.UsuarioModel;
import com.sputnik.suputnik.usuarios.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioModel criarUsuario(UsuarioModel usuarioModel){
        return usuarioRepository.save(usuarioModel);
    }
}
