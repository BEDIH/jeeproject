import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {
  // Données statiques pour Medicament
  medicaments = [
    { id: 1, name: 'Paracétamol' },
    { id: 2, name: 'Ibuprofène' },
    { id: 3, name: 'Aspirine' }
  ];

  // Données statiques pour Patient
  patients = [
    { id: 1, firstName: 'Jean', lastName: 'Dupont', email: 'jean.dupont@example.com' },
    { id: 2, firstName: 'Marie', lastName: 'Curie', email: 'marie.curie@example.com' }
  ];

  // Données statiques pour Rendezvous
  rendezvous = [
    { id: 1, date: '2023-10-01T10:00:00', patient: { id: 1, firstName: 'Jean', lastName: 'Dupont' } },
    { id: 2, date: '2023-10-02T11:00:00', patient: { id: 2, firstName: 'Marie', lastName: 'Curie' } }
  ];

  // Données statiques pour User
  users = [
    { id: 1, email: 'admin@example.com', password: 'admin123', name: 'Admin', role: 'ADMIN' },
    { id: 2, email: 'user@example.com', password: 'user123', name: 'User', role: 'USER' }
  ];

  constructor() { }
}