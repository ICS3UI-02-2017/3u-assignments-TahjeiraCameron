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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many students are in the class "); 
        int classnum = input.nextInt();//get number of students in class
        
        double[] students = new double[classnum];//make an array with a space for each students mark
        
        System.out.println("Please enter the marks");
        
        double sum = 0; //create sum
        
        for (int i = 0; i < students.length; i++) {//go through array and enter each mark then add it to the mark before it
              students[i] = input.nextDouble();
            double marks = students [i];          
            sum = sum + marks;       
        }
       
       double average = sum / classnum;     //find the average mark
       System.out.println("The class average is " + (Math.round(average * 100.0) / 100.0) + "%"); //round to two decimal places     
    }
}
