/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision.heritage;

/**
 *
 * @author Makan
 */
public class infos {
    protected String prenom;
    protected String nom;
    protected String adresse;
    protected String contact;
public static int nombrepers=0;
    public infos() {
        
    }

    public infos(String prenom, String nom, String adresse, String contact) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.contact = contact;
        nombrepers +=1;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String toString(){
        String hello ="votre Prenom est :"+this.getPrenom()+"\n"+
                "Votre nom est :"+this.getNom()+"\n"+
                "Votre adresse est :"+this.getAdresse()+"\n"+
                "Votre contact est :"+this.getContact();
        return hello;
    }
    public static int getnombrepers(){
        return nombrepers;
    }
}
