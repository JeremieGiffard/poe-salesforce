package DebutJava;

import java.util.Scanner;

public class TP8ResoudreEquation {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("a : ");
        int A = clavier.nextInt(); //

        System.out.println("b : ");
        int B = clavier.nextInt(); //

        System.out.println("c : ");
        int C = clavier.nextInt(); //

        double delta = Math.pow(B,2) - 4*(A*C);

        if (delta < 0){ // case no solution
            System.out.printf("L'équation %dX² + %dX + %d =0  n'a pas de solution \n",A,B,C);
        }
        else {
            if (delta == 0){ //case 1 solution
                double delta1 = -( (double)B/(2*(double)A ) );
                System.out.printf("L'équation %dX² + %dX + %d =0  a une unique solution : \n  X = %.1f",A,B,C,delta1);
            }
            else{ //case 2 solutions
                double delta2 = (-(double)B - Math.sqrt(delta) )/(2*(double)A ) ;
                double delta3 = (-(double)B + Math.sqrt(delta) )/(2*(double)A ) ;
                System.out.printf("L'équation %dX² + %dX + %d =0  a deux solutions distinctes : \n  X = %.1f ou X = %.1f",A,B,C,delta2,delta3);
            }
        }

    }
}
