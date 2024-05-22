/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.sql.Driver;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Makan
 */
public class TestEmployes {
    public static void main(String[] args) {
        
        EntityManagerFactory empContr = Persistence.createEntityManagerFactory("DebutantPU");
        EmployesJpaController emc = new EmployesJpaController(empContr);
        
        List<Employes> employes = emc.findEmployesEntities();
        
        for(Employes e : employes){
            int matricule = e.getMatricule();
            String prenom = e.getPrenom();
            String nom = e.getNom();
            int salaire = e.getSalaire();
            String contact = e.getContact();
            String adresse = e.getAdresse();
            
            String rep = matricule+" "+
                    prenom+" "+
                    nom+" "+
                    salaire+" "+
                    contact+" "+
                    adresse;
            
            System.out.println(rep);
        }
        
    }
}
