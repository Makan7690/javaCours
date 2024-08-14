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
public class CounterThread extends Thread {
    private Counter  counter;
    public CounterThread(Counter counter){
       this.counter = counter; 
    }
    public void run(){
        for (int i = 0; i < 100; i++) {
            counter.increment();
            
        }
    }
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread t1 = new CounterThread(counter);
        Thread t2 = new CounterThread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
        }
        System.out.println("Count : "+counter.getCount());
    }
}
