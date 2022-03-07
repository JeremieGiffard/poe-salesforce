
public class tp16Maison {
    public static void main(String[] args) {

        int annee = 2015;
        int n = 1;
        double deprecie = 225000;

        while (annee > 2002){
            deprecie = deprecie *  Math.pow(1-0.04,n);
            ++n;
            annee = annee-n;
        }

        System.out.printf("valeur de départ 225000, taux 0.04 \n Valeur en l'année 2002 : %f",deprecie);



    }
}
