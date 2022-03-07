
import java.util.Scanner;

public class tp28StringAlternance {
    static String StringToUpperCase(String chaine){
        char[] chars = chaine.toCharArray(); //String to char
        for (int i = 0; i < chaine.length(); i+=2) { //1sur2
            chars[i] = Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Rentrez une phrase");
        String phrase=clavier.nextLine().toLowerCase();
        System.out.println("Input : "+phrase);
        System.out.println("Output: "+StringToUpperCase(phrase));

    }
}
