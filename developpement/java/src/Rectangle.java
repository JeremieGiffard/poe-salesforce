public class Rectangle {
    private int longueur;
    private int largeur;
    //Aire et perimetre



    public int getLongueur() {
        return longueur;
    }
    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }



    public int getLargeur() {
        return largeur;
    }
    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int Aire(){
        return largeur*longueur;
    }
    public int perimetre(){
        return ((longueur+largeur)*2);
    }
}
