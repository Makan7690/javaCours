/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import revision.heritage.Femme;

/**
 *
 * @author Makan
 */
public class Testtraitemt1 {

    
    public static void main(String[] args) {
        Femme smala = new Femme("Salif", "Magassa", 26, "Diougounte", 76899034, 001);
        Traitemt1 smala1 = new Traitemt1("Ramata", "Traore", 23, "Bamako", 668899, 002);
        Traitemt1 smala2 = new Traitemt1("Ousmane", "Djibo", 32, "Bandjagara", 65889900, 003);
        Traitemt1 smala3 = new Traitemt1("Aichat", "Yanogue", 22, "Fana", 77443366, 004);
        Traitemt1 smala4 = new Traitemt1("Makan", "Magassa", 30, "Diougounte", 76283804, 005);
        Traitemt1 smala5 = new Traitemt1("Fatoumata", "Barry", 28, "Bamako", 77445566, 006);
        Traitemt1 [] tab = {smala,smala1, smala2, smala3, smala4, smala5};
         for (Traitemt1 sml : tab) {
             System.out.println(sml);  
//             System.out.println("rt rt rt rt rt rt rt");  
        }
//        String M = "smala + smala1 + smala2 + smala3 + smala4 + smala5";
//            System.out.println(smala);
//        System.out.println("*************");
//            System.out.println(smala1);
//        System.out.println("*************");    
//            System.out.println(smala2);
//        System.out.println("*************");    
//            System.out.println(smala3);
//        System.out.println("*************");    
//            System.out.println(smala4);
//        System.out.println("*************");    
//            System.out.println(smala5);
        
    }
 
}
