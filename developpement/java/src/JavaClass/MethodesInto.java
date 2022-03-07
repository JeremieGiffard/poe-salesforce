package JavaClass;

import java.util.ArrayList;

public class MethodesInto {
    static int calculerSomme(int nombre1, int nombre2){
        return nombre1+nombre2;

    }

    static void ajouterFruit(String nomFruit, ArrayList<String> fruits){
        fruits.add(nomFruit);
    }

    static double multiply(double nombre){  //surcharge
        return nombre*nombre;
    }
    static double multiply(double nombre,double nombre2){
        return nombre*nombre2;
    }

    public static void main(String[] args) {
    int a=8;
    int b=9;
    int somme = calculerSomme(a,b);
        System.out.printf("%d + %d = %d",a,b,somme);


        ArrayList<String> f=new ArrayList<>();
        f.add("pommes");
        f.add("mangues");
        System.out.println("\nTableau avant l'appel de la méthode ajouterFruit() : "+f);
        ajouterFruit("ananas",f);
        ajouterFruit("poire",f);
        System.out.println("Tableau après l'appel de la méthode ajouterFruit() : "+f);


        System.out.println("Avec un argument : "+multiply(7));
        System.out.println("Avec 2 arguments : "+multiply(7,3));
    }
}
