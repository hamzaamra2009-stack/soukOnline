package com.soukOnline.models;

public class Finance {
    private double revenusTotaux;
    private double depensesPub;
    private double coutLivraison;
    private double coutAchatProduits;

    public Finance(double revenusTotaux, double depensesPub, double coutLivraison, double coutAchatProduits) {
        this.revenusTotaux = revenusTotaux;
        this.depensesPub = depensesPub;
        this.coutLivraison = coutLivraison;
        this.coutAchatProduits = coutAchatProduits;
    }

    public double calculerMargeNette() {
        double charges = depensesPub + coutLivraison + coutAchatProduits;
        double profit = revenusTotaux - charges;
        return profit;
    }
}