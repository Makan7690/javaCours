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
public class Privat {
    public static void main(String[] args) {
        for (int i = 2; i <=90; i++) {
           if(isprime(i)){
               System.out.println(i); 
               System.out.println("La verite est appele DIEU.");
        } 
       
        }
        System.out.println(factoriel1(9));
       /* for (int i = 1; i <=24; i++) {
          if(divisible(24,i)){
              System.out.println(i);   
          }  
        }*/
        
        
    }
    private static boolean isprime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
         if(num%i==0){
             return false;
         }           
        }
           return true;
    }
    public static int  factoriel1(int n) {
        if(n==0){
        return 1;
    }else{
           return n*factoriel1(n-1); 
            }
        
    }
    public static boolean divisible(int m, int n) {
        if(m%n==0){
            return true;
        }else{
            return false;
        }
        
    }
}
