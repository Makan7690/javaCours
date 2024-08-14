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
public class Cheval implements Animal{

    @Override
    public String Communi() {
     return "Hayngni....";
    }
    public double add(double a, double b){ //Surchage de methode .
        return (a+b);
    }
    
}
