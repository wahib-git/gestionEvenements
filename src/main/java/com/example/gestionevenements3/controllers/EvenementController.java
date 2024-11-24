package com.example.gestionevenements3.controllers;

import com.example.gestionevenements3.models.Evenement;
import com.example.gestionevenements3.services.EvenementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/evenements")
public class EvenementController {
    private final EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping
    public List<Evenement> getAllEvenements() {
        return evenementService.findAll();
    }

    @PostMapping
    public Evenement createEvenement(@RequestBody Evenement evenement) {
        return evenementService.save(evenement);
    }

    @DeleteMapping("/{id}")
    public void deleteEvenement(@PathVariable Integer id) {
        evenementService.delete(id);
    }
}
