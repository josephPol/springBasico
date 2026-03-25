package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HolaController")
public class HolaController {

    @GetMapping
    public String obtenerTodas() {
        return "hola";
    }
}