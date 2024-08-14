/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qwerty1;

/**
 *
 * @author Makan
 */
public class Base implements Forme{


    @Override
    public double perim(double L, double l) {
         double rt = 2*(L+l);
         return rt;
    }

    @Override
    public double surface(double L, double l) {
       double qw = (L*l)/2; 
       return qw;
    }

    @Override
    public double triangle(double H, double b) {
       double er = (H*b)/2;
       return er;
    }
    public String toString(){
        String yu = "Perimetre est :"+perim(0, 0)+" m"+"\n"+
                "Surface est :"+surface(0, 0)+" m"+"\n"+
                "Triangle est :"+surface(0, 0)+" m";
        return yu;
    }
}
