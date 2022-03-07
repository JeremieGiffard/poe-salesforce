public class MotStatic {
    public static void main(String[] args) {
        //Physique phy= new Physique();
        Physique.vitesse(4,6);
        Math.pow(4,2);
    }
}

class Physique{
    public static double vitesse(double distance, double temps){
        return  distance/temps;
    }
}