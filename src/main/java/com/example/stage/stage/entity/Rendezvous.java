package com.example.stage.stage.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;
@Entity
@Data
public class Rendezvous {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient; // Relation avec le patient

    @OneToMany(mappedBy = "rendezvous", cascade = CascadeType.ALL)
    private Set<Medicament> medicaments;
}
