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
public class Somme {
    public static void main(String[] args) {
//        La somme de 1 a 10 
        int somme = 0;
        int n = 20;
        
        System.out.println("somme = 0");
        for(int i=1;i<=n;i++){
           System.out.println("pour i = " +i+"\n"+
"	somme = somme + " +i+"\n"+
"	somme = "+somme+" + " +i+"\n"+
"	somme = "+(somme+i));
           somme=somme+i;
            
        }
        
        System.out.println("La somme de 1 a "+n+" est: "+somme);
    }
}
