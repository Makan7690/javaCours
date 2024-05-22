/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;

/**
 *
 * @author Makan
 */
public class Revisione {
    protected String nom;
    protected String prenom;
    protected String adresse;
    protected String contact;
    public static int nombrepers = 0;
    public Revisione() {
    }

    public Revisione(String nom, String prenom, String adresse, String contact) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.contact = contact;
        nombrepers+=1;
    }
    public String getnom(){
        return nom;
    }
    public void setnom(String nom){
        this.nom = nom;
    }
    public String getprenom(){
        return prenom;
    }
    public void setprenom(String prenom){
        this.prenom = prenom;
    }
    public String getadresse(){
        return adresse;
    }
    public void setadresse(String adresse){
        this.adresse = adresse;
    }
    public String getcontact(){
        return contact;
    }
    public void setcontact(String contact){
        this.contact = contact;
    }
    @Override
    public String toString(){
       String tres = "Votre nom est :"+this.getnom()+"\n" 
       +"Votre nom est :"+this.getprenom()+"\n" 
       +"Votre nom est :"+this.getadresse()+"\n" 
       +"Votre nom est :"+this.getcontact(); 
       return tres;
    }
    public int getnombrepers(){
        return nombrepers;
    }
}
