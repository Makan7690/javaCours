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
public class Rectangle extends FigureGeometrique{
    protected Double longueur;
    protected Double largeur;

    public Rectangle() {
    }

    public Rectangle(Double longueur, Double largeur) {
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
    public String toString() {
        String repr
              = "Longueur = "+this.getLongueur()+" m"+"\n"+
                "Largeur = "+this.getLargeur()+" m"+"\n"+
                super.toString();
        return repr;
    }
    
}
