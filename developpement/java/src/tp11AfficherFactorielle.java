import java.util.Scanner;
public class tp11AfficherFactorielle {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); //input du clavier
        System.out.println("Nombre : ");
        int X = clavier.nextInt(); //

       int factorielle = 1;

        for(int j=1;j<=X;j++){
            factorielle = factorielle * j;
        }
        System.out.printf("Factorielle de %d : %d",X, factorielle);
    }

}
