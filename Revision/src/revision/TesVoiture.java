/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;

/**
 *
 * @author Makan
 */
public class TesVoiture {
    public static void main(String[] args) {
        Voiture w1 = new Voiture("Toyota","Yarsi","Bleu",2008,"4 chevaux",2.3);
        Voiture w2 = new Voiture("Toyota","Corrola","Gry",2010,"6 chevaux",4.6);
        Voiture w3 = new Voiture("Toyota","Avensis","Noir",2012,"5 chevaux",5.0);
        Voiture w4 = new Voiture("Mercidece","310","Vert",2013,"3 chevaux",6.5);
        Voiture w5 = new Voiture("Toyota","Land Cruiser","Blanc",2017,"7 chevaux",8.0);
//        Voiture[] tb = {w1,w2,w3,w4,w5};
//        for(Voiture qr :tb ){
//            System.out.println(qr);
//        }
           System.out.println(w1);
           System.out.println("Suivant.....1");
           System.out.println(w2);
           System.out.println("Suivant.....2");
           System.out.println(w3);
           System.out.println("Suivant.....3");
           System.out.println(w4);
           System.out.println("Suivant.....4");
           System.out.println(w5);
    }
}
