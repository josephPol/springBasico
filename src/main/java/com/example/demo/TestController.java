package com.example.demo;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.getUserById(id));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PostMapping("/user")
    public ResponseEntity<?> saveUser(@RequestBody Usuario usuario) {
        try {
            return ResponseEntity.ok(userService.saveUser(usuario));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        try {
            return ResponseEntity.ok(userService.deleteById(id));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody Usuario usuario) {
        try {
            return ResponseEntity.ok(userService.updateUser(id, usuario));
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }
}