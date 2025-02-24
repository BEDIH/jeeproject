package com.example.stage.stage.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "rendezvous_id")
    private Rendezvous rendezvous; // Relation avec le rendez-vous
}