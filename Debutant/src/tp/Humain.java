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
public class Humain implements Omnivore{
    public int additionner(int a,int b){
        return (a+b);
    }
    public int additionner(int a,int b,int c){
        return (a+b+c);
    }
    @Override
    public String peutManger() {
         return ("Je mange tout.s");
    }
}
