package DebutJava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tp30StringIdentique {
    static String StringRepeat(String chaine){
        String regex = "(.)\\1";  //  \1 cherche groupe d'avant  . pour tout charactère
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(chaine); //Match input

        if (!(matcher.find())) { //if not found
            return "not found";
        }
        return chaine;
    }
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Rentrez une phrase");
        String phrase=clavier.nextLine();

        System.out.println("Input : "+phrase);
        System.out.println("Output : "+StringRepeat(phrase));
    }
}
