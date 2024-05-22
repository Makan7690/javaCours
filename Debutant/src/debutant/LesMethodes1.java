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
public class LesMethodes1 {
    public static void main(String[] args) {
        System.out.println(f(4));
        System.out.println(Math.cos((Math.PI)/2));
    }
//    private -> claase, protected -> package, public -> partout dans le project
    public static int f(int x) {
        int carre=x*x;
        System.out.println(carre);
        return carre;
    }
}
