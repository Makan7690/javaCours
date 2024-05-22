/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

public class Traitemt1 {
    protected String Prenom;
    protected String Nom;
    protected int Age;
    protected String Adresse;
    protected int Tel;
    protected int Idetifiant;
    protected static int NbreDePersonne =0;
    

    public Traitemt1() {
     NbreDePersonne =NbreDePersonne +1;   
    }

    public Traitemt1(String Prenom, String Nom, int Age, String Adresse, int Tel, int Idetifiant) {
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.Age = Age;
        this.Adresse = Adresse;
        this.Tel = Tel;
        this.Idetifiant = Idetifiant;
        NbreDePersonne =NbreDePersonne +1;
    }

    Traitemt1(String ramata, String traore, int i, String bamako, int i0, int i1, String femme) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getPrenom() {
        return Prenom;
    }
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    public int getAge() {
        return Age;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public String getAdresse() {
        return Adresse;
    }
    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }
    public int getTel() {
        return Tel;
    }
    public void setTel(int Tel) {
        this.Tel = Tel;
    }
    public int getIdetifiant() {
        return Idetifiant;
    }
    public void setIdetifiant(int Idetifiant) {
        this.Idetifiant = Idetifiant;
    }
    public String toString() {
       String makan = "Votre prenom est "+this.getPrenom()+"\n"
               + "Votre nom est: "+this.getNom()+"\n"
               + "Votre age est: "+this.getAge()+"\n"
               + "Votre adresse est: "+this.getAdresse()+"\n"
               + "Votre tel est: "+this.getTel()+"\n"
               + "Votre identifiant est: "+this.getIdetifiant();
               return makan;
    }
    public static int getNbreDePersonne() {
        return NbreDePersonne;
    }

}
