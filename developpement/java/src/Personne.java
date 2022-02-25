class Personne {
    private String nom;
    private String prenom;
    private String pays;
    private boolean estMarie;
    private int nombreEnfants;


    public Personne(String nom, String prenom, String pays, boolean estMarie, int nombreEnfants) {
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.estMarie = estMarie;
        this.nombreEnfants = nombreEnfants;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }

    public boolean isEstMarie() {
        return estMarie;
    }
    public void setEstMarie(boolean estMarie) {
        this.estMarie = estMarie;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }
    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public String nomComplet(){
        return prenom+" "+nom;
    }
}
