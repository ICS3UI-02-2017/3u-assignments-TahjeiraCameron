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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //get user name
        System.out.println("Please enter your name");
        String name = input.nextLine();

        //blank line
        System.out.println();

        //get test scores and what each test was out of, and then print a blank line
        System.out.println("What was the first test out of?");
        double test1 = input.nextDouble();

        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();
        System.out.println();
        
        System.out.println("What was the second test out of?");
        double test2 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark2 = input.nextDouble();
        
        System.out.println();
        System.out.println("What was the third test out of?");
        double test3 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();
        System.out.println();
       
        System.out.println("What was the fourth test out of?");
        double test4 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();
        System.out.println();
        
        System.out.println("What was the fifth test out of?");
        double test5 = input.nextDouble();
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();

        //find score for all tests
        double final1 = mark1 / test1 * 100;

        double final2 = mark2 / test2 * 100;

        double final3 = mark3 / test3 * 100;

        double final4 = mark4 / test4 * 100;

        double final5 = mark5 / test5 * 100;

        //find overall score
        double overall = (final1 + final2 + final3 + final4 + final5) / 5;
        //blank line
        System.out.println();
        //tell user each test score as well as overall score
        System.out.println("Test Scores for " + name);
        System.out.println("Test 1: " + final1 + "%");
        System.out.println("Test 2: " + final2 + "%");
        System.out.println("Test 3: " + final3 + "%");
        System.out.println("Test 4: " + final4 + "%");
        System.out.println("Test 5: " + final5 + "%");
        System.out.println("Test 5: " + final5 + "%");
        System.out.println();
        System.out.println("Average: " + overall);


    }
}
