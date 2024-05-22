/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision.heritage;

/**
 *
 * @author Makan
 */
public class Testinfos {
    public static void main(String[] args) {
       infos tres = new infos("Makan","Magassa","Kalaban-coro","+76 90 98 47");
    infos tres1 = new infos("Segou","Magassa","Kalaban-coro","+76 56 98 47");
    infos tres2 = new infos("Aichata","Magassa","Diallo-coro","+76 45 21 47");
    infos tres3 = new infos("Fatoumata","Magassa","Kalaban-coura","+66 90 98 47");
    infos tres4 = new infos("Korotoum","Magassa","ACI","+67 90 98 47");
    infos [] table ={tres,tres1,tres2,tres3,tres4}; 
        for (infos srt: table) {
            System.out.println(srt); 
        }
        System.out.println("nombre de personnes est : "+infos.nombrepers);
    }
}
