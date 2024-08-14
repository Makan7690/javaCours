/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le_cours;

/**
 *
 * @author Makan
 */
public class MyRunnable implements Runnable{
   private String threadName;
    public MyRunnable(String name){
       threadName = name;
 }
    @Override
    public void run() {
       for (int i = 0; i < 5; i++) {
        System.out.println(threadName + " iteration " + i);
        try {
        Thread.sleep(1000); // Mettre en pause pendant 1 seconde
        } catch (InterruptedException e) {
        System.out.println(threadName + " interrompu.");
        }
        }
        System.out.println(threadName + " terminé.") ;
    }
    public static void main(String[] args) throws InterruptedException {
 Thread thread1 = new Thread(new MyRunnable("Thread 1"));
 Thread thread2 = new Thread(new MyRunnable("Thread 2"));
 Thread thread3 = new Thread(new Runnable() {
     @Override
     public void run() {
         for (int i = 0; i < 4; i++) {
             System.out.println("Thread3 "+i);
              try {
        Thread.sleep(1000); // Mettre en pause pendant 1 seconde
        } catch (InterruptedException e) {
        }
         }
     }
 });
 thread1.start();
 thread2.start();
 thread3.start();
       thread1.join(); // Attendre que thread1 se termine
       thread2.join(); // Attendre que thread2 se termine
       thread3.join(); // Attendre que thread2 se termine
 System.out.println("Tous les threads terminés.");
        System.out.println("19 modulo12 = "+19%12);
 }
 }
    

