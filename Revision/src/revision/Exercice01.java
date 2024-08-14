/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;

import java.time.Clock;

/**
 *
 * @author Makan
 */
public class Exercice01 {

    public static void main(String[] args) {
        // Une table a un element.
        int[] tab1 = new int [7];
        var tab2 = new int [9];
        tab1[0] = 78;
        tab1[1] = 67;
        tab1[2] = 90;
        tab1[3] = 12;
        tab1[4] = 23;
        for (int i = 0; i < tab1.length; i++) {
            System.out.println("tab "+i+ " = "+tab1[i]);  
        }
        tab2 = tab1;
        for (int i = 0; i < tab2.length; i++) {
            System.out.println("tab "+i+ " = "+tab2[i]); 
        }
        // Une table a deux elements,
        // int[][] tab = new int[dimension][elements]
        //int [][] tab = new int [2][.,.,.,.,.,.,.,.,.,.]
        int[][] scor = {{12,13,14,15,16},
            {17,18,19,20,21},
            {23,45,67,78,67,90,98}
        };
        for (int i = 0; i < scor.length; i++) {
            for (int j = 0; j < scor[i].length; j++) {
                System.out.print(scor[i][j]+" ");  
            }
           System.out.println();
        }
// Un tableau dynamique: ArrayList<String>,ArrayList<Integer>,ArrayList<Double>...
        Clock clock = Clock.systemUTC();
        System.out.println("UTC TIME "+clock.withZone(Bamako));
    }
}
