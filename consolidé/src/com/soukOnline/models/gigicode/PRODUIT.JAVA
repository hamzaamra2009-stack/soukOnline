package com.soukOnline.models;

public class Produit {
    private int idProduit;
    private String nom;
    private double prixVente;
    private int quantiteStock;
    private int seuilAlerte;

    // Constructeur vide
    public Produit() {}

    // Constructeur complet
    public Produit(int idProduit, String nom, double prixVente, int quantiteStock, int seuilAlerte) {
        this.idProduit = idProduit;
        this.nom = nom;
        this.prixVente = prixVente;
        this.quantiteStock = quantiteStock;
        this.seuilAlerte = seuilAlerte;
    }

    // Méthode métier : Ajouter un produit (simulation)
    public void ajouterProduit() {
        System.out.println("--- Gestion Catalogue ---");
        System.out.println("Le produit '" + nom + "' a été ajouté avec succès au catalogue SoukOnline.");
    }

    // Méthode métier : Vérifier le stock avec alerte
    public boolean verifierStock() {
        System.out.println("Vérification du stock pour : " + nom);
        if (quantiteStock <= seuilAlerte) {
            System.out.println("ALERTE : Stock critique ! Il ne reste que " + quantiteStock + " unités.");
            return false;
        }
        System.out.println("Stock suffisant (" + quantiteStock + " unités).");
        return true;
    }

    // Méthode métier : Recherche simplifiée
    public void rechercherProduit(String critere) {
        if (this.nom.toLowerCase().contains(critere.toLowerCase())) {
            System.out.println("Produit trouvé : " + nom + " | Prix : " + prixVente + " DT");
        } else {
            System.out.println("Aucun produit correspondant à '" + critere + "'.");
        }
    }

    // Getters et Setters
    public int getIdProduit() { return idProduit; }
    public void setIdProduit(int idProduit) { this.idProduit = idProduit; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public double getPrixVente() { return prixVente; }
    public void setPrixVente(double prixVente) { this.prixVente = prixVente; }

    public int getQuantiteStock() { return quantiteStock; }
    public void setQuantiteStock(int quantiteStock) { this.quantiteStock = quantiteStock; }

    @Override
    public String toString() {
        return "Produit [nom=" + nom + ", prix=" + prixVente + " DT, stock=" + quantiteStock + "]";
    }
}