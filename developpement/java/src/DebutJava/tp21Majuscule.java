import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tp21Majuscule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez String : ");
        String lettre= input.nextLine();

        StringBuffer modifString = new StringBuffer();
        Matcher match = Pattern.compile("([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(lettre);
        while(match.find()){
            match.appendReplacement(modifString, match.group(1).toUpperCase() + match.group(2).toLowerCase());
        }
        System.out.println(match.appendTail(modifString).toString());


    }
}
