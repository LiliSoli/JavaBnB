package aurelie.javabnb.outils;

import java.util.Date;

public class Utile {

    // Exercice 3.3: Constructeur privé
        private Utile() {
        }

        // Méthode 1
    /**
     *
     * @param jour le jour de ma date entre 1 et 31
     * @param mois le mois, entre 1 et 12
     * @param annee l'année
     * @return date bien initialisée
     */
        public static Date construireDate(int jour, int mois, int annee) {
        return new Date(annee -1900, mois -1, jour);
        }

        // Méthode 2
        public static String formaterDate(Date date) {
            int jour = date.getDate();
            int mois = date.getMonth() +1;
            int annee = date.getYear() +1900;

            String jourString = "";
            if (jour < 10) {
                jourString = "0" + jour;
            }else {
                jourString = "" + jour;
            }

            String moisString = "";
            if (mois < 10){
                moisString = "0" + mois;
            } else {
                moisString = "" + mois;
            }

            return jourString + "/" + moisString + "/" + annee;
        }
}
