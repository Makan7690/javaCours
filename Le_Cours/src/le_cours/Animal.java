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
public interface Animal {
  default void eat(){
       System.out.println("L'animal mange.");
   }
   void sleep(); 
}
