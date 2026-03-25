package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    public List<Usuario> users = new ArrayList<>();

    public String saveUser(Usuario usuario) {
        users.add(usuario);
        return "Usuario guardado correctamente";
    }
}