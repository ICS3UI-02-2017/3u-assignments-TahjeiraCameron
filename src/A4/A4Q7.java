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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter sum of dice");
        int roll = 1; //user inputted roll
        int current = 1; //starting square
        int previous = 0; //last square

        System.out.println("Welcome to Snakes and Ladders! When prompted for your roll please enter a number between and including 2 and 12. If you want to quit enter 0. ");
        while (1 == 1) {//quit game if 0 is entered
            System.out.println("Enter sum of dice");
            roll = input.nextInt();
            previous = current;
            current = roll + previous;

            if (roll == 0) {//if user enters 0 quit  
                System.out.println("You quit!");
                System.exit(0);
            }

            while (roll < 2 || roll > 12) { //if user inputs an invalid number ask for new number
                System.out.println("Enter sum of dice");
                current = previous;
                roll = input.nextInt();
                previous = current;
                current = roll + previous;
            }

            if (current == 9) {//first ladder brings player to 34        
                System.out.println("You landed on a ladder on square " + current + "!");
                current = 34;
            }

            if (current == 40) {//second ladder brings player to 34
                System.out.println("You landed on a ladder on square " + current + "!");
                current = 64;
            }

            if (current == 67) {//third ladder brings player to 34
                System.out.println("You landed on a ladder on square " + current + "!");
                current = 86;
            }

            if (current == 54) {//first snake brings player to 34
                System.out.println("You landed on a snake on square " + current + "!");
                current = 19;
            }

            if (current == 90) {//second snake brings player to 34
                System.out.println("You landed on a snake on square " + current + "!");
                current = 48;
            }

            if (current == 99) {//third snake brings player to 34
                System.out.println("You landed on a snake on square " + current + "!");
                current = 77;
            }

        /** not working    if (current == 100) {//if player reaches 100 return messsage and exit game
                System.out.println("You are now on square " + current); // tell user what square they are on
                System.out.println("You Win!");
                System.exit(0);
            }
            */
            while (current > 100) {//if player enter a roll thats too big prompt to enter a new number                    
                current = previous;
                System.out.println("You are now on square " + current);
                System.out.println("Enter sum of dice");
                roll = input.nextInt();
                previous = current;
                current = roll + previous;
            }

            System.out.println("You are now on square " + current); // tell user what square they are on
        }
    }
}
//way to get input next to text instead of underneath

