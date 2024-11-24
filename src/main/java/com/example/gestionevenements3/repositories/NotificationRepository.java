package com.example.gestionevenements3.repositories;

import com.example.gestionevenements3.models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
