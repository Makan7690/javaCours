/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intermediare;
import java.util.Scanner;
/**
 *
 * @author Makan
 */
public class Numbers {
    public static void main(String[] args) {
       Scanner maka=new Scanner(System.in); 
       int num1 = 0;
       int num2 =0;
        System.out.print("Enter the first number: ");
        num1=maka.nextInt();
        System.out.print("Enter the second number: ");
        num2=maka.nextInt();
        System.out.println("The somme of "+num1+ " and "+ num2+ " is "+(num1+num2));
        System.out.println("The soubtraction of "+num1+ " and "+ num2+ " is "+(num1-num2));
        System.out.println("The multiplication of "+num1+ " and "+ num2+ " is "+(num1*num2));
        System.out.println("The division of "+num1+ " and "+ num2+ " is "+(num1/num2));
    }
 
}
