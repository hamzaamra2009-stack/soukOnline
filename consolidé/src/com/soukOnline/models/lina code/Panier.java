package com.soukOnline.models;
import java.util.ArrayList;
import java.util.List;

public class Panier {
    private List<Produit> produits; 
    private double totalPrix;

    public Panier() {
        this.produits = new ArrayList<>();
        this.totalPrix = 0.0;
    }

  
    public void ajouterProduit(Produit p, int qte) {
        // On vérifie d'abord le stock via la méthode de Ghofrane
        if (p.getQuantiteStock() >= qte) {
            this.produits.add(p);
            this.totalPrix += (p.getPrixVente() * qte);
            System.out.println(qte + "x " + p.getNom() + " ajouté au panier SoukOnline.");
        }
    }

    public double calculerFraisPort(String ville) {
    
        double frais = ville.equalsIgnoreCase("Tunis") ? 7.0 : 10.0; 
        System.out.println("Frais de port (" + ville + ") : " + frais + " DT");
        return frais;
    }
}