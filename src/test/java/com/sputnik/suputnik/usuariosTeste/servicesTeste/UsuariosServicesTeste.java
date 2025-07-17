package com.sputnik.suputnik.usuariosTeste.servicesTeste;

import com.sputnik.suputnik.usuarios.models.UsuarioModel;
import com.sputnik.suputnik.usuarios.repositories.UsuarioRepository;
import com.sputnik.suputnik.usuarios.services.UsuarioService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UsuariosServicesTeste{
    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    @Test
    public void DeveCadastrarUmUsuario(){
        UsuarioModel usuario = new UsuarioModel();
        usuario.setNome("Nome Teste");
        usuario.setPermissao((short) 1);

        when(usuarioRepository.save(usuario)).thenReturn(usuario);

        UsuarioModel resultado = usuarioService.criarUsuario(usuario);
        assertNotNull(resultado);
        assertEquals("Nome Teste", resultado.getNome());
    }
}
