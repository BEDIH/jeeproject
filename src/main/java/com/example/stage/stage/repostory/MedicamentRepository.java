package com.example.stage.stage.repostory;

import com.example.stage.stage.entity.Medicament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentRepository extends JpaRepository<Medicament, Long> {
}