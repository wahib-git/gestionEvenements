package com.example.gestionevenements3.repositories;

import com.example.gestionevenements3.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {
}
