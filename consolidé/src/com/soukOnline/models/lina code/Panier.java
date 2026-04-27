package com.soukOnline.models;

import java.util.ArrayList;
import java.util.List;

public class Panier {
    private int idPanier;
    private List<String> articles; // Liste simplifiée des noms de produits
    private double totalPrix;

    // Constructeur vide
    public Panier() {
        this.articles = new ArrayList<>();
        this.totalPrix = 0.0;
    }

    // Constructeur complet
    public Panier(int idPanier) {
        this();
        this.idPanier = idPanier;
    }

    // Méthode métier : Ajouter au panier
    public void ajouterAuPanier(String nomProduit, double prix) {
        articles.add(nomProduit);
        this.totalPrix += prix;
        System.out.println("--- Panier SoukOnline ---");
        System.out.println("Produit '" + nomProduit + "' ajouté. Nouveau total : " + totalPrix + " DT");
    }

    // Méthode métier : Calcul des frais de port (Logique simplifiée)
    public double calculerFraisPort(String ville) {
        double frais;
        if (ville.equalsIgnoreCase("Tunis")) {
            frais = 7.0;
        } else {
            frais = 10.0;
        }
        System.out.println("Frais de livraison estimés pour " + ville + " : " + frais + " DT");
        return frais;
    }

    // Getters et Setters
    public int getIdPanier() { return idPanier; }
    public void setIdPanier(int idPanier) { this.idPanier = idPanier; }

    public double getTotalPrix() { return totalPrix; }

    @Override
    public String toString() {
        return "Panier #" + idPanier + " | Articles : " + articles.size() + " | Total : " + totalPrix + " DT";
    }
}