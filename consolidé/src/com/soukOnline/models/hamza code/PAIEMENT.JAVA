package com.soukOnline.models;

public class Paiement {
    private int idPaiement;
    private double montant;
    private String methode; // ex: "Carte", "EDinar", "Cash"
    private String statut;

    // Constructeur vide
    public Paiement() {}

    // Constructeur complet
    public Paiement(int idPaiement, double montant, String methode) {
        this.idPaiement = idPaiement;
        this.montant = montant;
        this.methode = methode;
        this.statut = "EN_ATTENTE";
    }

    // Méthode métier : Simulation de paiement
    public void simulerPaiement() {
        System.out.println("--- Simulation de Paiement ---");
        System.out.println("Connexion au terminal de paiement pour " + montant + " DT...");
        this.statut = "VALIDE";
        System.out.println("Transaction " + idPaiement + " acceptée via " + methode);
    }

    // Méthode métier : Génération de reçu
    public void genererRecu() {
        if (statut.equals("VALIDE")) {
            System.out.println("REÇU SOUKONLINE : Paiement #" + idPaiement + " de " + montant + " DT confirmé.");
        } else {
            System.out.println("Erreur : Aucun reçu disponible pour une transaction non validée.");
        }
    }

    // Getters et Setters
    public int getIdPaiement() { return idPaiement; }
    public void setIdPaiement(int idPaiement) { this.idPaiement = idPaiement; }

    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }

    public String getMethode() { return methode; }
    public void setMethode(String methode) { this.methode = methode; }

    public String getStatut() { return statut; }
} 
