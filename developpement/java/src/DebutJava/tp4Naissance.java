import java.util.Scanner;

public class tp4Naissance {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("age : ");
        int age = clavier.nextInt(); //

        int CurrentYear = 2022;

        int naissance = CurrentYear - age;

        System.out.printf("tu as %d ans \n  ton année de naissance est %d",age,naissance);
    }
}
