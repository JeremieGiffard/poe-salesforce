public class LectureEcriture {
    public static void main(String[] args) {
        int nombre1=45;
        int nombre2=50;
        int somme=nombre1+nombre2;
        System.out.printf("%d + %d = %d \n", nombre1,nombre2,somme);

        double rapport= nombre1/nombre2; //type double, recupere la virgule
        int something= nombre1/nombre2;  //type int, arondi pour entier

        double rapport3=(double)nombre1/(double)nombre2;

        System.out.printf("Rapport 1 : %d / %d = %f \n",nombre1,nombre2,rapport);
        System.out.printf("Rapport 2 : %d / %d = %d \n",nombre1,nombre2,something);
        System.out.printf("Rapport 3 : %d / %d = %f \n",nombre1,nombre2,rapport3);
    }


}

