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
public class Factoriel {
    public static void main(String[] args) {
        System.out.println(factoriel(6));
    }
    
    
    
    
    public static int factoriel(int n) {
        int resultat = 1;
        for (int i = n; i >= 1; i--) {
            resultat = resultat * i;
        }
        return resultat;
    }
}
