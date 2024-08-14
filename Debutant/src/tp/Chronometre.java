/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Makan
 */
public class Chronometre {
    public static void main(String[] args) {
        int heures = 0, minutes = 0, secondes = 0;
        for ( ;  ; ) {
            System.out.println(String.format("%02d:%02d:%02d", heures,minutes,secondes));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Chronometre.class.getName()).log(Level.SEVERE, null, ex);
            }
            secondes++;
            if (secondes==60) {
               secondes = 0;
               minutes++;
                if (minutes==60) {
                  minutes = 0;
                  heures++;
                    if (heures==24) {
                      heures = 0;  
                    }
                }
                
            }
        }
    }
}
