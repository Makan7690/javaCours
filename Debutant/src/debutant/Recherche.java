/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debutant;

/**
 *
 * @author Makan
 */
public class Recherche {
    public static void main(String[] args) {
        String[] tab = new String[9];
        tab[0] = "Unicite";
        tab[1] = "Dualite";
        tab[2] = "Trinite";
        
        System.out.println("Choisir un nombre entre 1 et 9 : ");
        int n = new java.util.Scanner(System.in).nextInt();
        int rech = n-1;
        
        System.out.println("Voila la signification : ");
        System.out.println(tab[rech]);
    }
}
