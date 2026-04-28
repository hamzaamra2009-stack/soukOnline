package com.soukOnline.models;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int idCategorie;
    private String nom;
    private String description;
    private List<Produit> listeProduits; // Logique réelle : On stocke les produits

    public Categorie(int idCategorie, String nom, String description) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.description = description;
        this.listeProduits = new ArrayList<>();
    }

    // LOGIQUE RÉELLE : Gestion du catalogue
    public void ajouterProduitALaCategorie(Produit p) {
        this.listeProduits.add(p);
        System.out.println("Le produit '" + p.getNom() + "' est désormais classé dans : " + this.nom);
    }

    public void listerProduits() {
        System.out.println("--- Produits dans " + nom + " ---");
        for (Produit p : listeProduits) {
            System.out.println("- " + p.getNom() + " (" + p.getPrixVente() + " DT)");
        }
    }

    // Getters et Setters
    public String getNom() { return nom; }
}