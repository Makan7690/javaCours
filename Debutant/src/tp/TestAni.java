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
public class TestAni {
    public static void main(String[] args) {
    Margouillat margouillat1 = new Margouillat();
    Mouton  mouton1 = new Mouton();
    System.out.println(margouillat1.seDeplace());
    System.out.println(mouton1.seDeplace());
    Herbivore ch1 =new Chevre();
    Lion c1 =new Lion();
    Carnivore c2 =new Humain();
    Humain h1 = new Humain();
    System.out.println(c1.peutManger());
    System.out.println(c2.peutManger());//Polymorphisme.meme type d'objet meme methode avec comportements diffts.
    System.out.println(h1.additionner(2, 3));
    System.out.println(h1.additionner(2, 3, 5));//Surcharge de methode.
    TestAni t1 = new TestAni();
        System.out.println(t1.nourriture(c2));// h1, c1 et c2 passed. Sans Static
//        System.out.println(nourriture(c2));// h1, c1 et c2 passed. Avec Static
          Mouton ert = new Mouton();
          ert.seDeplace();
    }
    public  String nourriture(Carnivore n){//Sans Static. Methode d'object.
    //public static String nourriture(Carnivore n){ Avec Static .Methode de classe.
       return n.peutManger(); 
    }
}
