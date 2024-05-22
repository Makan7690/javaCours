/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;
import java.util.Scanner;

/**
 *
 * @author Makan
 */
public class Test {
    public static void main(String[] args) {
        Revisione Rev = new Revisione("Magassa","makan","Dioug","+223 76 909847");
        Revisione Rev1 = new Revisione("Nadio","Achata","Diallobougou","+223 76 99 03 00");
        Revisione Rev2 = new Revisione("Camara","Fatoumata","ACI2000","+223 76 99 88 99");
        Revisione Rev3 = new Revisione("Baradji","Mariam","Golf","+223 78 99 66 88");
        Revisione [] tab = {Rev,Rev1,Rev2,Rev3};
        for (Revisione trs: tab) {
            System.out.println(trs);
        }
        System.out.println("Nombre de personne : "+Revisione.nombrepers);
    
    Scanner km = new Scanner(System.in);
    int Num1 = 0;
    int Num2 = 0;
    int Num3 = 0;
        System.out.println( "Entrer le nombre 1");
        Num1 = km.nextInt();
        System.out.println( "Entrer le nombre 2");
        Num2 = km.nextInt(); 
        System.out.println( "Entrer le nombre 3");
        Num3 = km.nextInt();
        System.out.println("La somme de "+Num1+" , "+Num2+" et "+Num3+" est : "+(Num1+Num2+Num3));
        System.out.println("Le produit de "+Num1+" , "+Num2+" et "+Num3+" est : "+Num1*Num2*Num3);
        for (int i = 1; i <=78; i++) {
            System.out.println(i+" "+"Bonjour tout le monde.");
        }
    }
}
