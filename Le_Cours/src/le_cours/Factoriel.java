/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le_cours;

import java.util.Scanner;

/**
 *
 * @author Makan
 */
public class Factoriel {
    public static void main(String[] args) {
        Scanner ever = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        int nbre = ever.nextInt();
        int fact = 1;
        for (int i = 1; i < nbre; i++) {
            fact*=i;
        }
        System.out.println("Factoriel de "+nbre+" est "+fact);
        ever.close();
    }
 
}
