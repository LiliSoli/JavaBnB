package aurelie.javabnb.logements;

import aurelie.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {
    int superficieBalcon;
    int numeroEtage;

    public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieBalcon, int numeroEtage) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieBalcon = superficieBalcon;
        this.numeroEtage = numeroEtage;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Le logement est un appartement situé " + getAdresse() + " au" + getNumeroEtage() + ".");
        System.out.println("Superficie : " + getSuperficie() + " m²");

        if (superficieBalcon > 0) {
            System.out.println("Balcon: Oui (" + superficieBalcon + " m²)");
        } else {
            System.out.println("Balcon: Non");
        }
    }

    // Méthode pour le numéro d'étage
    private String getNumeroEtage() {
        if (numeroEtage == 0) {
            return " rez-de-chaussée ";
        } else if (numeroEtage == 1) {
            return " premier étage ";
        } else {
            return " " + numeroEtage + "ème étage ";
        }
    }
}
