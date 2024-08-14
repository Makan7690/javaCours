/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author Makan
 */
public class TirageSuccessifSansRemise {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Denombrement dn = new Denombrement();
        char [] tab = {'1','2','3','4','5'};
        int b = tab.length;
        int bb =4;
        String s = "";
        while(hs.size() != dn.a(b, bb)){
            while (s.length()<bb){
                int n = (int)(b*Math.random());
                if (!s.contains(""+tab[n]))
                    s = s+tab[n];
            }
            hs.add(s);
            s = "";
        }
        int c = 1;
        Iterator<String> it = hs.iterator();
        while(it.hasNext()){
            
            System.out.println(c+". Tirage "+it.next());
            c++;
//            for(String rt:hs){
//            System.out.println(c +". Tirage "+rt);
//            c++;
//            {
        }
    }
}
