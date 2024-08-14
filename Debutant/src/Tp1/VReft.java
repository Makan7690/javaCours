/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp1;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

/**
 *
 * @author Makan
 */
public class VReft {
    public static void main(String[] args) {
//        Scanner clvier = new Scanner(System.in);
//        System.out.println("Entrer un nombre entre 1 et 3 .");
//        int number = clvier.nextInt();
//        switch(number){
//            case 1:
//                System.out.println("vous avez entre 1. ");
//                break;
//            case 2:
//                System.out.println("vous avez entre 2. ");
//                break;
//            case 3:
//                System.out.println("vous avez entre 3. ");
//                break;
//            default:
//                System.out.println("Il faut entrer une valeur entre 1 et 3. ");
//                break;
//        }
//        System.out.println("Do you know that I love you my honey?");
//        Random rand = new Random();
//        int succ = rand.nextInt(2);
//        //for (int i = 0; i < 100; i++) { pour afficher le nombre aleatoire.
//            //int succ = rand.nextInt(2); pour afficher le nombre aleatoire.
//            System.out.println(succ);
// }
//        boolean succ = rand.nextBoolean();
//        System.out.println("Hummmm...");
//        try {
//            Thread.sleep(2000);
//        } catch (Exception e) {
//            System.out.println();
//        }
//        if(succ){
//            System.out.println("I love you too honey.");
//        }else{
//            System.out.println("What did you say? How dare you?"); //What are you saying?
//       }
       final int NUMBER = 9;
       int score =0, index;
       String pays,capitale, usera;
       ArrayList<Integer> taken = new ArrayList<>();
       
      // String [][] data = getData(); c'est une fonction qu'on peut utliser c la meme
       String [][] data = 
       {
           {"Senegal","Dakar"},
           {"France","Paris"},
           {"Perou","Lima"},
           {"Allemagne","Berlin"},
           {"Nigeria","Legos"},
           {"Italie","Rome"},
           {"Liberia","Monrovia"},
           {"Gabon","Libreville"},
           {"Monaco","Monaco"}
           
       };
       Scanner clavier = new Scanner(System.in);
        for (int i = 0; i < NUMBER; i++) {
            // Choisir un pays de maniere aleatoire.
            do {                
              Random ran = new Random();
              index = ran.nextInt(data.length);  
            } while (taken.contains(index));
            taken.add(index);
            pays = data[index][0];
            capitale = data[index][1];
            System.out.printf("Quelle la capitale de ce pays :%s?\n",pays);
            usera = clavier.nextLine();
            if(capitale.equalsIgnoreCase(usera)){
                System.out.println("Bonne reponse!");
                score++;
            }else {
                System.out.printf("Mauvaise reponse. Il fallait repondre %s.\n",capitale);
            }
          //Demander a l'utilisateur d'entrer la capitale de ce pays.
          //On compare les reponses.
          //On affiche notre 
        }
        System.out.printf("C'est termine<<score :%d/%d",score,NUMBER);
    }
//    static String[][] getData(){
//        String[][] data = {
//           {"Senegal","Dakar"},
//           {"France","Paris"},
//           {"Perou","Lima"},
//           {"Allemagne","Berlin"},
//           {"Nigeria","Legos"},
//           {"Italie","Rome"},
//           {"Liberia","Monrovia"},
//           {"Gabon","Libreville"},
//           {"Monaco","Monaco"}
//           
//       };
//        return data;
    
}
