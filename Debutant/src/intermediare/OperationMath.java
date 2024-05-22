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
public class OperationMath {
    public static void main(String[] args) {
        int t1 = 134;
        int t2 = 67;
        System.out.println(t1+" et "+t2);        
        System.out.println("Addition : "+(t1+t2)); 
        System.out.println("Soustraction : "+(t1-t2));        
        System.out.println("Multiplucation : "+(t1*t2));        
        System.out.println("Division : "+(t1/t2));        
        System.out.println("Le reste de la division : "+(t1%t2));        
        System.out.println("La Puissance  : "+(int)Math.pow(t1, 2));
         for (int i = 2; i < 134; i++) {
          if(premier(i)){
              System.out.println(i);
          }   
        }
        for (int i = 1; i < 99; i++) {
           if(devisible(99,i)){
               System.out.println(i);  
           } 
        }
  
        
    }
    public static boolean  premier(int n) {
        for (int i = 2; i <=Math.sqrt(n); i++) {
          if(n%i==0){
              return false;
          }
        }
          return true;
    }
    public static boolean devisible(int v1, int v2) {
        if(v1%v2==0){
            return true;
        }else{
            return false;
        }
    }
}
