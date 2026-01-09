package aurelie.javabnb;

import aurelie.javabnb.logements.Appartement;
import aurelie.javabnb.logements.Logement;
import aurelie.javabnb.logements.Maison;
import aurelie.javabnb.reservations.Sejour;
import aurelie.javabnb.utilisateurs.Hote;
import aurelie.javabnb.utilisateurs.Personne;

import static aurelie.javabnb.outils.Utile.construireDate;

public class Main {
    public static void main(String[] args) {

        //Tp3-2
        //Hote hote1 = new Hote("Moon", "Sailor", 30, 2);
        //Hote hote2 = new Hote("CraCra", "Mimi", 65, 18);
        //Hote hote3 = new Hote("Mins", "Moo", 20, 1);
        //Hote hote4 = new Hote("Ro", "Toto", 50, 5);

        Personne hote1 = new Hote("Moon", "Sailor", 30, 2);
        Personne hote2 = new Hote("CraCra", "Mimi", 65, 18);
        Personne hote3 = new Hote("Mins", "Moo", 20, 1);
        Personne hote4 = new Hote("Ro", "Toto", 50, 5);


        Logement logement1 = new Appartement(hote1, 60, "1 rue de la paix 37000 Tours", 70, 4, 10, 2);
        Logement logement2 = new Appartement(hote1, 80, "3 rue de la paix 37000 Tours", 90, 6, 0, 0);
        Logement logement3 = new Maison(hote2, 50, "1080 rue pasteur 49000 Angers", 50, 2, 0, false);
        Logement logement4 = new Maison(hote3, 320, "200 rue des fleurs 75000 Paris", 120, 8, 450, true);
        Logement logement5 = new Maison(hote4, 100, "5 avenue des champs 33000 Bordeaux", 90, 5, 200, false);

        logement1.afficher();
        logement2.afficher();
        logement3.afficher();
        logement4.afficher();
        logement5.afficher();


        //Exercice 2.4
        Sejour sejour1 = new Sejour(construireDate(5, 7, 2024), 4, logement3, 4);

        sejour1.afficher();
    }
}