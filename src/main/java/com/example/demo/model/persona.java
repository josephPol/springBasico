package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class persona {
    private Long id;
    private String nombre;
    private String apellido;
    private int edad;
}