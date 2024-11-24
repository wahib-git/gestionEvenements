package com.example.gestionevenements3.repositories;

import com.example.gestionevenements3.models.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Integer> {
}
