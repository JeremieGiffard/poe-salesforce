package DebutJava;

public class intro {
    public static void main(String[] args){
        int  age=44; //declaration explicite
        var nombre = 67; //declaration inference
        System.out.println(nombre);
        System.out.println(age);

        String nom="giffard";
        String prenom="jeremie";
        String pays= "france";

        String nom2="gege", prenom2="jerem";

        double poids= 45.2;

        String nomComplet= "jean";
        char genre='m';
        boolean valeur= false;
        boolean estMajeur = age>= 18;

        final double G=9.8; //constante

        System.out.println("vous avez "+age+" ans");
        System.out.printf("vous avez %d ans\n", age); // \n retour ligne
        System.out.printf("Bonjour, vous etes %s %s, vous avez %d ans et vous vivez en %s",nom, prenom,age,pays); // %s String %d Date
    }
}
