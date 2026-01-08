package aurelie.javabnb.utilisateurs;

public class Hote extends Personne {
    private int delaiDeReponse;

    public Hote(String nom, String prenom, int age, int delaiDeReponse) {
        super(nom, prenom, age);
        this.delaiDeReponse = delaiDeReponse;
    }

    @Override
    public void afficher() {
            System.out.print(getPrenom() + " " + getNom() + " (" + getAge() + " ans)");

        if (this.delaiDeReponse >1) {
            System.out.print(" qui s'engage à répondre dans " + this.delaiDeReponse + " heures");
        } else {
            System.out.print(" qui s'engage à répondre dans l'heure");
        }
    }
}
