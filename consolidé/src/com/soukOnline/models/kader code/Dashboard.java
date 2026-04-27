package com.soukOnline.models;

public class Dashboard {
    private int idDashboard;
    private String nomEcommercant;

    // Constructeur vide
    public Dashboard() {}

    // Constructeur complet
    public Dashboard(int idDashboard, String nomEcommercant) {
        this.idDashboard = idDashboard;
        this.nomEcommercant = nomEcommercant;
    }

    // Méthode métier : Afficher l'évolution (Simulation graphique)
    public void afficherEvolutionVentes() {
        System.out.println("--- Tableau de Bord SoukOnline : " + nomEcommercant + " ---");
        System.out.println("Graphique d'évolution des ventes chargé...");
        System.out.println("Lundi: [|
Spoiler
] 500 DT");
        System.out.println("Mardi: [|
Spoiler
|] 800 DT");
        System.out.println("Mercredi: [
Spoiler
||] 400 DT");
        System.out.println("Tendance : Hausse de 15% par rapport à la semaine dernière.");
    }

    // Méthode métier : Générer rapport
    public void genererRapportJournalier() {
        System.out.println("Génération du rapport PDF en cours...");
        System.out.println("Rapport prêt : Ventes totales du jour = 1700 DT | Colis livrés = 12");
    }

    // Getters et Setters
    public String getNomEcommercant() { return nomEcommercant; }
    public void setNomEcommercant(String nomEcommercant) { this.nomEcommercant = nomEcommercant; }
}