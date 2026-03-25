package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Usuario {
    private Long id;
    private String nombre;
    private Integer edad;
    private List<Alergia> alergias;
}