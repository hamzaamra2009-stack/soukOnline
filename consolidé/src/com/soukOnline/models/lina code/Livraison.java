package com.soukOnline.models;

public class Livraison {
    private String codeSuivi;
    private String destination;
    private String statut; // EN_PREPARATION, EXPEDIE, LIVRE, RETOUR

    
    public Livraison() {}

 
    public Livraison(String codeSuivi, String destination) {
        this.codeSuivi = codeSuivi;
        this.destination = destination;
        this.statut = "EN_PREPARATION";
    }

   
    public void mettreAJourStatutLivraison(String nouveauStatut) {
        this.statut = nouveauStatut;
        System.out.println("--- Hub Logistique SoukOnline ---");
        System.out.println("Mise à jour Colis " + codeSuivi + " : Nouveau statut -> " + statut);

        if (statut.equals("LIVRE")) {
            System.out.println("Notification : Le client a reçu son colis à " + destination);
        }
    }

    public void afficherDetailsLivraison() {
        System.out.println("Suivi : " + codeSuivi + " | Destination : " + destination + " | État : " + statut);
    }

  
    public String getCodeSuivi() { return codeSuivi; }
    public void setCodeSuivi(String codeSuivi) { this.codeSuivi = codeSuivi; }

    public String getStatut() { return statut; }
}
