package com.soukOnline.models;

public class Statistique {
    private String typeStat; // ex: "Ventes", "Taux de retour", "Panier Moyen"
    private double valeur;
    private String periode; // ex: "Avril 2024"

    // Constructeur vide
    public Statistique() {}

    // Constructeur complet
    public Statistique(String typeStat, double valeur, String periode) {
        this.typeStat = typeStat;
        this.valeur = valeur;
        this.periode = periode;
    }

    // Méthode métier : Afficher détails
    public void afficherResume() {
        System.out.println("Statistique [" + typeStat + "] pour " + periode + " : " + valeur);
    }

    // Getters et Setters
    public String getTypeStat() { return typeStat; }
    public void setTypeStat(String typeStat) { this.typeStat = typeStat; }

    public double getValeur() { return valeur; }
    public void setValeur(double valeur) { this.valeur = valeur; }
}