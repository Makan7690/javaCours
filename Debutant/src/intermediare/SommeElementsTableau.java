/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;
import java.util.Scanner;

/**
 *
 * @author Makan
 */
public class SommeElementsTableau {
    public static void main(String[] args) {
        int[] tab;
        int somme = 0;
        Scanner ip = new Scanner(System.in);
        System.out.print("Entrer la taille du tableau : ");
        int n=ip.nextInt();
        tab=new int[n];
//        Une boucle permet de rep
        for(int i=0;i<n;i++){
            System.out.print("Enter l'index "+i+" du tableau : ");
            tab[i]=ip.nextInt();
            somme=somme+tab[i];
        }
        System.out.println("La somme de tous les elements du tableau est "+ somme);
        ip.close();
    }
}
