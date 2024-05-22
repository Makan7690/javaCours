/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;
import java.util.Scanner;

/**
 *
 * @author Makan
 */
public class Exercice {
    public static void main(String[] args) {
        int dNum=16;
        String str="";
        while (dNum>0){
            int rem=dNum%2;
            str=rem+str;
            dNum=dNum/2;
        }
        System.out.println("Enter binaire:"+str);
        System.out.println("Hello Hello Hello Hello Hello Hello");
        int [] ma=new int[8];
        ma[0]=10;ma[1]=11;ma[2]=12;ma[3]=13;ma[4]=14;ma[5]=15;ma[6]=16;ma[7]=17;
        for(int i=0;i<ma.length;i++){
            System.out.println(ma[i]);
        }
        int k;
        Scanner p=new Scanner(System.in);
        System.out.println("Enter la taille : ");
        k=p.nextInt();
        int[] mk=new int[k];
        for(int i=0;i<k;i++)
            System.out.println("Entrer le nombre"+(i+1));
//                mk[i]= p.nextInt();
    }
  
}
