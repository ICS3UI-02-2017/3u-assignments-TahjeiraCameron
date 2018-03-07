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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user for number
        System.out.println("Please enter in 4 numbers on separate lines:");

        //store the four numbers in doubles
        double one = input.nextDouble();
        double two = input.nextDouble();
        double three = input.nextDouble();
        double four = input.nextDouble();

        //print out numbers 
        System.out.println("Your numbers were " + one + ", " + two + ", " + three + ", " + "and " + four);



    }
}
