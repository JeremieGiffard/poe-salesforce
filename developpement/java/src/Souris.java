public class Souris {
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

   static final int ESPERANCE_VIE_DEFAULT =36;
    public Souris(int poids, String couleur, int age, int esperanceVie) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = esperanceVie;
    }
    public Souris(){
        this.age= 0;
        this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris argg){ //constructeur copie
        this.poids = argg.poids;
        this.couleur = argg.couleur;
        this.age = argg.age;
        this.esperanceVie= argg.esperanceVie; //verif 4/5 de chaque souris
        System.out.println("clonage d'une souris !");
    }

    public String toString(){
        System.out.println("Une souris "+couleur+"de "+age+"mois et pesant "+poids+"grammes");
        return "bla";
    }
}
