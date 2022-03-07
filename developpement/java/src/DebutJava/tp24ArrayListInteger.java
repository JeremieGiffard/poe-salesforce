package DebutJava;

import java.util.ArrayList;
import java.util.Scanner;
public class tp24ArrayListInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nombres=new ArrayList<>();
        char verif;
        do {
            System.out.print("Entrez un nombre : ");
            nombres.add(input.nextInt());
            System.out.print("Continuer y/n ? : ");
            verif = input.next().charAt(0);
        }while (verif== 'y');
        System.out.println(nombres);

        ArrayList<Integer> nombresToRemove=new ArrayList<>();
        do {
            System.out.print("Entrez un nombre à enlever : ");
            nombresToRemove.add(input.nextInt());

            System.out.print("Continuer y/n ? : ");
            verif = input.next().charAt(0);
        }while (verif== 'y');
        nombres.removeAll(nombresToRemove);
        System.out.println(nombres);

    }
}
