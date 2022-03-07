package DebutJava;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email="jgiffard@hotmail.fr";
        System.out.println(email.charAt(0));

        for (int i=0; i<email.length(); i++){
            System.out.println(i+" => "+email.charAt(i));
        }

        System.out.println("Entrez caractère à rechercher : ");
        String lettre= input.nextLine();
        System.out.println("le caractère "+lettre+"se trouve à la position "+email.indexOf(lettre));

        String oldChar,newChar;


    }
}
