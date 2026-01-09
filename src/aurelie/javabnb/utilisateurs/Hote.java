package aurelie.javabnb.utilisateurs;

public class Hote extends Personne {
    private final int delaiDeReponse;

    public Hote(String nom, String prenom, int age, int delaiDeReponse) {
        super(nom, prenom, age);
        this.delaiDeReponse = delaiDeReponse;
    }

    @Override
    public void afficher() {
        super.afficher();

        if (this.delaiDeReponse > 1) {
            System.out.println(" qui s'engage à répondre dans les " + delaiDeReponse + " heures");
        } else {
            System.out.println(" qui s'engage à répondre dans l'heure");
        }
    }
}
