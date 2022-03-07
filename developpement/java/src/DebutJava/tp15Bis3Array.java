import java.util.Scanner;
public class tp15Bis3Array {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int Total=0;

            System.out.print("Entrez la taille du tableau : ");
            int tailleDuTableau = input.nextInt();
            int[] notes1 = new int[tailleDuTableau];
            System.out.println("\n Remplissage du tableau 1\n===============");
            for (int i = 0; i < notes1.length; i++) {
                System.out.printf("Note[%d] : ", i);
                notes1[i] = input.nextInt();

                if(notes1[i] % 3 ==0){
                    Total += notes1[i];
                }
            }
            System.out.print("Entrez la taille du tableau 2 : ");
            int tailleDuTableau2 = input.nextInt();
            int[] notes2 = new int[tailleDuTableau2];
            System.out.println("Remplissage du tableau 2\n===============");
            for (int i = 0; i < notes2.length; i++) {
                System.out.printf("Note[%d] : ", i);
                notes2[i] = input.nextInt();

                if(notes2[i] % 3 ==0){
                    Total += notes2[i];
                }
            }

            System.out.println("Entrez la taille tableau 3 :");
            int tailleDuTableau3 = input.nextInt();
            int[] notes3 = new int[tailleDuTableau3];
            System.out.println("Remplissage du tableau 3\n===============");
            for (int i = 0; i < notes3.length; i++) {
                System.out.printf("Note[%d] : ", i);
                notes3[i] = input.nextInt();

                if(notes3[i] % 3 ==0){
                    Total += notes3[i];
                }
            }



//        Affichage du tableau
            System.out.println("Affichage du tableau\n===============");
            for (int i = 0; i <= notes1.length - 1; i++) {
                System.out.printf("Note[%d] : %d \n", i, notes1[i]);
            }
            System.out.println("Affichage du tableau\n===============");
            for (int i = 0; i <= notes2.length - 1; i++) {
                System.out.printf("Note[%d] : %d \n", i, notes2[i]);
            }
            System.out.println("Affichage du tableau\n===============");
            for (int i = 0; i <= notes3.length - 1; i++) {
                System.out.printf("Note[%d] : %d \n", i, notes3[i]);
            }

            System.out.printf("\n Total multiple de 3 : %d",Total);
        }
    }

