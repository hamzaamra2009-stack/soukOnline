package com.soukOnline.models;

public class Utilisateur {
    private int id;
    private String email;
    private String motDePasse;
    private String role;

    public Utilisateur(int id, String email, String motDePasse, String role) {
        this.id = id;
        this.email = email;
        this.motDePasse = motDePasse;
        this.role = role;
    }

    public boolean seConnecter(String emailSaisi, String mdpSaisi) {
        System.out.println("--- Authentification SoukOnline ---");
        
        if (!emailSaisi.contains("@")) {
            System.out.println("Erreur : Format d'email invalide.");
            return false;
        }

        if (this.email.equals(emailSaisi) && this.motDePasse.equals(mdpSaisi)) {
            System.out.println("Bienvenue " + this.email + " ! Accès autorisé en tant que " + this.role + ".");
            return true;
        } else {
            System.out.println("Échec : Email ou mot de passe incorrect.");
            return false;
        }
    }

    public String getEmail() { return email; }
    public String getRole() { return role; }
}
