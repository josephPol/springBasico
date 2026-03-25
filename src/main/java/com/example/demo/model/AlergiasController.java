package com.example.demo.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alergias")
public class AlergiasController {

    @Autowired
    private AlergiaTIpo alergiaTipo;

    @GetMapping("/{tipo}")
    public Alergia obtenerAlergia(@PathVariable String tipo) {
        return alergiaTipo.evaluarAlergia(tipo);
    }
}