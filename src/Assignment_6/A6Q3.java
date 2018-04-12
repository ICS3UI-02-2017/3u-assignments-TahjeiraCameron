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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        int[] array = new int[2];//make an array with 2 integers
        
        System.out.println("Enter two integers");
     
        
        for (int i = 0; i < array.length; i++) {//go through array and enter numbers
            array [i] = input.nextInt();    
              
        }
       
       int a = array [0];
       int b = array [1]; 
        if (b > a){
            System.out.println("The intgers in ascending order are " + a + " " + b);
        }else{
            System.out.println("The integers in ascending order are " + b + " " + a);
        }
    }
}
