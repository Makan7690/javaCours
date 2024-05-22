/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare.objet.cgtech;


public class Personne {
  protected String prenom;  
  protected String nom;  
  protected int age; 
  protected static int Nbrepersonne=0;  

    public Personne() {Nbrepersonne+=1;}
     
    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        Nbrepersonne +=1;
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String  mk ="Votre prenom est: "+this.getPrenom()+"\n"
                + "Votre nom est: "+this.getNom()+"\n"
                + "Votre age est: "+this.getAge();
        return mk;
    }
   public int additionner(int a, int b){
       int somme = a + b;
       return somme;
   }
   public int additionner(int a, int b, int c){
       int somme = a + b + c;
       return somme;
   }
   public static int getNbrepersonne(){
       return Nbrepersonne;
   }
       
   
}
