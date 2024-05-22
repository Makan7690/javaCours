/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision.heritage;
import revision.Traitemt1;

/**
 *
 * @author Makan
 */
public class Homme extends Traitemt1{
   protected final String sexe = "Homme";

    public Homme() {
    }
     public Homme(String Prenom, String Nom, int Age, String Adresse, int Tel, int Idetifiant) {
        this.Prenom = Prenom;
        this.Nom = Nom;
        this.Age = Age;
        this.Adresse = Adresse;
        this.Tel = Tel;
        this.Idetifiant = Idetifiant;
     }
    public String getSexe() {
        return sexe;
    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Votre sexe est: "+this.getSexe();
                                }
   
}
