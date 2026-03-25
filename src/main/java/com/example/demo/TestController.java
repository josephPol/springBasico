package com.example.demo;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UsuarioService userService;

    @GetMapping("/user")
    public List<Usuario> getUser() {
        return userService.users;
    }

    @PostMapping("/user")
    public String saveUser(@RequestBody Usuario usuario) {
        return userService.saveUser(usuario);
    }
}