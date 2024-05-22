/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;

import java.util.ArrayList;

/**
 *
 * @author Makan
 */
public class Algorithme {
    public static void main(String[] args) {
        System.out.println(pgcd(25,15));
        System.out.println(ppcm(12,16));
        System.out.println(base2(17));
        System.out.println(base3(12));
        System.out.println(base4(125));
        
        System.out.println(base(125,2));
        
        
    }

    private static int pgcd(int a, int b) {
        if (b==0) {
            return a;
        }else{
            int reste = a % b;
            return pgcd(b, reste);
        }
    }
     static int ppcm(int a,int b) {
        return (a*b)/pgcd(a,b);
    }
     public static String base2(int n){
        if(n==0 || n == 1){
            return n+"";
        }else{
            return base2(n/2)+(n%2);
        }
     }
     public static String base3(int n){
        if(n==0 || n == 1 || n==2){
            return n+"";
        }else{
            return base3(n/3)+(n%3);
        }
     }
     public static String base4(int n){
        if(n==0 || n == 1 || n==2 ||n==3){
            return n+"";
        }else{
            return base4(n/4)+(n%4);
        }
     }
     public static String base8(int n){
        if(n>=0 && n <8 ){
            return n+"";
        }else{
            return base8(n/8)+(n%8);
        }
     }
     public static String base(int n, int b){
//        Une liste al contenant l ensemble des chiffres de la base b
         ArrayList al = new ArrayList();
//         Remplissage de la liste al
        for(int i=0;i<b;i++){
            if(i<10){
                al.add(i);
            }else{
                al.add((char)(i+55));
            }
        }
//        Concatenation du quotient et du reste de facon recurssive
         if(n>=0 && n <b ){
            return al.get(n)+"";
        }else{
            int q = n/b;
             return base(q,b)+(n%b);
        }
     }
     
}
