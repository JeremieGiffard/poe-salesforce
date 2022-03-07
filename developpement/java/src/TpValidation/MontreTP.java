package TpValidation;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*******************
*INTERFACE
 * ****************/
interface AffichageDefault {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy \n HH:mm:ss");
    default String displayTime(){
        System.out.println(dtf.format(now));
        return dtf.format(now);
    }

}

interface cadran{
   ArrayList<Mecanisme> typeMecanisme = new ArrayList<>();

    default String reveil(int arr){
        System.out.println("reveil à "+arr+"H");
        return "reveil à "+arr+"H";
    }
}

/***************
* CLASS
*
 **************/

class Produit{
    private String nom;
    private double prix;

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public double prix(){
        return prix;
    }

    public Produit(String nom,double prix) {//constructor
        this.nom = nom;
        this.prix = prix;
    }

    public String toString() {
        System.out.println("nom='"+nom+", prix=" + prix+"\n");
        return "nom='"+nom+", prix=" + prix;
    }
}

class Mecanisme extends Produit implements AffichageDefault {
    private String type;
    public Mecanisme(String nom,double prix, String type) {
        super(nom,prix);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String toString() {
        System.out.println("nom="+super.getNom()+", prix=" + super.prix()+", type="+type+"\n");
        return super.getNom()+super.prix() +type;
    }
    @Override
     public String displayTime(){
        if(type== "digital"||type== "double"){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" HH:mm:ss");
            System.out.println(dtf.format(now));
            return dtf.format(now);
        }
        System.out.println(dtf.format(now));
        return dtf.format(now);
    }
}

class Accessoire extends Produit{
    public Accessoire(String nom,double prix) {
        super(nom,prix);
    }

}

class Montre extends Produit{
    public Montre(String nom,double prix) {
        super(nom,prix);

    }
}

/************
 * PANIER
 */

class Panier  {
    private ArrayList<Produit> composants;
    private String panier;

    public Panier(String panier) {
        this.panier = panier;
        composants = new ArrayList<>();
    }

    public void ajouter(Produit item){
        if (item!=null){
            composants.add(item);
        }
    }

    public double prix(){
        double prix=0;
        for(Produit item: composants){
            prix += item.prix();
        }
        System.out.println(prix);
        return prix;
    }
    public String toString() {
        String chaine;
        chaine = panier + " composé de  :\n";
        for (Produit item : composants) {
            chaine += "- " + item.getNom() +" -> "+item.prix()+" Euros"+ "\n";
        }
        chaine+="Prix total : " + prix() + " Euros\n";
        System.out.println(chaine);
        return chaine;
    }

}

public class MontreTP {
    public static void main(String[] args) {

        Panier coffret1 = new Panier("coffret1");
        coffret1.ajouter(new Montre("montreTM",4));
        coffret1.ajouter(new Mecanisme("analog200",30,"analogique"));
        coffret1.ajouter(new Accessoire("bracelet cuir",35));
        coffret1.ajouter(new Accessoire("vitre",15));
        coffret1.ajouter(new Accessoire("fermoir",12));
        coffret1.ajouter(new Accessoire("boitier",25));



        coffret1.prix();
        coffret1.toString();

        Mecanisme analogique3000 = new Mecanisme("anloPremium",40,"analogique"); //test digital ou analogique
        analogique3000.displayTime();
        analogique3000.toString();

    }
}