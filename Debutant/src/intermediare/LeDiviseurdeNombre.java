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
public class LeDiviseurdeNombre {
    public static void main(String[] args) {
//         System.out.println(estDivisible(15, 3));
         System.out.println("Les diviseurs");
         for (int i = 1; i < 10; i++) {
            if(estDivisible(10,i)){
                System.out.println(i);
            }
        }
//         System.out.println(estPremier(7));
         System.out.println("Les nbres premiers");
         for (int i = 2; i <= 1234; i++) {
            if(estPremier(i)){
                System.out.println(i);
            }
        }
    }
    
    
    
    
    public static boolean estPremier(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean estDivisible(int n1, int n2) {
        if(n1%n2==0){
         return true;   
        }else{
            return false;
        }
        
    }
        
}
