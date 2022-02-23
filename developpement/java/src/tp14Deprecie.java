import java.util.Scanner;
public class tp14Deprecie {
    public static void main(String[] args) {
        /*Scanner clavier = new Scanner(System.in); //input du clavier
        System.out.println("année : ");
        int X = clavier.nextInt(); //*/
        int anneeFinale;
        int n = 1;
        double deprecie = 40000;

        while (deprecie > 5000){
            deprecie = deprecie *  Math.pow(1-0.07,n);
            ++n;

        }
        anneeFinale = 2015+n;
            System.out.printf("valeur de départ 40 000, taux 0.07 \n Valeur de 5000 en l'année : %d",anneeFinale);
        /*
        for (int j = 2015; j <= X; j++) {
            deprecie = 40000 *  Math.pow(1-0.07,X-2015);
        }
        System.out.printf("valeur en %d : %.01f", X, deprecie);
        */


    }
}

//en quelle année valeur est de 5000euro