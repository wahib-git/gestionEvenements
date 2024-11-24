package com.example.gestionevenements3.services;

import com.example.gestionevenements3.models.Evenement;
import com.example.gestionevenements3.repositories.EvenementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {
    private final EvenementRepository evenementRepository;

    public EvenementService(EvenementRepository evenementRepository) {
        this.evenementRepository = evenementRepository;
    }

    public List<Evenement> findAll() {
        return evenementRepository.findAll();
    }

    public Evenement save(Evenement evenement) {
        return evenementRepository.save(evenement);
    }

    public void delete(Integer id) {
        evenementRepository.deleteById(id);
    }
}
