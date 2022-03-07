package package2;

public class LesInterfaces {
    public static void main(String[] args) {

    }
}

class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }
    public void parler(){
        System.out.println("Je parle");
    }
}
interface Ivolail{
    void voler();
}
interface IMetamorphose{
    void changerCouleur();
}


class Warrior extends Person implements Ivolail,IMetamorphose {
    private String arme;

    public Warrior(String name, String arme) {
        super(name);
        this.arme = arme;
    }
    public void voler(){
        System.out.println("I can fly");
    }
    public void changerCouleur(){
        System.out.println("Je peux devenir vert comme Hulk");
    }
}

abstract class Insect{
    private String locomotion;
}

abstract class InsectVolant extends Insect implements Ivolail{

}
class Papillon extends InsectVolant{

    @Override
    public void voler() {

    }
}