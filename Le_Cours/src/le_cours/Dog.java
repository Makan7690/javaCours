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
public class Dog implements Animal{

    @Override
    public void eat() {
        System.out.println("Le chien mange.");
    }

    @Override
    public void sleep() {
        System.out.println("Le chien dort.");
    }
    public static void main(String[] args) {
        Animal mydog = new Dog();
        mydog.eat();
        mydog.sleep();
        Utility.printMessage();
    }
 
}
