/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

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

        System.out.println("Enter the speed limit:");
        int sLimit = input.nextInt();

        System.out.println("Enter the recorded speed of the car:");
        int sCar = input.nextInt();

        int speeding = sCar - sLimit;

        System.out.println(speeding);

        if (speeding <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }

        if (speeding >= 1 && speeding <= 20) {
            int fine = 100;
            System.out.println("You are speeding and your speeding is $" + fine);
        }

        if (speeding >= 21 && speeding <= 30) {
            int fine = 270;
            System.out.println("You are speeding and your speeding is $" + fine);
        }

        if (speeding <= 31) {
            int fine = 500;
            System.out.println("You are speeding and your speeding is $" + fine);
        }
    }
}
