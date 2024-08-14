/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import intermediare.objet.Personne;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Makan
 */
public class LesCollections {
    public static void main(String[] prenom) {
        List Ma= new ArrayList();
        Ma.add("Magassa");
        Ma.add(56);
        Ma.add(78);
        Ma.add("La verite");
        Ma.add("Bonjour");
//        System.out.println(Ma.size());    
//        System.out.println(Ma.get(3));
//        Ma.set(2, 70);
//        Ma.add(2, 79);
//        Ma.remove("Magassa");
//        System.out.println(Ma);
//        System.out.println(Ma);
        Set hs = new HashSet();
         hs.add("Makan");
//         hs.add(16);
//         hs.add(17);
//         hs.add(18);
//         hs.add(17);
//         hs.add(20);
//         System.out.println(hs);
         int n = 5;
         int a = (int) (n*Math.random());// generer un nombre aleatoire entre 0 et (n-1) avec n = 5.
//         System.out.println(a);
         
         int taille = Ma.size();//Taille de la liste
         int indexAlea = (int) (taille*Math.random());//generer un nombre aleatoire entre 0 et (taille-1)
         System.out.println(Ma);
         System.out.println(Ma.get(indexAlea));//Afficher l'element de l'index (indexAlea)
         int a1 = 2, b1=5 ,n1=4;
         int nb = (int)(4*Math.random()) + 2;
         System.out.println(nb);
         
         List<Personne> listePersonnes = new ArrayList();
         
         Personne p1 = new Personne("Mariam", "Maiga", 18);
         Personne p2 = new Personne("Ousmane", "Tangara", 25);
         Personne p3 = new Personne("Aichatou", "Keita", 32);
         Personne p4 = new Personne("Issa", "Diarra", 11);
         Personne p5 = new Personne("Lamine", "Traore", 20);
         
         listePersonnes.add(p1);
         listePersonnes.add(p2);
         listePersonnes.add(p3);
         listePersonnes.add(p4);
         listePersonnes.add(p5);
         listePersonnes.add(new Personne("Youssouf", "Guindo", 30)); 
         listePersonnes.add(new Personne("Fatim", "Sangare", 56)); 
         listePersonnes.add(new Personne("Victor", "Salam", 17)); 
         listePersonnes.add(new Personne("Mahamadou", "Haidara", 65)); 
         listePersonnes.add(new Personne("Dielika", "Kouyate", 27));    
         
                 
         
//         
//         String er =((Personne)listePersonnes.get(5)).getPrenom();
//         String xr =((Personne)listePersonnes.get(5)).getNom();
//         int tr =((Personne)listePersonnes.get(5)).getAge();
//         String as = "Personne1:"+ er+" " + xr+" "+ tr+"ans";
//         System.out.println(as);
         
         for (int i = 0; i < listePersonnes.size(); i++) { // c'est le nombre de taille
            String exp = "Personne "+(i+1)+" : ";//nombre d'iteration
            String pren = ((Personne)listePersonnes.get(i)).getPrenom();// index de prenom.
            String nom = ((Personne)listePersonnes.get(i)).getNom();// index de nom.
            int age = ((Personne)listePersonnes.get(i)).getAge();// index de l'age.
            String rep = exp+" "+pren+" "+nom+" "+age+" an (s)";// la conatination de variables.
         
            System.out.println(rep);
       }
         
//         List<String> l1 = new ArrayList<>();
//         
//         l1.add("11110010");
//         l1.add("10010010");
//         l1.add("10110010");
         
//        for(String rt:l1){
//            System.out.println(rt);
//        }
        
//        Iterator it = l1.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
    
         }
