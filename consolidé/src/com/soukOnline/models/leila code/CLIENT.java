package com.soukOnline.models;

public class Client extends Utilisateur {
    private String adresseLivraison;
    private int nombreCommandes;

    public Client(int id, String email, String motDePasse, String role, String adresseLivraison) {
        super(id, email, motDePasse, role);
        this.adresseLivraison = adresseLivraison;
        this.nombreCommandes = 0;
    }

    public void afficherClient() {
        System.out.println("Client : " + getEmail() + " | Adresse : " + adresseLivraison);
    }

    public String getAdresseLivraison() { return adresseLivraison; }
    public void setAdresseLivraison(String adresseLivraison) { this.adresseLivraison = adresseLivraison; }
}