package com.example.stage.stage.controller;
import com.example.stage.stage.entity.Medicament;
import com.example.stage.stage.entity.Patient;
import com.example.stage.stage.entity.Rendezvous;
import com.example.stage.stage.repostory.MedicamentRepository;
import com.example.stage.stage.repostory.PatientRepository;
import com.example.stage.stage.repostory.RendezvousRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AppController {

    private final PatientRepository patientRepository;
    private final RendezvousRepository rendezvousRepository;
    private final MedicamentRepository medicamentRepository;

    public AppController(PatientRepository patientRepository, RendezvousRepository rendezvousRepository, MedicamentRepository medicamentRepository) {
        this.patientRepository = patientRepository;
        this.rendezvousRepository = rendezvousRepository;
        this.medicamentRepository = medicamentRepository;
    }

    // Gestion des Patients
    @PostMapping("/patients")
    public Patient createPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    @PutMapping("/patients/{id}")
    public ResponseEntity<Patient> updatePatient(@PathVariable Long id, @RequestBody Patient patientDetails) {
        return patientRepository.findById(id)
                .map(patient -> {
                    patient.setFirstName(patientDetails.getFirstName());
                    patient.setLastName(patientDetails.getLastName());
                    patient.setEmail(patientDetails.getEmail());
                    return ResponseEntity.ok(patientRepository.save(patient));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/patients/{id}")
    public ResponseEntity<Void> deletePatient(@PathVariable Long id) {
        if (patientRepository.existsById(id)) {
            patientRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Gestion des Rendezvous
    @PostMapping("/rendezvous")
    public Rendezvous createRendezvous(@RequestBody Rendezvous rendezvous) {
        return rendezvousRepository.save(rendezvous);
    }

    @PutMapping("/rendezvous/{id}")
    public ResponseEntity<Rendezvous> updateRendezvous(@PathVariable Long id, @RequestBody Rendezvous rendezvousDetails) {
        return rendezvousRepository.findById(id)
                .map(rendezvous -> {
                    rendezvous.setDate(rendezvousDetails.getDate());
                    return ResponseEntity.ok(rendezvousRepository.save(rendezvous));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/rendezvous/{id}")
    public ResponseEntity<Void> deleteRendezvous(@PathVariable Long id) {
        if (rendezvousRepository.existsById(id)) {
            rendezvousRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

    // Gestion des Medicaments
    @PostMapping("/medicaments")
    public Medicament createMedicament(@RequestBody Medicament medicament) {
        return medicamentRepository.save(medicament);
    }

    @PutMapping("/medicaments/{id}")
    public ResponseEntity<Medicament> updateMedicament(@PathVariable Long id, @RequestBody Medicament medicamentDetails) {
        return medicamentRepository.findById(id)
                .map(medicament -> {
                    medicament.setName(medicamentDetails.getName());
                    return ResponseEntity.ok(medicamentRepository.save(medicament));
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/medicaments/{id}")
    public ResponseEntity<Void> deleteMedicament(@PathVariable Long id) {
        if (medicamentRepository.existsById(id)) {
            medicamentRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
