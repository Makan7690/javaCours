/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;
import intermediare.objet.Personne;
/**
 *
 * @author Makan
 */
public class Femme extends Personne{
    private final String sexe = "Femme";
    private String prenom;
    private String nom;
    private int age;

    public Femme() {
    }
  public Femme(String prenom, String nom, int age){
      this.prenom = prenom;
      this.nom = nom;
      this.age = age;
  }
  public String getSexe(){
      return sexe;
  }
    public String toString() {
        return super.toString()+"\n"+"Votre sexe est: "+this.getSexe();
    }
}
