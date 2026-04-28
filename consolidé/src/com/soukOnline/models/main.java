import com.soukOnline.models.*;

public class Main {
    public static void main(String[] args) {
        // 1. INITIALISATION DU SYSTÈME (AGL & Sprint 1)
        System.out.println("========== BIENVENUE SUR SOUKONLINE (Sprint 2) ==========\n");

        // Membre Leila : Création d'un client
        Client client = new Client(1, "hamza@email.tn", "password123", "Tunis");

        // Membre Ghofrane : Création du catalogue et des produits
        Produit p1 = new Produit(101, "Smartphone Samsung", 1200.0, 5, 2);
        Produit p2 = new Produit(102, "Ecouteurs Bluetooth", 150.0, 10, 3);
        Categorie catElectronique = new Categorie(1, "Electronique", "Gadgets et mobiles");
        catElectronique.ajouterProduitALaCategorie(p1);
        catElectronique.ajouterProduitALaCategorie(p2);

        // Membre Hamza : Initialisation de la finance
        Finance finance = new Finance(0, 50.0, 20.0, 500.0); // revenus, pub, liv, achat
        
        // Membre Abdelkader : Dashboard
        Dashboard adminDash = new Dashboard("Hamza Admin");

        // 2. SCÉNARIO D'UTILISATION (Logique Réelle & Interactions)

        // Étape A : Authentification (Leila)
        if (client.seConnecter("hamza@email.tn", "password123")) {
            
            // Étape B : Gestion du Panier (Lina)
            Panier panier = new Panier(501);
            panier.ajouterProduit(p1, 1); // Interaction Lina -> Ghofrane (vérifie stock)
            panier.ajouterProduit(p2, 2);

            double totalAchat = panier.getTotalPrix();
            double fraisPort = panier.calculerFraisPort("Tunis");
            double montantAFacturer = totalAchat + fraisPort;

            // Étape C : Paiement et Mise à jour des stocks (Hamza -> Ghofrane)
            Paiement paiement = new Paiement(999, "EDinar");
            // Interaction Hamza -> Ghofrane : traiterCommande déduit le stock si payé
            boolean succesPaiement = paiement.traiterCommande(p1, 1); 

            if (succesPaiement) {
                // Étape D : Fidélité et Livraison (Leila & Lina)
                client.enregistrerAchat(montantAFacturer); // Interaction Leila
                
                Livraison liv = new Livraison("TRK-789");
                liv.declencherExpedition(paiement); // Interaction Lina -> Hamza (vérifie statut)
                
                // Étape E : Mise à jour Finance et Dashboard (Hamza & Abdelkader)
                finance.setRevenusTotaux(montantAFacturer);
                adminDash.genererRapportDynamique(finance); // Interaction Abdelkader -> Hamza
            }
        }

        System.out.println("\n========== FIN DE LA SIMULATION SOUKONLINE ==========");
    }
}