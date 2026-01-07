package aurelie.javabnb;

import aurelie.javabnb.outils.Utile;
import aurelie.javabnb.reservations.Sejour;
import aurelie.javabnb.utilisateurs.Personne;
import aurelie.javabnb.logements.Logement;

import static aurelie.javabnb.outils.Utile.construireDate;

public class Main {
    public static void main(String[] args) {

        //Exercice 2.2
        Personne personne1 = new Personne("Moon", "Sailor", 30);
        Personne personne2 = new Personne("CraCra", "Mimi", 65);
        Personne personne3 = new Personne("Mins", "Moo", 20);
        Personne personne4 = new Personne("Ro", "Toto", 50);

        personne1.afficher();
        personne2.afficher();
        personne3.afficher();
        personne4.afficher();

        //Exercice 2.3
        Logement logement1 = new Logement( personne1 , 60, "1 rue de la paix 37000 Tours", 70, 4);
        Logement logement2 = new Logement( personne1 , 80, "3 rue de la paix 37000 Tours", 90, 6);
        Logement logement3 = new Logement( personne2 , 50, "1080 rue pasteur 49000 Angers", 50, 2);
        Logement logement4 = new Logement( personne3 , 320, "200 rue des fleurs 75000 Paris", 120, 8);
        Logement logement5 = new Logement( personne4 , 100, "5 avenue des champs 33000 Bordeaux", 90, 5);

        logement1.afficher();
        logement2.afficher();
        logement3.afficher();
        logement4.afficher();
        logement5.afficher();


        //Exercice 2.4
        Sejour sejour1 = new Sejour( construireDate(5, 7,2024) , 4, logement1, 4);

        sejour1.afficher();
    }

}