package DebutJava;

import java.util.ArrayList;
import java.util.Scanner;
public class tp23ArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> language=new ArrayList<>();
        String item = "";

        do {
            System.out.print("Entrez un langague : ");
            item = input.nextLine();
            if(item != ""){
                language.add(item);
            }
        }while (item != "");
        System.out.println(language);

        do {
            System.out.print("Entrez un langague à enlever : ");
            item = input.nextLine();
            if(item != ""){
                language.remove(item);
            }
        }while (item != "");
        System.out.println(language);
    }
}
