/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Makan
 */
public class TirageSuccessifAvecRemise {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();// Enseble des tirages possibles
        Denombrement dn = new Denombrement();
        char[] tab ={'1','0'};// Ensemble contenantbles elements a tirer
        int n = tab.length;//Cardinal de l'ensemble
        int p = 8;// Nombre d'elements a tirer pendant chaque tirage
        int l = tab.length;// nombre (Cardinal) choisi pour generer un nombre
        String s = "";
        while (hs.size() != dn.pu(n, p)){
            // Un tirage a faire
            for (int i = 1; i <= p; i++) {
              int index = (int)(n*Math.random());// generer un nombre (index alea) entre 0 et l (ligne 21)
              s = s+tab[index];// acces a l'index aleatoire
            }
            hs.add(s);// Ajout du tirage obtebu, dans Enseble des tirages possibles
            s = "";
        }
        int c = 1;
//        Iterator<String> it = hs.iterator();
//        while(it.hasNext()){
//            //c+". Tirage :"+
//            System.out.println(c+" "+it.next());
//            c++;
//        }
          for (String e : hs) {
              System.out.println(c+" "+e);
              c++;
        }
          Scanner clavier = new Scanner(System.in);
          int ak , bk;
          System.out.println("Enter un nombre au choix. ");
          int a = clavier.nextInt();
          System.out.println("Enter un nombre au choix. ");
          int b = clavier.nextInt();
         System.out.println("La somme de "+a+"+"+b+" = "+(a+b)); 
    }
}
