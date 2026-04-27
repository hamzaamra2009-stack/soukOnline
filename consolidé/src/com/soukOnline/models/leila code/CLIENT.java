package com.soukOnline.models;

public class Client extends Utilisateur {
    private String nomBoutique;
    private String telephone;

    // Constructeur vide
    public Client() {
        super();
    }

    // Constructeur complet
    public Client(int id, String email, String motDePasse, String nomBoutique, String telephone) {
        super(id, email, motDePasse, "E-COMMERCANT");
        this.nomBoutique = nomBoutique;
        this.telephone = telephone;
    }

    // Méthode métier
    public void sinscrire() {
        System.out.println("Inscription de la boutique " + nomBoutique + " en cours...");
        System.out.println("Un email de confirmation a été envoyé à " + getEmail());
    }

    public void afficherDetails() {
        System.out.println("Boutique : " + nomBoutique + " | Tel : " + telephone);
    }

    // Getters et Setters
    public String getNomBoutique() { return nomBoutique; }
    public void setNomBoutique(String nomBoutique) { this.nomBoutique = nomBoutique; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
}