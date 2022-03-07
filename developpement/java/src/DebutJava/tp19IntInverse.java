import java.util.Scanner;

public class tp19IntInverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nombre= input.nextInt();
        System.out.print("Input : "+nombre);
        StringBuilder sb=new StringBuilder( Math.abs(nombre)); //transform to string
        sb.append(nombre);
        sb=sb.reverse();
        int reversedNumber=Integer.parseInt(sb.toString());  // trasform to int
        System.out.printf("\nOutput reverse : %i",nombre>0?reversedNumber:reversedNumber*-1);
    }
}