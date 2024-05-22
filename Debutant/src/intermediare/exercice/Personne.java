/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare.exercice;

/**
 *
 * @author Makan
 */
public class Personne {
    private String prenom ;
    private String nom ;
    private int age ;
    
    public Personne(){
         } 
    public Personne(String prenom, String nom, int age){
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
      this.prenom =  prenom;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
     this.nom = nom;   
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
      this.age = age;
    }
    

    @Override
    public String toString() {
        String pres = "Prenom: "+this.getPrenom()+"\n"
                  + "Nom: "+this.getNom()+"\n"
                  + "Age: "+this.getAge();
        return pres;
    }
    
}