/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigureGeometrique;

/**
 *
 * @author Makan
 */
public abstract class FGeometrie {
    Double pi = 3.14;
   public FGeometrie(){
   } 
   public abstract Double perimetre();
   public abstract Double surface();
   @Override
   public String toString(){
       String rt = "Perimetre = "+this.perimetre()+"\n"+
               "Surface = "+this.surface();
       return rt;
   }
}
