package DebutJava;

import java.util.Scanner;
public class boucleFor {
    public static void main(String[] args) {
        Scanner clavier=new Scanner(System.in); //input du clavier
        System.out.println("table multi début : ");
        int X = clavier.nextInt(); //
        System.out.println("fin à la table multi : ");
        int finMulti = clavier.nextInt();


        for (int i=X; i<=finMulti; i ++){
            System.out.printf("\nTable de multiplication par %d\n==============\n",i);
            for(int j=1;j<=10;j++){
                System.out.printf("%d x %d = %d\n",i,j,i*j);
            }
        }
    }
}
