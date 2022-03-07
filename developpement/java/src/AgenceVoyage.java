import java.util.ArrayList;


class OptionVoyage{
    private String nom;
    private double prix;

    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }

    public OptionVoyage(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }
    public OptionVoyage(){} //default

    public String toString(){
        System.out.println(nom+"->"+prix+"CHF");
        return nom+"->"+prix+"CHF";
    }
}

class Transport extends OptionVoyage{
    private boolean trajetLong;
    public static final double TARIF_LONG=1500;
    public static final double TARIF_BASE=200;

    public Transport(String nom, double prix, boolean trajetLong) {
        super(nom, prix);
        this.trajetLong = trajetLong;
    }
    public double getPrix() {
        if(trajetLong){
           return TARIF_LONG+super.getPrix();
        }else{
            return TARIF_BASE+super.getPrix();
        }
    }
}

class Sejour extends OptionVoyage{
    private int nombreNuit;
    private double prixNuit;

    public Sejour(String nom, double prix, int nombreNuit, double prixNuit) {
        super(nom, prix);
        this.nombreNuit = nombreNuit;
        this.prixNuit = prixNuit;
    }

    public double getPrix() {
        return nombreNuit*prixNuit+super.getPrix();
    }
}

class KitDeVoyage{
    private String depart;
    private String destination;
    private double prixTotal;
    ArrayList<OptionVoyage> allVoyage;

    public KitDeVoyage(String depart, String destination) {
        this.depart = depart;
        this.destination = destination;
        allVoyage = new ArrayList<OptionVoyage>();
    }

    public double getPrix(){
        for(OptionVoyage item: allVoyage){
        prixTotal += item.getPrix();
        }
        System.out.println(prixTotal);
        return prixTotal;
    }

}

public class AgenceVoyage {
    public static void main(String[] args) {

    }
}