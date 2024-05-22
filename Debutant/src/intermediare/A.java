/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;

import debutant.LesMethodes1;
import java.util.Scanner;
/**
 *
 * @author Makan
 */
public class A {
    public static void main(String[] args) {
//        System.out.println(LesMethodes1.f(3));
        
        Scanner sc = new Scanner(System.in);
       int[] tab;
        System.out.println("Entrer la taille du tableau ");
        int n = sc.nextInt();
        tab = new int[n];//dimensionnement du tableau
//        Initialisation du tableau tab.
        for (int i = 0; i < n; i++) {
            System.out.println("Entrer l'element de l'index "+i);
            tab[i] = sc.nextInt();
        }
        System.out.println("Affichage des elements du tab ");
        for (int i = 0; i < n; i++) {
            System.out.println("tab["+i+"] = "+tab[i]);  
        }
        int som = 0;
        for (int i = 0; i < n; i++) {
        som = som + tab[i];   
        }
        System.out.println("La somme de tableau de nombres "+n+" est : "+som);
        for (int i = 2; i <= 137; i++) {
         if(premier(i)){
             System.out.println(i);
         }   
        }
      
    }
    public static boolean premier(int n) {
        for (int i = 2; i <=Math.sqrt(n); i++) {
          if(n%i==0){
              return false;
          }  
        }
           return true;
    }
}
