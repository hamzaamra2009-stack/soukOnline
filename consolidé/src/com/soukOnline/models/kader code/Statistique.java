package com.soukOnline.models;

public class Statistique {
    private String typeStat;
    private double valeur;

    public Statistique(String typeStat, double valeur) {
        this.typeStat = typeStat;
        this.valeur = valeur;
    }

    // LOGIQUE RÉELLE : Analyse de performance
    public void analyserCroissance(double valeurPrecedente) {
        double evolution = ((this.valeur - valeurPrecedente) / valeurPrecedente) * 100;
        
        System.out.println("--- Analyse Statistique ---");
        System.out.printf("Indicateur [%s] : %.2f DT\n", typeStat, valeur); //
        System.out.printf("Évolution : %+.1f%% par rapport au mois dernier.\n", evolution);
    }
}