/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe.predefinies;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.shape.Line;

/**
 *
 * @author Makan
 */
public class PremierTest {
    public static void main(String[] args) {
//        double pi = Math.PI;
//        int x = 9;
//        double racine = Math.sqrt(x);
//        double carre = Math.pow(x, 2);
//        System.out.println(carre);
//        System.out.println(pi);
//        String rt = Integer.toBinaryString(8);
//        System.out.println(rt);
        
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(1);
        al.add("Bonjour");
        System.out.println(al.get(1));
//        al.remove(3);
        System.out.println(al.get(3));
//        for (Object o : al) {
//            System.out.println(o);
//        }
        
//        System.out.println((char) 65);
//        System.out.println((char) 97);
//        
//        for (int i = 65; i < 65+26; i++) {
//            System.out.println((char) i);
//        }
        
//        int n = 125;
//        String enBase2 = Integer.toBinaryString(n);
//        System.out.println(n+" en base 2 : "+enBase2);
//        
//        String enBase8 = Integer.toOctalString(n);
//        System.out.println(n+" en base 8 : "+enBase8);
//        
//        
//        int deBase2 = Integer.parseInt("1111101",2);
//        System.out.println("1111101 de base 2 en base 10 : "+deBase2);
//        
//        int deBase8 = Integer.parseInt("175",8);
//        System.out.println("175 de base 8 en base 10 : "+deBase2);
        
//        System.out.println("Entrer un nombre pour calculer sa racine caree: ");
//        double r = new Scanner(System.in).nextInt();
//        System.out.println("Racine caree de "+r+" = "+Math.sqrt(r));
        
//        System.out.println("Entrer 2 nombres pour calculer leur divion : ");
//        double a = new Scanner(System.in).nextInt(); double b = new Scanner(System.in).nextInt();
//        try {
//            double c = a/b;
//            System.out.println(a+" / "+b+" = "+c);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        
          
          System.out.println("debut du programme");
          System.out.println(2);
          System.out.println(3);
          try {
            System.out.println(3);
        } catch (Exception e) {
              System.out.println("Erreur : "+e);
        }
          System.out.println("continuite du programme");
          System.out.println("fin du programme");
    }
}
