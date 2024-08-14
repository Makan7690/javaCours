/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author Makan
 */
public interface Animal {
    public String seDeplace();// Toutes les methodes sont abstraites par defaut. 
  default public String manger(){
        String ret;
      return ret = "bh";
  };// Toutes les methodes sont abstraites par defaut. 
        
    
}
