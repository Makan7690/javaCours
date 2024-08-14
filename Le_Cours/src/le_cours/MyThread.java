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
class MyThread extends Thread {
 public void run() {
 // Code à exécuter dans le thread
        System.out.println("Thread exécuté par MyThread.");
    }
    
    
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
 }
