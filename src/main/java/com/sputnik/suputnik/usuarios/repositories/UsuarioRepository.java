package com.sputnik.suputnik.usuarios.repositories;

import com.sputnik.suputnik.usuarios.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {
}
