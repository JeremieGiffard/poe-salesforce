import java.util.Scanner;
public class LectureEcriture2 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("Entrer votre distance : ");
        int distance = clavier.nextInt(); //
        System.out.println("Entrer la temps : ");
        int temps= clavier.nextInt();

        double vitesse=(double)distance/(double)temps;
        System.out.printf("%d + %d = %f",distance,temps,vitesse);
    }
}


//vitesse?
//distance parcourue
//temps  =
//v=e/t