/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_7;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author camet2651
 */
public class A7 {

    /**
     * @param args the command line arguments
     */
    public static double areaCircle(Double radius) {
        double answer = Math.PI * (radius * radius); // find area of circle using radius
        return answer;
    }

    public static void examGrade(Double mark) {
        //determine letter mark based on percentage
        if (mark < 50) {
            System.out.println("F");
        }
        if (mark > 50 && mark < 59) {
            System.out.println("D");
        }
        if (mark > 60 && mark < 69) {
            System.out.println("C");
        }
        if (mark > 70 && mark < 79) {
            System.out.println("B");
        }
        if (mark > 80) {
            System.out.println("A");
        }
    }

    public static void factors(int num) {

        for (int factor = 1; factor <= num; factor++) { //go through every number between 1 and integer
            if (num % factor == 0) { //see if the number is a factor
                    int multiply = num/factor;
                    System.out.println(factor + " is a factor of " + num + " ,multiply it with " + multiply + " to make " + num);
            }
        }
       
    }

    public static double compoundInterest(double p, double r, int years) {
        double balance = p * (Math.pow((1 + r), years));//find the compounded interest using a formula
        return balance;
    }

    public static void chaos(int lines) {
        Random rand = new Random();
        for (int i = 0; i <= lines; i++) {
            int randNum = rand.nextInt((5 - 1) + 1) + 1; //generate a random number between 1 and 5

            //print out same number as * as number generated
            if (randNum == 1) {
                System.out.println("*");
            }
            if (randNum == 2) {
                System.out.println("**");
            }
            if (randNum == 3) {
                System.out.println("***");
            }
            if (randNum == 4) {
                System.out.println("****");
            }
            if (randNum == 5) {
                System.out.println("*****");
            }
        }

    }

    public static int lastDigit(int num) {
        int ans = num % 10; // find the remainder of the number --> last digit
        if (ans < 0) {//if answer is negative make it positive
            ans = -ans;
        }
        return ans;
    }

    public static int firstDigit(int num) {
        int ans = 0;
        if (num < 0) {//if answer is negative make it positive 
            num = -num;
        }

        while (num > 0) {//divide number by 10 until you get the last digit
            //int save = x
            ans = num % 10;
            num = num / 10;
        }

        return ans;

    }

    public static boolean allDigitsOdd(int x) {

        int ans = 0;
        boolean odd = true;

        while (x > 0) {
            //int save = x
            ans = x % 10;
            if (ans % 2 == 0) { //see if digit is even or odd
                odd = false;
            }

            x = x / 10; //move to next digit

        }
        return odd;
    }

    public static void main(String[] args) {
        double test = areaCircle(3.0);
        System.out.println(test);

        //testing A7Q2
        examGrade(0.8);

        //testing A7Q3
        factors(30);

        //find out if right
        test = compoundInterest(103.65, 0.1, 4);
        System.out.println(("$" + Math.round(test * 100.0) / 100.0));

        //testing A7Q5
        chaos(1);

        //testing A7Q6
        int inTest = lastDigit(-357287);
        System.out.println(inTest);

        //testing A7Q7
        inTest = firstDigit(-457654304);
        System.out.println(inTest);

        //testing A7Q8
        boolean boolTest = allDigitsOdd(110345);
        System.out.println(boolTest);

    }
}
