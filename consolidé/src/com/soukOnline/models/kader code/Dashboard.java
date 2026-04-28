package com.soukOnline.models;

public class Dashboard {
    private String nomEcommercant;

    public Dashboard(String nomEcommercant) {
        this.nomEcommercant = nomEcommercant;
    }


    public void genererRapportDynamique(Finance f) {
        System.out.println("--- Tableau de Bord SoukOnline : " + nomEcommercant + " ---");
        
    
        double profitActuel = f.calculerMargeNette(); 
        
        System.out.println("État financier actuel : " + profitActuel + " DT"); 
        
        if (profitActuel > 0) {
            System.out.println("Performance : Votre boutique est actuellement rentable.");
        } else {
            System.out.println("Alerte : Les dépenses dépassent les revenus !");
        }
    }
}