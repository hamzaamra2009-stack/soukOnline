package com.soukOnline.models;

public class Dashboard {
    private String nomEcommercant;

    public Dashboard(String nomEcommercant) {
        this.nomEcommercant = nomEcommercant;
    }

    // LOGIQUE RÉELLE + INTERACTION : On utilise l'objet Finance de Hamza
    public void genererRapportDynamique(Finance f) {
        System.out.println("--- Tableau de Bord SoukOnline : " + nomEcommercant + " ---");
        
        // Interaction : On récupère le solde réel calculé par Hamza
        double profitActuel = f.calculerMargeNette(); 
        
        System.out.println("État financier actuel : " + profitActuel + " DT"); // Utilisation des DT
        
        if (profitActuel > 0) {
            System.out.println("Performance : Votre boutique est actuellement rentable.");
        } else {
            System.out.println("Alerte : Les dépenses dépassent les revenus !");
        }
    }
}