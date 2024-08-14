/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debutant;

/**
 *
 * @author Makan
 */
public class LesTableaux {
    public static void main(String[] args) {
        int a=34;int b=56;int c=73;int d=90;int e=98;
       // double n=Math.sqrt(2);
       
       
//       declaration et initialisation du tableau d'entiers t
        int[] t={34, 56, 73, 90, 98, 100,-5,-589};
//        Acces a l'element se trouvant a l'indexe 2 du tableau t
        System.out.println(t[5]);
//        Afficher la taille du tableau t
        System.out.println(t.length);
//        Parcours iteratif du tableau
        for(int index=0;index<t.length;index+=1){
            System.out.println(t[index]);
        }
        System.out.println("*******************");
        for(int index=0;index<t.length;index+=1){
            System.out.println(2+t[index]);// On ajoute +2 a chaque element.
        }
        
        System.out.println("**********"); 
//        declaration d'un tableau d'entiers tab
            int[] tab = new int[7];
//            initialisation d'un tableau d'entiers
            tab[1]=23;
            tab[0]=223;
            tab[6]=213;
            tab[4]=47;
            tab[3]=34;
            tab[2]=18;
            tab[5]=56;
            for(int i=0;i<=tab.length-1;i +=1){
                System.out.println(tab[i]);
            }
           System.out.println("Hello Hello Hello");
            int [] tb=new int [7];
            tb[0]=12;
            tb[1]=23;
            tb[2]=34;
            tb[3]=45;
            tb[4]=56;
            tb[5]=67;
            tb[6]=78;
        for(int i=0; i<tb.length; i +=1){
          System.out.println(tb[i]);
        }
    }
}
