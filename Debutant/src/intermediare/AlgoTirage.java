/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Makan
 */
public class AlgoTirage {
    public static ArrayList<Integer> TirageRemise(int n,int p){
       ArrayList<Integer> elements = new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            elements.add(i);    
        }
      ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < p; i++) {
            int index=(int)(Math.random()*elements.size());
            result.add(elements.get(index));
        }
        return result;
    }
    public static ArrayList<Integer> TirageSnRemise(int n, int p){
        ArrayList<Integer> elements = new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            elements.add(i);  
    }
        Collections.shuffle(elements);
         ArrayList<Integer> result = new ArrayList<>();
         for (int i = 0; i < p; i++) {
            result.add(elements.get(i));
        }
         return result;
    }
    public static ArrayList<Integer> TirageSimultane(int n, int p){
         ArrayList<Integer> elements = new ArrayList<>(); 
        for (int i = 1; i <= n; i++) {
            elements.add(i);  
    }
        Collections.shuffle(elements);
         ArrayList<Integer> result = new ArrayList<>();
         for (int i = 0; i < p; i++) {
            result.add(elements.get(i));
    }
         return result;
    }
    public static void main(String[] args) {
        int n = 10;
        int p = 3;
        ArrayList<Integer> TirageRemiseresult = TirageRemise(n,p);
        System.out.println("Tirage avec remise"+TirageRemiseresult);
        
        ArrayList<Integer> TirageSnRemiseresult = TirageSnRemise(n,p);
        System.out.println("Tirage sans remise"+TirageSnRemiseresult);
        
         ArrayList<Integer> TirageSimultaneresult = TirageSimultane(n,p);
        System.out.println("Tirage sans remise"+TirageSimultaneresult);
    }
}
