/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debutant;
import java.util.Scanner;
/**
 *
 * @author Makan
 */
public class SommeTableau {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
//        Le nombre d entiers a aditionner 
          System.out.println("Combien de nombres voulez-vous aditionner ?");
          int taille = s.nextInt();
          int[] tableauDeNombres = new int[taille];
          
//        Le nombre 1 jusqu au nombre N a stocker dans le tableau
          for (int i = 0; i < taille; i++) {
            System.out.println("Entrez le nombre "+(i+1));
            tableauDeNombres[i] = s.nextInt();
        }
//        La somme des N nombres
          int sommeDesElements = 0;
          int multiplication = 1;
              System.out.println("============");
          for (int i = 0; i < taille; i++) {
            sommeDesElements = sommeDesElements + tableauDeNombres[i];
            multiplication = multiplication*tableauDeNombres[i]; 
        }
//        L'affichage
          System.out.println("La somme des nombres est : "+sommeDesElements);
          System.out.println("La multipliction des nombres est : "+multiplication);
    }
}
