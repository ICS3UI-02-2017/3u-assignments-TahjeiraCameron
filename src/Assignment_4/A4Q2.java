/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author camet2651
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //Asking for inches
        System.out.println("Please enter the measurement in inches you wish to convert:");

        //make a double to sotre inches
        double inches = input.nextDouble();
        
        //find cm 
        double centi = inches * 2.54;
                
        //print out answer 
       System.out.println(inches + " inches is the same as " + centi + " cm");
    }
}
