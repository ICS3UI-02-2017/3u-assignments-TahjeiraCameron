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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ask for food cost and store it
        System.out.println("How much does the food for prom cost?");
        double food = input.nextDouble();

        //ask for dJ cost and store it
        System.out.println("How much does the DJ cost?");
        double dJ = input.nextDouble();

        //ask for rent cost and store it
        System.out.println("How much does it cost to rent the hall? ");
        double rent = input.nextDouble();

        //ask for decor cost and store it
        System.out.println("How much does decorations cost?");
        double decor = input.nextDouble();

        //ask for staff cost and store it
        System.out.println("How much does it cost for staff?");
        double staff = input.nextDouble();

        //ask for misc cost and store it
        System.out.println("How much for miscellaneous costs?");
        double misc = input.nextDouble();

        //get total cost
        double cost = food + dJ + rent + decor + staff + misc;

        //find amount of tickets needed to breakeven
        double tickets = Math.ceil(cost / 35);

        //tell user answer
        System.out.println("The total cost is " + cost + " You will need to sell " + tickets + " tickets to break even.");

    }
}
