package com.example.gestionevenements3.repositories;

import com.example.gestionevenements3.models.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
}
