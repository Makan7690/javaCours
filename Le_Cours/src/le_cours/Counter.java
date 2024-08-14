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
public class Counter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
