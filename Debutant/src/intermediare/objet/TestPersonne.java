/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare.objet;
/**
 *
 * @author Makan
 */
public class TestPersonne {
    public static void main(String[] args) {
//        Instance de la classe Personne (Objet Personne)
        Personne p1 = new Personne(); // constructeur sans parametre
        Personne p2 = new Personne("Modibo", "Diarra", 20);
        Personne p3 = new Personne("Mariam", "Maiga");
        Personne p4 = new Personne("Karim", "Maiga");
        Personne rt = new Personne("Karim", "Toure", 34);
        Personne rt1 = new Personne("Makan", "Magassa", 67);
        Personne mk = new Personne("Makan", "Magassa", 32);
        Personne[] tou ={p1,p2,p3,p4,rt,rt1,mk};
         System.out.println(rt);
//        System.out.println(p3.getPrenom());
        
//        p3.setPrenom("Amadou");
        System.out.println("Prenom: "+p3.getPrenom()); 
        System.out.println("Nom: "+p3.getNom());
         System.out.println("Age: "+p3.getAge());
        p3.setAge(23);
         System.out.println("Age: "+p3.getAge());
         
        System.out.println(Personne.getNombreDePersonne());
        System.out.println(new Personne("Modibo", "Diarra", 20).toString());
    }
 
}
