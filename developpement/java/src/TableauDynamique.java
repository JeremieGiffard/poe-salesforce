import java.util.ArrayList;

public class TableauDynamique {
    public static void main(String[] args) {
        ArrayList<Integer> nombres=new ArrayList<>();
        int nb=3;
        nombres.add(nb);
        ArrayList<String> fruits=new ArrayList<>();
        System.out.println("Taille : "+fruits.size());
        fruits.add("Pommes");
        System.out.println("Taille après ajout de la pomme : "+fruits.size());
        fruits.add("Orange");
        System.out.println("Taille après ajout de 'orange : "+fruits.size());

//        Lecture
        System.out.println("Index 0 : "+fruits.get(0));
        System.out.println("Index 1 : "+fruits.get(1));

//        Changer la valeur d'un input
        fruits.set(1,"ananas");
        System.out.println("Index 1 après changement : "+fruits.get(1));

//        Tester si le tableau est vide
        if(fruits.isEmpty()){
            System.out.println("Le tableau est vide.");
        }else{
            System.out.println("Le tableau n'est pas vide.");
        }

        fruits.add("banane");

        System.out.println("Avant suppression : "+fruits.get(2));

        fruits.remove(2);
        System.out.println("Après suppression : "+fruits.get(2));
//        Vider la tableau
        fruits.clear();
    }
}
