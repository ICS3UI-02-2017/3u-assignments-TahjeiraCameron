/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author camet2651
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are there ");
        int marknum = input.nextInt();//get number of students in class

        double[] array = new double[marknum];//make an array with that number

        System.out.println("Enter the marks");

        for (int i = 0; i < array.length; i++) {//go through array and enter each number
            array[i] = input.nextDouble();
        }

        for (int x = 0; x <= (array.length - 1); x++) {//go through each number after getting the one behind its poistion
            for (int y = (x + 1); y < array.length; y++) {//go to the number next to the number you are working with
                if (array[x] > array[y]) {//if the number is greater than the one in front of it switch their poistions
                    double temp = array[x];
                    array[x] = array[y];
                    array[y] = temp;
                }
            }
        }

        double sum = 0.0;

        for (double i : array) { //add all the numbers in the array together
            sum += i;
        }
        double average = sum / marknum; //find average

        System.out.println("The highest mark is " + array[array.length - 1] + " ,the lowest mark is " + array[0] + " ,and the average mark is " + average);

    }
}
