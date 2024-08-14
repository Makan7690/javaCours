/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision.heritage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.RunnableFuture;

/**
 *
 * @author Makan
 */
public class NewClass {
    public static void main(String[] args) {
        
    
    Thread cv = new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 1;i <= 60 ;i++ ) {
                try {
             Date de = new Date();
                    SimpleDateFormat s = new SimpleDateFormat("EEE, Y/MM/dd, hh:mm:ss");
                    String r = s.format(de);
                    Thread.sleep(1000);
                    System.out.println(r);
                    
                } catch (Exception e) {
                }
    
            }
        }
    });
    cv.start();
    }
}
