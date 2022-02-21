import java.util.Scanner;

public class tp2Message {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("Entrer votre nom : ");
        String nom = clavier.next(); //


        System.out.println("Entrer votre prenom : ");
        String prenom = clavier.next(); //

        System.out.println("Entrer votre age : ");
        int age = clavier.nextInt(); //

        System.out.printf("Vous vous appellez %s %s , et vous avez %d ans",nom,prenom,age);


    }
}
