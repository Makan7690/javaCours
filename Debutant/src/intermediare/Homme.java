/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;
import intermediare.objet.Personne;

public class Homme extends Personne{
    private final String sexe = "Homme";

    public Homme() {
    }
    public Homme(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
    public String getSexe() {
        return sexe;
    }
    public String toString() {
        return super.toString()+"\n"+"sexe: "+this.getSexe();
    }
    
}
