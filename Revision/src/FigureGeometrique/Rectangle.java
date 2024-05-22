/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FigureGeometrique;

/**
 *
 * @author Makan
 */
public class Rectangle extends FGeometrie{
 protected Double longueur; 
 protected Double largeur; 
 public Rectangle(){
 } 
public Rectangle(Double longueur,Double largeur ){
    this.longueur = longueur;
    this.largeur = largeur;
}
    public Double getLongueur() {
        return longueur;
    }

    public void setLongueur(Double longueur) {
        this.longueur = longueur;
    }

    public Double getLargeur() {
        return largeur;
    }

    public void setLargeur(Double largeur) {
        this.largeur = largeur;
    }
     @Override
    public Double perimetre() {
         Double L = this.getLongueur();
         Double l = this.getLargeur();
         Double p = 2*(L+l);
         return p;
    }
    @Override
    public Double surface() {
       Double L = this.getLongueur();
         Double l = this.getLargeur();
         Double s = L*l;
         return s;
    }
    @Override
    public String toString(){
        String as = "Longueur = "+this.getLongueur()+"\n"+
                "Largeur = "+this.getLargeur();
                super.toString();
        return as;
    }
}
