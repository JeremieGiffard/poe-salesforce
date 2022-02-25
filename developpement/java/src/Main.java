

public class Main {
    public static void main(String[] args) {
        /*Scanner input;
        input=new Scanner(System.in);
        Personne moi =new Personne(); //appelle la class Personne
        moi.setNom("giffard");
        moi.setPrenom("jeremie");
        moi.setPays("france");
        moi.setEstMarie(true);
        moi.setNombreEnfants(0);

        System.out.println(moi.getNom()+moi.getPrenom());


        Rectangle exempleRectangle = new Rectangle();
        exempleRectangle.setLargeur(4);
        exempleRectangle.setLongueur(10);
        System.out.println(exempleRectangle.Aire());
        System.out.println(exempleRectangle.perimetre());*/
/*
        Patient vieuxMonsieur = new Patient(45,1.70);
        System.out.println("IMC : "+vieuxMonsieur.calculeIMC());
        System.out.println("Poids : "+vieuxMonsieur.getPoids());*/

        Tirelire myTirelire =new Tirelire( 45);
        myTirelire.remplir(-10);
        System.out.println(myTirelire.getMontant());
        System.out.println(myTirelire.secouer());
        System.out.println(myTirelire.afficher());
        myTirelire.vider();

    }
}
