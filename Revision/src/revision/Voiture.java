/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;

/**
 *
 * @author Makan
 */
public class Voiture {
    //Attribut
   private String marque; 
   private String modele; 
   private String couleur; 
   private int annee; 
   private String capacite; 
   private Double taille;
   //Constructeur sans parametre
   public Voiture(){   
   }
   //Constructeur avec parametre
   public Voiture(String marque, String modele,String couleur,int annee,String capacite,Double taille){
       this.marque = marque;
       this.modele = modele;
       this.couleur = couleur;
       this.annee = annee;
       this.capacite = capacite;
       this.taille = taille;
   }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    public String getCapacite() {
        return capacite;
    }
    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }
    public Double getTaille() {
        return taille;
    }
    public void setTaille(Double taille) {
        this.taille = taille;
    }
    @Override
    public String toString(){
        String qw = "Votre marque est :"+this.getMarque()+"\n"+
                "Votre modele est :"+this.getModele()+"\n"+
                "Votre couleur est :"+this.getCouleur()+"\n"+
                "Votre annee est :"+this.getAnnee()+"\n"+
                "Votre capcite est :"+this.getCapacite()+"\n"+
                "Votre taille est :"+this.getTaille();
        return qw;
    }
}
