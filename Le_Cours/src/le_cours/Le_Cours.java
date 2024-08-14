/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le_cours;

/**
 *
 * @author Makan
 */
public class Le_Cours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator addition = (a, b) -> a + b;
        System.out.println("Résultat de l'addition : " + addition.calcute(5, 3));
        System.out.println("Resultat de la multiplication : "+ new Calculator() {
            @Override
            public int calcute(int a, int b) {
                return a*b;
            }
        }.calcute(4, 3));
    }
    
}
