import java.util.ArrayList;



class Contact{
    int id;
    String nom;
    ArrayList<Telephone> numeros;
    public Contact(){
        numeros=new ArrayList<>();
    };
}

class Telephone{
    int id;
    String numero;
    Contact contact;
    public Telephone(int id,String numero, Contact c){
        this.id = id;
        this.numero= numero;
        this.contact=c;
    }
}
public class CompositionAgregation {
    static int count=0;
    public static void main(String[] args) {
        var jerem = new Contact();
        jerem.id = 1;
        jerem.nom = "jeremie giffard";
        jerem.numeros.add(new Telephone(3,"+331452365481",jerem));
        jerem.numeros.add(new Telephone(4,"+331455410481",jerem));
    }

}