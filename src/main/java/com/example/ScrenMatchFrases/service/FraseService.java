package com.example.ScrenMatchFrases.service;

import com.example.ScrenMatchFrases.model.Frase;
import com.example.ScrenMatchFrases.DTO.FraseDTO;
import com.example.ScrenMatchFrases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repositorio.buscaFraseAleatoria();
        return new FraseDTO(frase.getTitulo(), frase.getFrase(),  frase.getPersonagem(),frase.getPoster());
    }
}
