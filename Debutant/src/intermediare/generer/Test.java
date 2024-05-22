/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare.generer;

/**
 *
 * @author Makan
 */
public class Test {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("Toyota", "Avensis", "Vert");
        Voiture v2 = new Voiture("Suzuki", "Tourne", "Blanc");
        Voiture v3 = new Voiture("Hundai", "Santac", "Noir");
        Voiture v4 = new Voiture("Ford", "Veil", "Jaune");
        Voiture[] tab = {v1,v2,v3,v4};
        
        for (Voiture v:tab) {
            System.out.println(v);
            System.out.println();
        }
       Personne rt = new Personne("Karim", "Toure", 34);
        Personne rt1 = new Personne("Makan", "Magassa", 67);
         System.out.println(rt1);
    }
 
}
