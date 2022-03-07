import java.util.Scanner;

public class tp3Permutation {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("a : ");
        int A = clavier.nextInt(); //


        System.out.println("b : ");
        int B = clavier.nextInt(); //

        System.out.println("c : ");
        int C = clavier.nextInt(); //

        int tempsInt;
        tempsInt = A;
        A = C;
        C = B;
        B = tempsInt;

        System.out.printf("A= %d, B = %d , C = %d",A,B,C);
    }
}
