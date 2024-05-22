/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debutant;

/**
 *
 * @author Makan
 */
public class LesBoucles {
    public static void main (String [] args ){
        for(int i=0;i<=10;i+=1){
            System.out.println(i+" Bonsoir");
        }
        System.out.println(2<3);
        for (int i = 2; i < 10; i++) {
            System.out.println("La tabele de multiplication de "+i+" est :"); 
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" x "+j+" = "+i*j);   
            }
            System.out.println();
        }
    }
}
