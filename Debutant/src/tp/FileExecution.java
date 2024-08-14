/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Makan
 */
public class FileExecution {
    public static void main(String[] args) {
//        int a = 4;
//        if(a>5){
//            System.out.println(a);
//             System.out.println(a);
//        }// Les acolades permettent de creer le bloc d'instruction
//        //Une boucle permet d'excuter 1 (instruction ou bloc d'instruction) un certain nbre de fois.
//        for (int i = 1; i <= 5; i++){
//            System.out.println(i+" Bonjour!!");
//        for (int j = 1; j <=3; j++) {
//            System.out.println(j+" Bonsoir!!");    
//        }
//        }  
//        for (int i = 1; i <=5; i++){
//            System.out.println(i);      
//        } 
//        for (int i = 6; i <= 10; i++) 
//            System.out.println(i);

//        for (int i = 1; i <= 60; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                
//            }
//        }
      
//        for (int i = 1; i <= 60; i++) {
//           try {
//                Date d = new Date();
//        //System.out.println(d);
//                SimpleDateFormat s = new SimpleDateFormat("H:mm:ss");
//                String t = s.format(d);
//              Thread.sleep(1000);
//               System.out.println(t);
//           } catch (InterruptedException ex) {
//              
//           }
//        }
        
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i+" Bonsoir");
                }
 
            }
        };
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i+" Bonjour");
                }
 
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.start();
        t2.start();
        
    }
}
