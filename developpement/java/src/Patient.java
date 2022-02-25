

public class Patient {
    private double poids;
    private double taille;

    public Patient(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }
    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double calculeIMC(){
        return poids/Math.pow(taille,2);
    }
}
