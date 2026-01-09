package aurelie.javabnb.logements;

import aurelie.javabnb.utilisateurs.Personne;

public class Logement {
    private Personne hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public int getTarifParNuit() {
        return tarifParNuit;
    }

    // Getter superficie pour les classes filles
    public int getSuperficie() {
        return superficie;
    }

    // Getter adresse pour les classes filles
    public String getAdresse() {
        return adresse;
    }

    public void afficher() {
        hote.afficher();

    }

}
