import java.util.ArrayList;
import java.util.List;

abstract class Personnage{
    private String nom;
    private int dureeDeVie;
    private String pays;

    public Personnage(String nom,int dureeDeVie,String pays){
        this.nom=nom;
        this.dureeDeVie=dureeDeVie;
        this.pays=pays;
    }

    public Personnage(){
        this.nom="Ali";
        this.dureeDeVie=89;
        this.pays="Italie";
    }

    public abstract void rencontrer();

    public abstract void sayHello();

    public String getNom() {
        return nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public String getPays() {
        return pays;
    }


}

class Guerrier extends package2.Personnage {
    private String arme;

    public Guerrier(String nom,int dureeDeVie,String pays,String arme){
        super(nom,dureeDeVie,pays);
//        super();
        this.arme="Toto";
    }

    public String getArme() {
        return arme;
    }

    public void parler(){
        System.out.println("Je suis "+this.getPays());
    }

    @Override
    public void rencontrer() {
        System.out.println("Je vais te massacrer");
    }

    @Override
    public void sayHello() {
        System.out.println("Bonjour");
    }
}

class Heritage {
    public static void main(String[] args) {

        List<Guerrier> users=new ArrayList<>();
        package2.Personnage g=new Guerrier("Jean-Paul",95,"France","Stylo");
        g.rencontrer();


    }
}