package com.sputnik.suputnik.usuarios.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")

public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Short permissao;

    public String getNome(){
        this.nome = nome;
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Short getPermissao(){
        return permissao;
    }

    public void setPermissao(Short permissao){
        this.permissao = permissao;
    }
}


