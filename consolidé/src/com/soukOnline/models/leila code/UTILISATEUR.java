package com.soukOnline.models;

public class Utilisateur {
    private int id;
    private String email;
    private String motDePasse;
    private String role;

    // Constructeur vide
    public Utilisateur() {}

    // Constructeur complet
    public Utilisateur(int id, String email, String motDePasse, String role) {
        this.id = id;
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    // Méthodes métiers (Logique simplifiée)
    public boolean seConnecter(String email, String mdp) {
        System.out.println("Tentative de connexion pour : " + email);
        // Logique simplifiée : retourne vrai si les champs ne sont pas vides
        return !email.isEmpty() && !mdp.isEmpty();
    }

    public void modifierProfil(String nouvelEmail) {
        this.email = nouvelEmail;
        System.out.println("Profil mis à jour : " + nouvelEmail);
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Utilisateur [email=" + email + ", role=" + role + "]";
    }
}
