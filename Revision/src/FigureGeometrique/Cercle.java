/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigureGeometrique;

/**
 *
 * @author Makan
 */
public class Cercle extends FGeometrie{
   private Double rayon;
   public Cercle(){
   }
   public Cercle(Double rayon){
       this.rayon = rayon;
   }

    public Double getRayon() {
        return rayon;
    }

    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }

    @Override
    public Double perimetre() {
       Double r = this.rayon;
       Double p = 2*pi*r;
       return p;
    }

    @Override
    public Double surface() {
      Double r = this.rayon;
       Double s = pi*r*r;
       return s;   
    }
    @Override
    public String toString(){
      String qw = "Rayon = "+this.getRayon();
      super.toString();
      return qw;
    }
}
