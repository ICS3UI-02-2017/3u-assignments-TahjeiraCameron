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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double height = 0;
         Scanner input = new Scanner(System.in);
        System.out.println("How many people are there"); 
        int num = input.nextInt();//get number of students in class
        
        double[] people = new double[num];//make an array with a space for each height
        
        System.out.println("Please enter the heights");
        
        double sum = 0; //create sum
        
        for (int i = 0; i < people.length; i++) {//go through array and enter each height then add it to the mark before it
             people[i] = input.nextDouble();
            double heights = people [i];          
            sum = sum + heights;         
        }
        
        double average = sum / num;     //find the average heights
        
        for (int i = 0; i < people.length; i++) {
            if (people[i] > average) //see if height is greater than average then print it out if it is
                System.out.println(people[i] + " is above the average height");
        }
    }
}
