package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service
public class AlergiaTIpo {

    public Alergia evaluarAlergia(String tipo) {
        switch (tipo.toUpperCase()) {
            case "LEVE":
                return new Alergia (
                        "Alergia Leve",
                        "LEVE"
                );
            case "GRAVE":
                return new Alergia(
                        "Alergia Grave",
                        "GRAVE"
                );
            default:
                return new Alergia(
                        "Desconocida",
                        "DESCONOCIDO"
                );
        }
    }
}