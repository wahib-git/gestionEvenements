package com.example.gestionevenements3.models;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;
    private String contenu;
    private LocalDate dateEnvoi;

    @ManyToOne
    private Utilisateur utilisateur;
}
