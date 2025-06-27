package com.libralia.libros_frases.controller;

import com.libralia.libros_frases.dto.FraseDTO;
import com.libralia.libros_frases.model.Frase;
import com.libralia.libros_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fraseController {

    @Autowired
    FraseService servicio;

    @GetMapping("/libros/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
