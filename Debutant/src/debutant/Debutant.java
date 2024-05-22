/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debutant;

import intermediare.Factoriel;
import intermediare.objet.Personne;

/**
 *
 * @author Makan
 */
public class Debutant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TO  DO code application logic here
        System.out.println(5);
        System.out.println("Bonjour tout le monde");
        System.out.println("la somme de 4 et 3 est:9");
        //variables
        //c'est une zone memoire permettant de stocker une donnee (un nombre, un caractere, un text,...)
        //-Declaration d'une variable:
        //* type nom_variable;
        int a;
        //-Initialisation d'une variable:
        //* nom_variable = valeur;
        a=5;
        a = 456;
        System.out.println(a);
        //-declaration et initialisation d'une variable;
        //* type nom_variable = valeur;
        int d=45;
        d = 11;
        System.out.println(d);
        System.out.println(LesMethodes1.f(3));
        System.out.println(Factoriel.factoriel(23));
        int somme=0;
        int n=20;
        for (int i = 1; i < n; i++) {
            System.out.println("Pour i = "+i+"\n"+
            "somme=somme +"+i+"\n"+
              "somme = "+somme+"+"+i+"\n"+
               "somme = "+(somme+i));  
            somme=somme+i;
        }
        System.out.println("La somme de 1 a "+n+" est: "+somme); 
        
        Personne rt = new Personne("Karim", "Toure", 34);
        Personne rt1 = new Personne("Makan", "Magassa", 67);
         System.out.println(rt);
         String e1 = "23";
         int d1 = Integer.parseInt(e1);
         System.out.println(d1+34);
         int q1 = 34;
         String r = String.valueOf(q1);
         System.out.println(r+34);
         String dr = "Hello World";
         StringBuilder de = new StringBuilder(dr);
         de.deleteCharAt(de.length()-7);
         dr = de.toString();
         System.out.println(dr);
         
    }
    
}
