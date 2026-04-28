package com.soukOnline.models;

public class Produit {
    private int idProduit;
    private String nom;
    private double prixVente;
    private int quantiteStock;
    private int seuilAlerte;

    public Produit(int idProduit, String nom, double prixVente, int quantiteStock, int seuilAlerte) {
        this.idProduit = idProduit;
        this.nom = nom;
        this.prixVente = prixVente;
        this.quantiteStock = quantiteStock;
        this.seuilAlerte = seuilAlerte;
    }

    public boolean reduireStock(int quantiteAchetee) {
        System.out.println("Vérification pour : " + nom);
        
        if (this.quantiteStock >= quantiteAchetee) {
            this.quantiteStock -= quantiteAchetee; // Modification réelle de la donnée
            System.out.println("Stock mis à jour : -" + quantiteAchetee + " unités.");
            
            // Alerte intelligente
            if (this.quantiteStock <= seuilAlerte) {
                System.out.println("!!! ALERTE SOUKONLINE : Stock critique pour " + nom + " (" + quantiteStock + " restants) !!!");
            }
            return true;
        } else {
            System.out.println("ERREUR : Stock insuffisant pour " + nom);
            return false;
        }
    }

    public double getPrixVente() { return prixVente; }
    public String getNom() { return nom; }
    public int getQuantiteStock() { return quantiteStock; }
    
    // Setter pour permettre la mise à jour par d'autres classes
    public void setQuantiteStock(int quantiteStock) { this.quantiteStock = quantiteStock; }
}