package com.soukOnline.models;

public class Finance {
    private double revenusTotaux;
    private double depensesPub;
    private double coutLivraison;
    private double coutAchatProduits;

    // Constructeur vide
    public Finance() {}

    // Constructeur complet
    public Finance(double revenusTotaux, double depensesPub, double coutLivraison, double coutAchatProduits) {
        this.revenusTotaux = revenusTotaux;
        this.depensesPub = depensesPub;
        this.coutLivraison = coutLivraison;
        this.coutAchatProduits = coutAchatProduits;
    }

    // Méthode métier : Calcul de rentabilité
    public double calculerMargeNette() {
        System.out.println("--- Calcul du Profit Réel SoukOnline ---");
        double charges = depensesPub + coutLivraison + coutAchatProduits;
        double profit = revenusTotaux - charges;

        System.out.println("Revenus : " + revenusTotaux + " DT");
        System.out.println("Total des charges : " + charges + " DT");
        return profit;
    }

    public void afficherAnalyse() {
        double profit = calculerMargeNette();
        if (profit > 0) {
            System.out.println("Résultat : Bénéfice de " + profit + " DT. Votre business est rentable !");
        } else {
            System.out.println("Résultat : Déficit de " + profit + " DT. Vérifiez vos coûts publicitaires.");
        }
    }

    // Getters et Setters
    public double getRevenusTotaux() { return revenusTotaux; }
    public void setRevenusTotaux(double revenusTotaux) { this.revenusTotaux = revenusTotaux; }

    public double getDepensesPub() { return depensesPub; }
    public void setDepensesPub(double depensesPub) { this.depensesPub = depensesPub; }
}
