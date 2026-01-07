package aurelie.javabnb.utilisateurs;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void afficher() {
        System.out.println(prenom + " " + nom + " (" + age + " ans)");
    }

}
