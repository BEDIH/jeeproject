
Ce projet a été généré avec Angular CLI version 19.0.0.
Frontend Angular connecté à un backend Spring Boot.

L’interface frontend est simple et intuitive, conçue pour illustrer la logique d’authentification obligatoire via un JWT et la gestion des utilisateurs, avec un focus sur l’accès sécurisé aux données sensibles des patients.


- Fonctionnalités principales :

 Gestion des dossiers patients :

Le système permet de gérer efficacement les dossiers des patients. Chaque dossier contient un historique des rendez-vous :

Visualisation des rendez-vous passés.
Consultation des médicaments prescrits pour chaque rendez-vous.

 Authentification et Autorisation (JWT)
L’accès à l’application est sécurisé grâce à une authentification obligatoire via JSON Web Token (JWT).

Gestion des utilisateurs et rôles
Le système inclut une gestion avancée des utilisateurs avec différents rôles :

Admin : Gère les utilisateurs et a accès à toutes les fonctionnalités.

Patient : Rôle par défaut permettant d’accéder à son propre historique de rendez-vous.
Chaque utilisateur peut avoir plusieurs rôles simultanément.

 Architecture
L’application suit une architecture Front-End / Back-End :

Front-End : Développé avec Angular 19, avec prise en charge de Server-Side Rendering (SSR) pour optimiser le référencement et les performances.

Back-End : Développé avec Spring Boot, gérant l’authentification, la gestion des utilisateurs et les données médicales.

Base de données : Utilisation de MySQL pour stocker les informations des utilisateurs, les rendez-vous et les prescriptions.

 Service Workers
Les Service Workers sont intégrés pour permettre :

Le fonctionnement hors ligne de certaines fonctionnalités.
Une meilleure performance grâce à la mise en cache des ressources statiques.

 Processus d'authentification avec JWT
1️⃣ Connexion de l'utilisateur
L’utilisateur saisit ses identifiants pour se connecter.

2️⃣ Génération du JWT
Le backend génère un JWT lors de l’authentification réussie.

3️⃣ Utilisation du token pour les requêtes sécurisées
Le token JWT est utilisé dans l’en-tête des requêtes HTTP sous la forme d’un Bearer token pour accéder aux ressources protégées.
>>>>>>> 1dc7c75d03a896d5823fe4129d37178d62f30734
