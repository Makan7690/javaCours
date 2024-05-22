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
public class Pour {
   private String adesse;
   private String email;
   private int number;

    public Pour() {
    }

    public Pour(String adesse, String email, int number) {
        this.adesse = adesse;
        this.email = email;
        this.number = number;
    }
   
    /**
     * @return the adesse
     */
    public String getAdesse() {
        return adesse;
    }

    /**
     * @param adesse the adesse to set
     */
    public void setAdesse(String adesse) {
        this.adesse = adesse;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
}
