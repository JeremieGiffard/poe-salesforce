public class Souris {
    private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

    static final int ESPERANCE_VIE_DEFAULT =36;
    public Souris(int poids, String couleur) {
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.clonee = false;
        this.age= 0;
        this.esperanceVie = ESPERANCE_VIE_DEFAULT;
        System.out.println("Une nouvelle souris !\n");
    }


    public Souris(Souris argg){ //constructeur copie
        this.poids = argg.poids;
        this.couleur = argg.couleur;
        this.age = argg.age;
        this.clonee = true;
        this.esperanceVie= argg.esperanceVie* 4/5; //verif 4/5 de chaque souris
        System.out.println("clonage d'une souris !\n");
    }

    public String toString(){
        if(clonee==true){
            System.out.println("Une souris "+couleur+", clonée de "+age+" mois et pesant "+poids+" grammes\n");
        }else
        System.out.println("Une souris "+couleur+" de "+age+"mois et pesant "+poids+" grammes\n");
        return "bla";
    }
    public void vieillir(){
        age++;
        if(clonee=true && age> esperanceVie/2){
            couleur = "verte";
        }
    }
    public void evolue(){
        for (int i = age; i< esperanceVie; i++){
            vieillir();
        }
    }
}
