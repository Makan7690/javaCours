/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author Makan
 */
public class TestFiG {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5., 2.);
        Cercle c1 = new Cercle(10.);
//        System.out.println(r1.perimetre());
//        System.out.println(r1.surface());
//        System.out.println(c1.perimetre());
//        System.out.println(c1.surface());
        
        
//         System.out.println(r1);       
//         System.out.println();       
//         System.out.println(c1);  
        FigureGeometrique f1 = new Rectangle(4.,6.);
        FigureGeometrique f2 = new Cercle(13.);
        System.out.println(f1);
        System.out.println(f2);
        
    }
}
