package com.soukOnline.models;

public class Paiement {
    private int idPaiement;
    private double montant;
    private String methode;
    private String statut;

    public Paiement(int idPaiement, String methode) {
        this.idPaiement = idPaiement;
        this.methode = methode;
        this.statut = "EN_ATTENTE";
    }

    public boolean traiterCommande(Produit p, int quantite) {
        System.out.println("--- Système de Paiement SoukOnline ---");
        
        if (p.getQuantiteStock() >= quantite) {
            this.montant = p.getPrixVente() * quantite;
            
            this.statut = "VALIDE";
            
            p.setQuantiteStock(p.getQuantiteStock() - quantite);
            
            System.out.printf("Paiement de %.2f DT accepté. Stock mis à jour.\n", montant);
            return true;
        } else {
            this.statut = "ECHEC_STOCK";
            System.out.println("Erreur : Stock insuffisant pour " + p.getNom());
            return false;
        }
    }

    public void genererRecu() {
        if (statut.equals("VALIDE")) {
            System.out.println("REÇU : Transaction #" + idPaiement + " - Total : " + montant + " DT");
        }
    }
}