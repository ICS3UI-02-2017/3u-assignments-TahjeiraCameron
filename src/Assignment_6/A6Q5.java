/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;

/**
 *
 * @author camet2651
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many marks are there ");
        int marknum = input.nextInt();//get number of students in class

        double[] array = new double[marknum];//make an array with that number

        System.out.println("Enter the marks");

        for (int i = 0; i < array.length; i++) {//go through array and enter each mark
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
        if ((marknum % 2) == 0) { //find if number is even
            int middle = (marknum / 2) - 1; //find first "middle" number
            int next = middle + 1; //find number next to it

            double median = (array[middle] + array[next]);//add two numbers together

            double finalmedian = median / 2;//divide the two numbers to get median

            System.out.println("The median is " + finalmedian); //print out answer
        }

        if ((marknum % 2) != 0) { //number is odd
            int middle = (int) Math.ceil(marknum / 2); //find the middle number
            System.out.println("The median is " + array[middle]);
        }
    }
}
