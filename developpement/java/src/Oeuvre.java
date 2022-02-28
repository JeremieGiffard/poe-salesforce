public class Oeuvre {
    private String titre;
    private String auteur ;
    private String langue;

    public Oeuvre(String titre,String auteur, String langue){
        this.titre = titre;
        this.auteur = auteur;
        this.langue = langue;
    }
    public Oeuvre(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
        this.langue = "francais";
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getLangue() {
        return langue;
    }
    public String afficher(){
        System.out.println(titre+","+auteur+", en "+langue+"\n");
        return titre+","+auteur+", en "+langue;
    }
}
