/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare.objet;

/**
 *
 * @author Makan
 */
public class Personne {
//   Attributs
   protected  String prenom;
   protected String nom;
   protected int age;
   protected static int nombreDePersonne = 0;

//   Constructeur sans parametre (constructeur par defaut) Initialisation des att.
    public Personne() {
        nombreDePersonne = nombreDePersonne +1;
    }

//    Constructeur avec tous les parametres
    public Personne(String prenom, String nom, int age) {    
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        nombreDePersonne = nombreDePersonne +1;
    }
//    Constructeur avec les parametres Prenom et Nom
    public Personne(String Prenom, String Nom) {
        this.prenom = Prenom;
        this.nom = Nom;
        nombreDePersonne = nombreDePersonne +1;
    }

//    getters and setters (Les accesseurs et les modifieurs)
    /**
     * @return the Prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param Prenom the Prenom to set
     */
    public void setPrenom(String Prenom) {
        this.prenom = Prenom;
    }

    /**
     * @return the Nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.nom = Nom;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.age = Age;
    }
   
    @Override
    public String toString() {
        String re = "Votre prenom est: "+this.getPrenom()+"\n"
                + "Votre nom  est:  "+this.getNom()+"\n"
                + "Votre age est: "+this.getAge();
        return re;
    }

    public static int getNombreDePersonne() {
        return nombreDePersonne;
    }
    
}
