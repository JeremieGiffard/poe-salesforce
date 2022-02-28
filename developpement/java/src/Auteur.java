public class Auteur {
    private String nom;
    private Boolean prime;

    public Auteur(String nom, boolean prime){
        this.nom = nom;
        this.prime = prime;
    }
    public String getNom(){
        System.out.println(nom);
        return nom;
    }
    public Boolean getPrix(){
        if (prime == true){
            System.out.println(true);
            return true;
        }
        return false;
    }
}
