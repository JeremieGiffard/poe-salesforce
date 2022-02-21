import java.util.Scanner;
public class cercle {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); //input du clavier
        System.out.println("Entrer le diametre : ");
        int diametre = clavier.nextInt();
        final double PI = Math.PI;

        double surface = (double)diametre * PI;
        System.out.printf("le diametre est %d et l'aire est %f \n", diametre,surface);

    }
}
