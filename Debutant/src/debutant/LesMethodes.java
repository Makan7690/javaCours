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
public class LesMethodes {
    public static void main(String[] args) {
//        max1(36,12);
//        max1(17,19);
//        max1(175,149);
        max2(36,12,56);
        max2(17,19,78);
        max2(175,149,59);
    }
    public static void max1(int x, int y){
        int a=x;
        int b=y;
        
        if(a>b){
            System.out.println("Le max est : "+a);
        }else{
            System.out.println("Le max est : "+b);
        }
    }
    public static void max2(int x, int y, int z) {
      if(x>y && x>z){
          System.out.println("Le max est : "+x);
      }else{
          if(y>z){
              System.out.println("Le max est : "+y);
          }else{
              System.out.println("Le max est : "+z);
          }
      }  
    }
}
