public class Tirelire {
    private double montant;

    public Tirelire(double montant) {
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }
    public void remplir(double montant) {
        if(montant>0){
            this.montant += montant;
        }
    }
    public void puiser(double montant){
        if(montant>0){
            if(montant > this.montant){
                this.montant = 0;
            }
            this.montant -= montant;
        }
    }
    public String afficher(){
        if(montant <= 0){
            return "C'est vide ! Donne moi des pieces !\n";
        }else {
            return "Vous avez : "+montant+"$ dans votre tirelire\n";
        }
    }
    public String secouer(){
        if(montant <= 0){
            return "...";
        }else {
            return "Bing ding!\n";
        }
    }
    public void vider(){
        this.montant = 0;
    }

    public double calculerSolde(double montant){
        double solde = this.montant -montant; //difference tirelire -montant
        if(montant >= this.montant){
            System.out.println("Pas assez dans la tirelire");
            return  solde=0;
        }
        return solde;
    }
}
