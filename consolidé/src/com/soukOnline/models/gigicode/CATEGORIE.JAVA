package com.soukOnline.models;

import java.util.ArrayList;
import java.util.List;

public class Categorie {
    private int idCategorie;
    private String nom;
    private String description;

    // Constructeur vide
    public Categorie() {}

    // Constructeur complet
    public Categorie(int idCategorie, String nom, String description) {
        this.idCategorie = idCategorie;
        this.nom = nom;
        this.description = description;
    }

    // Méthode métier
    public void afficherInfosCategorie() {
        System.out.println("Catégorie : " + nom + " - " + description);
    }

    // Getters et Setters
    public int getIdCategorie() { return idCategorie; }
    public void setIdCategorie(int idCategorie) { this.idCategorie = idCategorie; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}