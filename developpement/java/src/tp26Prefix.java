import java.util.Scanner;

public class tp26Prefix {
    static boolean prefix(String chaine,String prefix){
        return chaine.contains(prefix);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un texte : ");
        String texte= input.nextLine();

        System.out.println("Entrez un deusième texte : ");
        String texte2= input.nextLine();
        System.out.println("Prefix ? : "+prefix(texte,texte2));
    }
}
