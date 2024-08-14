/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le_cours;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Makan
 */
public class LaDate {
    public static void main(String[] args) {
         Date ert = new Date();
         Date spe = new Date(1720631763098L);
         long wer = ert.getTime();
         long maintenant = ert.getTime();
         long unJour = 86400*1000L;
         int n = 18;
         long nJour = n*unJour;
         int comparaison = spe.compareTo(ert);
         
         
        System.out.println(comparaison);
        System.out.println(ert);
        System.out.println(spe.toString());
        System.out.println(wer);
        System.out.println(new Date(maintenant));
        System.out.println(new Date(maintenant + unJour));
        System.out.println(new Date(maintenant + nJour));
         
        
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDate = sdf.format(now);
        System.out.println("Date formatée: " + formattedDate);
         
        
        LocalDate today = LocalDate.now();
        System.out.println("Date actuelle: " + today.plusDays(8));
        LocalDate specificDate = LocalDate.of(2023, 6, 23);
        Instant instant = now.toInstant();
        System.out.println("Converti en instant. "+instant);
        System.out.println("Date spécifique: " + specificDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDat = today.format(formatter);
        System.out.println("Date formatée: " + formattedDat);
    }
         
}
