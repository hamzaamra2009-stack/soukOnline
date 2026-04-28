package com.soukOnline.models;

public class Livraison {
    private String codeSuivi;
    private String statut; 

    public Livraison(String codeSuivi) {
        this.codeSuivi = codeSuivi;
        this.statut = "EN_ATTENTE_PAIEMENT";
    }

    // LOGIQUE RÉELLE : Déclenchement sur condition
    public void declencherExpedition(Paiement p) {
        // INTERACTION : Vérifie le statut chez Hamza
        if (p.getStatut().equals("VALIDE")) {
            this.statut = "EXPEDIE";
            System.out.println("--- Logistique SoukOnline ---");
            System.out.println("Paiement confirmé. Colis " + codeSuivi + " envoyé au transporteur.");
        } else {
            System.out.println("Alerte : Livraison bloquée (Paiement non reçu).");
        }
    }
}