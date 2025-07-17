package com.sputnik.suputnik.usuarios.controllers;

import com.sputnik.suputnik.usuarios.models.UsuarioModel;
import com.sputnik.suputnik.usuarios.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public UsuarioModel novoUsuario(@RequestBody UsuarioModel usuarioModel){
        return usuarioService.criarUsuario(usuarioModel);
    }
}
