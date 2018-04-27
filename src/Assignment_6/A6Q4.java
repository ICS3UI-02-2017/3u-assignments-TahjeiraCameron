/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author camet2651
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] array = new double[10];//make an array with 10 integers

        System.out.println("Enter ten integers");

        for (int i = 0; i < array.length; i++) {//go through array and enter each number
            array[i] = input.nextDouble();
        }

        for (int x = 0; x <= (array.length - 1); x++) {//go through each number after getting the one behind its poistion
            for (int y = (x + 1); y < array.length; y++) {//go to the number next to the number you are working with
                if (array[x] > array[y]) {//if the number is greater than the one in front of it switch their poistions
                    int temp = (int) array[x];
                    array[x] = array[y];
                    array[y] = temp;
                }
            }
        }
        System.out.println("The marks from smallest to greatest are " + Arrays.toString(array));// print out the answer
    }
}
