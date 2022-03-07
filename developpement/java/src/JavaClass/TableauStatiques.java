package JavaClass;
//import java.util.Scanner;

public class TableauStatiques {
    public static void main(String[] args) {

        /*Scanner input= new Scanner(System.in);
        System.out.println("entrez taille tableau: ");
        int tailleDuTableau = input.nextInt();
        int[] notes = new int[tailleDuTableau];
        //remplissage tableau
        for (int i=0;i<notes.length;i++){
            System.out.printf("Note[%d] :",i);
            notes[i]= input.nextInt();
        }

        //affichage tableau
        System.out.println("Affichage du tableau \n ==============");
        double totalNote =0;
        for (int i=0;i<notes.length; i++){

            System.out.printf("Note[%d] : %d \n",i,notes[i]);
            totalNote += notes[i];
        }
        System.out.printf("Moyenne est : %.1f \n",totalNote/notes.length);

        System.out.println("Autre itération \n =========");
        for(int note:notes){
            System.out.println(note);
        }*/

        // [1,2,3,4,5,6,7,8]
        // [8,7,6,5,4,3,2,1] -> inverse
        // display multiple 15
        int Array[] = {1,2,3,4,5,6,7,8};
        for(int i=Array.length-1; i>=0; --i){
            System.out.print(Array[i]+",");
        }




    }
}
