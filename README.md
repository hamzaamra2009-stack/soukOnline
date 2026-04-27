# SoukOnline - Le Système d'Exploitation de l'E-commerce

## Description
**SoukOnline** est une plateforme centralisée développée en Java selon la méthode **Agile Scrum**. Contrairement aux solutions classiques, SoukOnline agit comme un hub unique qui regroupe la gestion des commandes, le suivi logistique et la communication d'équipe, permettant aux e-commerçants de piloter leur business sans jongler entre plusieurs onglets.

## Problème résolu
Les e-commerçants perdent un temps précieux et une charge mentale importante à cause de la fragmentation de leurs outils :
* **Multiplication des plateformes :** Sites de livraison, WhatsApp pour l'équipe, Shopify pour les ventes, fichiers Excel pour les revenus.
* **Coûts élevés :** Cumul des abonnements sur plusieurs services tiers.
* **Erreurs de données :** Difficulté à suivre le profit réel et l'état des colis en temps réel.

**SoukOnline** résout cela en fusionnant toutes ces fonctionnalités dans une interface unique et abordable.

## Fonctionnalités principales
* **Hub Centralisé (Omnicanal) :** Récupération automatique des commandes depuis différentes sources.
* **Gestion Logistique Intégrée :** Suivi des colis et génération de bordereaux via API de livraison directement depuis l'app.
* **Tableau de Bord Financier :** Calcul automatique du profit net (Revenus - Pubs - Frais de livraison - Coût produit).
* **Communication d'Équipe :** Système de messagerie interne lié aux commandes pour remplacer WhatsApp.
* **Catalogue & Stock Intelligent :** Gestion des produits avec alertes de rupture de stock basées sur la vitesse de vente.

## Équipe
| Membre | Rôle | Fonctionnalité |
|--------|------|----------------|
| **Leila** | Product Owner + Dev | Authentification & Gestion Profils |
| **Hamza** | Scrum Master + Dev | Système de Paiement & Logique Profit |
| **Ghofrane** | Développeuse | Catalogue Produits & Filtres |
| **Lina** | Développeuse | Panier & Gestion des Commandes |
| **Abdelkader** | Développeur | Dashboard Admin & Statistiques |

## Technologies utilisées
* **Java (POO)** - Logique métier et structure de données.
* **GitHub** - Versioning et collaboration.
* **Jira** - Gestion du backlog et sprints.
* **Figma / Uizard** - Design de l'interface centralisée.
* **PlantUML** - Modélisation des diagrammes de classes et séquences.
* **Méthode Scrum** - Développement itératif (2 Sprints).

## Structure du projet (Modèles Java)
```text
src/com/aglpro/models/
├── Utilisateur.java       # Base pour Clients et Admins
├── Client.java            # Gestion des comptes marchands
├── Produit.java           # Attributs produits et stock
├── Commande.java          # Cœur du système (Lien entre vente et livraison)
├── Livraison.java         # Intégration des statuts de transporteurs
├── Finance.java           # Calcul des marges et profits
├── Messagerie.java        # Communication interne d'équipe
├── Paiement.java          # Simulation de transactions
└── Main.java              # Point d'entrée de l'application
