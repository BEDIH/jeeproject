package com.example.stage.stage.repostory;



import com.example.stage.stage.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
