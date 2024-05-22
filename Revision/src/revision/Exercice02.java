/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revision;
import java.util.ArrayList;
/**
 *
 * @author Makan
 */
public class Exercice02 {
    public static void main(String[] args) {
    ArrayList<String> tp = new ArrayList<String>();
      tp.add("Hello everybody,");
      tp.add("Moussa Traore,");
      tp.add("Premier Jour de la semaine,");
      tp.add("Fournit un peu d'effort pour gagner.,");
       // System.out.println(tp);
//       for(String df:tp)
//        System.out.println(df);
        tp.set(2, "La terre tourne au tour du soleil.");
        tp.remove(1);
        tp.clear();
        System.out.println(tp);
    }
    
}
