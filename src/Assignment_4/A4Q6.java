/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

import java.util.Scanner;

/**
 *
 * @author Tahjeira
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get speed limit
        System.out.println("Enter the speed limit:");
        int sLimit = input.nextInt();

        //get speed of car
        System.out.println("Enter the recorded speed of the car:");
        int sCar = input.nextInt();

        //if speeding is postive the car is speeding, if its negative or 0 the car isnt
        int speeding = sCar - sLimit;
     
//if not speeding no fine
        if (speeding <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
//if speeding between 1 and 20 kmh over tell user fine of $100 
       else if (speeding >= 1 && speeding <= 20) {
            int fine = 100;
            System.out.println("You are speeding and your speeding is $" + fine);
        }
//if speeding between 21 and 30 kmh over tell user fine of $270 
       else if (speeding >= 21 && speeding <= 30) {
            int fine = 270;
            System.out.println("You are speeding and your speeding is $" + fine);
        }
//if speeding over 31 kmh  tell user fine of $500 
       else if (speeding <= 31) {
            int fine = 500;
            System.out.println("You are speeding and your speeding is $" + fine);
        }
    }
}