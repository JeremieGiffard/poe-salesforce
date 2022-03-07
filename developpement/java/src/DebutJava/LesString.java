import java.util.Scanner;
public class LesString {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        String z=input.nextLine();
        String a="lisangola";
        String b="lisangola";

//      Comparaison des references
        System.out.println(a==b);//true
        System.out.println(a==z);//false
        z=z.intern();
        System.out.println(a==z);//true

//        COmparaison des valeurs
        System.out.println(a.equals(z));
    }

}
