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
public abstract class FigureGeometrique {//Une classe abstract est une clase qui peut contenir de methode abstract
    Double pi = 3.14;
    public FigureGeometrique() {
    }
   public abstract Double perimetre();
   public abstract Double surface();

    @Override
    public String toString() {
        String rp = "Perimetre = "+this.perimetre()+" m"+"\n"+
                "Surface = "+this.surface()+" m2";
        return rp;
    }
   
   
}
