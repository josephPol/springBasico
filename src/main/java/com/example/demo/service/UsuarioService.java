package com.example.demo.service;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    public List<Usuario> users = new ArrayList<>();

    public String saveUser(Usuario usuario) {
        boolean existe = users.stream()
                .anyMatch(u -> u.getId().equals(usuario.getId()));

        if (existe) {
            throw new RuntimeException("Ya existe un usuario con el id " + usuario.getId());
        }

        users.add(usuario);
        return "Usuario guardado correctamente";
    }

    public Usuario getUserById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No existe un usuario con el id " + id));
    }

    public String deleteById(Long id) {
        boolean existe = users.removeIf(u -> u.getId().equals(id));

        if (!existe) {
            throw new RuntimeException("No existe un usuario con el id " + id);
        }

        return "Usuario eliminado correctamente";
    }

    public Usuario updateUser(Long id, Usuario usuarioActualizado) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                Usuario updated = Usuario.builder()
                        .id(id)
                        .nombre(usuarioActualizado.getNombre())
                        .edad(usuarioActualizado.getEdad())
                        .alergias(usuarioActualizado.getAlergias())
                        .build();
                users.set(i, updated);
                return updated;
            }
        }
        throw new RuntimeException("No existe un usuario con el id " + id);
    }
}