package TpValidation;

public class Montre {
    public static void main(String[] args) {

    }
}

class Produit{
    private double prix;
    private String nom;

    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}

    public double prix(){
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Produit(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }
    public String toString(){
        return nom + " -> " + prix() + " Euros";
    }
}

class Mecanisme extends Produit{
    private String type;

    public Mecanisme(double prix, String nom, String type) {
        super(prix, nom);
        this.type = type;
    }

}

class Accessoire extends Produit{
    public Accessoire(double prix, String nom) {
        super(prix, nom);
    }
}