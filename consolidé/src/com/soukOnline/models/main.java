package consolidé.src.com.soukOnline.models;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SoukOnline - Démonstration Sprint 1 ===");
        System.out.println();

        // 1. Test Authentification (Leila)
        System.out.println("--- Authentification (Leila) ---");
        Client ecommercant = new Client(1, "contact@boutique.tn", "password123", "Tunis Tech", "55123456");
        ecommercant.sinscrire();
        ecommercant.seConnecter("contact@boutique.tn", "password123");
        System.out.println();

        // 2. Test Catalogue & Stock (Ghofrane)
        System.out.println("--- Gestion Catalogue (Ghofrane) ---");
        Produit p1 = new Produit(101, "Smartphone X", 1200.0, 5, 2);
        p1.ajouterProduit();
        p1.verifierStock();
        System.out.println();

        // 3. Test Panier & Livraison (Lina)
        System.out.println("--- Panier & Logistique (Lina) ---");
        Panier monPanier = new Panier(500);
        monPanier.ajouterAuPanier(p1.getNom(), p1.getPrixVente());
        
        Livraison maLivraison = new Livraison("TRK-9988", "Sousse");
        maLivraison.mettreAJourStatutLivraison("EXPEDIE");
        System.out.println();

        // 4. Test Paiement & Finance (Hamza)
        System.out.println("--- Paiement & Finance (Hamza) ---");
        Paiement transaction = new Paiement(9001, 1200.0, "EDinar");
        transaction.simulerPaiement();
        transaction.genererRecu();
        
        // Simulation du profit : (Revenus, Pub, Livraison, Achat)
        Finance maCompta = new Finance(1200.0, 50.0, 10.0, 800.0);
        maCompta.afficherAnalyse();
        System.out.println();

        // 5. Test Dashboard (Abdelkader)
        System.out.println("--- Dashboard & Stats (Abdelkader) ---");
        Dashboard adminDash = new Dashboard(1, "Leila (Tunis Tech)");
        adminDash.afficherEvolutionVentes();
        adminDash.genererRapportJournalier();

        System.out.println();
        System.out.println("=== Fin de la démonstration : Prototype validé ===");
    }
}