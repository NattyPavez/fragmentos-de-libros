package com.libralia.libros_frases.service;

import com.libralia.libros_frases.dto.FraseDTO;
import com.libralia.libros_frases.model.Frase;
import com.libralia.libros_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria() {
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPortada());
    }
}
