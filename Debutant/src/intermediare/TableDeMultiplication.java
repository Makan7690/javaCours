/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;

import intermediare.generer.Pour;

/**
 *
 * @author Makan
 */
public class TableDeMultiplication {
    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            System.out.println("Table de multiplication de "+i);
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("----------------");
        }
        Pour pour1 = new Pour("kalaban", "mag32@gmail.com", 45677);
        System.out.println(pour1.getEmail());
    }
}
