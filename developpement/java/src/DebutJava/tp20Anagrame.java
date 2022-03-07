package DebutJava;

import java.util.Scanner;

public class tp20Anagrame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un texte : ");
        String texte= input.nextLine();

        System.out.println("Entrez un deusième texte : ");
        String texte2= input.nextLine();

        char[] characters = texte.toCharArray();
        StringBuilder anagram = new StringBuilder(texte2);

        for(char item:characters){
            int index = anagram.indexOf(""+item);
            if(index != -1){
                anagram.deleteCharAt(index);
            }else{
                System.out.println("Pas anagrame ");
            }
        }
        if(anagram.length() ==0){
            System.out.println("c'est anagrame ");
        }
    }
}
