package aurelie.javabnb.reservations;

import java.util.Date;
import aurelie.javabnb.logements.Logement;

import static aurelie.javabnb.outils.Utile.formaterDate;

public class Sejour {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;
    }

    public void afficher() {
        System.out.println();
        logement.afficher();
        System.out.println(
                "La date d'arrivée est le " + formaterDate(dateArrivee) + " pour " + nbNuits + " nuits.");
        System.out.println(
                "Le prix de ce séjour est de " + (logement.getTarifParNuit() * nbNuits) + " €.");
    };
}
