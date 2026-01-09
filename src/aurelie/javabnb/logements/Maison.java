package aurelie.javabnb.logements;

import aurelie.javabnb.utilisateurs.Personne;

public class Maison extends Logement {
    int superficieJardin;
    boolean possedePiscine;

    public Maison(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax, int superficieJardin, boolean possedePiscine) {
        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieJardin = superficieJardin;
        this.possedePiscine = possedePiscine;
    }

    @Override
    public void afficher() {
        super.afficher();

        System.out.println("Le logement est une maison située " + getAdresse() + ".");
        System.out.println("Superficie : " + getSuperficie() + " m²");

        if (superficieJardin > 0) {
            System.out.println("Jardin: Oui (" + superficieJardin + " m²)");
        } else {
            System.out.println("Jardin: Non");
        }

        System.out.println("Piscine: " + (possedePiscine ? "Oui" : "Non"));
    }
}
