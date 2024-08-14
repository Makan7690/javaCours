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
public class LeNombrePremier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int nombre = scanner.nextInt();
        scanner.close();
        boolean estpre = true;
        if (nombre<=1) {
            estpre = false;  
        }
        else{
            for (int i = 2; i < Math.sqrt(nombre); i++) {
                if (nombre%i==0) {
                    estpre = false;
                    break;
                    
                }
                
            }
        }
        if (estpre) {
            System.out.println(nombre+" est un nombre premier.");  
        }else{
            System.out.println(nombre+" n'est pas un nombre premier.");
        }
    }
 
}
