/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare.generer;

/**
 *
 * @author Makan
 */
public class Voiture {
  private String marque;  
  private String model;  
  private String couleur;

    public Voiture() {
    }

    public Voiture(String marque, String model, String couleur) {
        this.marque = marque;
        this.model = model;
        this.couleur = couleur;
    }

    /**
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        String s = "La marque est: "+this.getMarque()+"\n"
                + "Le model est: "+this.getModel()+"\n"
                + "La couleur est: "+this.getCouleur();
        return s;
    }
  
}
