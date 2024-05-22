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
public class Cercle extends FigureGeometrique{
    protected Double rayon;

    public Cercle() {
    }

    public Cercle(Double rayon) {
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
        Double r = this.getRayon();
        Double p = 2*pi*r;
        return p;
    }

    @Override
    public Double surface() {
       Double r = this.getRayon();
        Double s = pi*r*r;
        return s;  
    }

    @Override
    public String toString() {
        String ty = "Rayon = "+this.getRayon()+" m"+"\n"+
           super.toString();
        return ty;
    }
    
}
