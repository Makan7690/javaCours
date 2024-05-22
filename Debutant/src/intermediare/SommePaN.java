/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;

/**
 *
 * @author Makan
 */
public class SommePaN {
    public static void main(String[] args) {
        int p = 6;
        int n = 27;
        int somme=0;
        for (int i = p; i <= n; i++) {
            somme = somme + i;
        }
        System.out.println("La somme de "+p+" a "+n+" est : "+somme);
    }
  
}
