/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package le_cours;

/**
 *
 * @author Makan
 */
public class Astuces {
    public static int maximum(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
        
    }
    public static int fact(int n){
//        if (n==0) {
//            return 1;  
//        }else{
//            return n*fact(n-1);
//        }
       return (n==0)? 1 : n*fact(n-1);
    }
    public static String grade(int score){
        if (score >=90) {
            return "A";
        } else {
            if (score>=80) {
                return "B";
            } else {
                if (score>=70) {
                  return "C";
                } else {
                    if (score>=60) {
                       return "D";
                    } else {
                        return "E";
                    }
                }
            }
        }
    }
    public static String grade1(int score) {
        String grade = (score >= 90) ? "A" :
        (score >= 80) ? "B" :
        (score >= 70) ? "C" :
        (score >= 60) ? "D" : "E";
        return grade;
    }
    public static void main(String[] args) {
        int n = 5; int g = 69;
        int number = 10;
        String result = (number % 2 == 0) ? "Pair" : "Impair";
        System.out.println("Le nombre est " + result);
        System.out.println("Veuillez saisir deux nombre: ");
       // Astuces a1 = new Astuces();
        System.out.println("Le maximum est : "+Astuces.maximum(33, 56));
        System.out.println(n+" ! = "+fact(n));
        System.out.println(grade(g));
        System.out.println(grade1(g));
        
    }
}
