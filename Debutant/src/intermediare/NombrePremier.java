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
public class NombrePremier {
    public static void main(String[] args) {
        for (int i = 2; i <=123; i++) {
            if(premier(i)){
             System.out.println(i);   
            }
            
        }
        System.out.println(f(2));
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);   
        }
    }
    public static boolean premier(int n) {
        for (int i = 2; i <=Math.sqrt(n); i++) {
          if(n%i==0){
              return false; 
          } 
        }
         return true;
    }
    public static int f(int x) {
        int carre=x*x;
        return carre;
    }
}
