class User {
    private String nom;
    private int annee;
    private static int count=0;
    public static int countEtudiant=0;
    public User(String nom, int annee) {
        this.nom = nom;
        this.annee = annee;
        count++;
    }
    public static int getCount() {
        return count;
    }
    public boolean estEtudiant(){
        return false;
    }
    public String toString(){
        return nom+"\n"+annee+"\n";
    }

}

class LearningUser extends User {
    private String section;
    public LearningUser(String nom, int annee, String section) {
        super(nom, annee);
        this.section = section;
    }
    public String toString(){
        return super.toString() + section+"\n";
    }
}

class Secretaire extends User {
    public Secretaire(String nom, int annee, String laboratoire) {
        super(nom, annee);
        this.laboratoire = laboratoire;
    }
    private String laboratoire;
    public String toString(){
        return super.toString() +laboratoire+"\n";
    }
}

class Enseignant extends LearningUser {
    private String laboratoire;

    public Enseignant(String nom, int annee, String section, String laboratoire, int salaire) {
        super(nom, annee, section);
        this.laboratoire = laboratoire;
        this.salaire = salaire;
    }
    private int salaire;
    public String toString(){
        return super.toString() + salaire+"\n"+laboratoire+"\n";
    }
};

class EtudiantsEchange extends LearningUser {
    private String Université;

    public EtudiantsEchange(String nom, int annee, String section, String université) {
        super(nom, annee, section);
        Université = université;
        countEtudiant++;
    }
    public String toString(){
        return super.toString() + Université+"\n";
    }
    public boolean estEtudiant(){
        System.out.println("est etudiant ? : TRUE");
        return true;
    }
}

class Etudiant extends LearningUser {
    private double moyenne;

    public Etudiant(String nom, int annee, String section, double moyenne) {
        super(nom, annee, section);
        this.moyenne = moyenne;
        countEtudiant++;
    }
    public String toString(){
        return super.toString() + moyenne+"\n";
    }
    public boolean estEtudiant(){
        return true;
    }
}

public class GestionDuPersonnel {
    public static void main(String[] args) {
       var Nicolas= new Etudiant("Nicolas TOUBOUL",2019,"Computer Science",18.5);
       var salma = new Etudiant("Salma HISTANE",2018,"Philosométrie ",19.8);
var wilfried = new EtudiantsEchange("Wilfried NOUBISSI-FOKOU",2018,"Astrophysique","ancienne université");
var Djiby = new Enseignant("Djiby BALDE",2012,"Astrophysique","Mathématiques Extrêmement Pure(LMEP)",20000);
var Christiene = new Secretaire("Christiane LISANGOLIANNE",2017,"Chimie");

        System.out.println(User.getCount());
        System.out.println(User.countEtudiant);

        System.out.println(Nicolas.toString());
        System.out.println(Djiby.toString());
    }
}