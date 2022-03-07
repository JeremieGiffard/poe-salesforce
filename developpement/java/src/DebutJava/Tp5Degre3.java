import java.util.Scanner;

public class Tp5Degre3 {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("a : ");
        int A = clavier.nextInt(); //


        System.out.println("b : ");
        int B = clavier.nextInt(); //

        System.out.println("c : ");
        int C = clavier.nextInt(); //

        System.out.println("X : ");
        double X = clavier.nextDouble(); //

        double polynome = ( (((double)A+(double)B)/2)*(Math.pow(X,3))) + (Math.pow(((double)A+(double)B),2)*Math.pow(X,2))+(double)A+(double)B+(double)C;

        System.out.printf("La valeur du polynôme est %f",polynome);
    }
}
