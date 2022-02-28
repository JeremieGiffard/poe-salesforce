class Personnage{
    private String nom;
    private int dureeDeVie;
    private String pays;


    public Personnage(String nom, int dureeDeVie, String pays){
        this.nom=nom;
        this.dureeDeVie=dureeDeVie;
        this.pays= pays;
    }
    public void rencontrer(){
        System.out.println("je suis heureux de te recontrer");
    }
    public String getPays() {
        return pays;
    }

    public String getNom() {
        return nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }
}


class Guerrier extends Personnage{
    private String arme;
    public Guerrier(String nom,int dureeDeVie, String pays, String arme){
       super(nom,dureeDeVie,pays);
       this.arme=arme;
    }

    public String getArme() {
        return arme;
    }

    public void parler(){
        System.out.println("Je suis "+this.getPays());
    }

    public void rencontrer(){
        super.rencontrer();
        System.out.println("Je vais te frapper fort sur la tete");
    }
}
/*
class Voleur extends Personnage{
    private String arme;
    public void voler(){
        System.out.println("je suis un voleur");
    }
}
class Magicien extends Personnage{
    private String baguette;
}
class Sorcier extends Magicien{
    private String batonMagique;
}*/

public class Heritage {
    public static void main(String[]args){
        Guerrier gruk=new Guerrier("gruk", 35, "france", "marteau");
        gruk.rencontrer();
        System.out.println("Name : "+gruk.getNom());
        System.out.println("Vie : "+gruk.getDureeDeVie());
        System.out.println(("Pays : "+gruk.getPays()));
        System.out.println("Arme : "+gruk.getArme());
    }
}
