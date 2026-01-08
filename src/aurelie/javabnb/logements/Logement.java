package aurelie.javabnb.logements;

import aurelie.javabnb.utilisateurs.Hote;

public class Logement {
    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
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
