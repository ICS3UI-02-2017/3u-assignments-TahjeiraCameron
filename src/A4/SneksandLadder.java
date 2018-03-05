/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tahjeira
 */
public class SneksandLadder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int roll = 1; //user inputted roll
        int current = 1; //starting square and current square
        int previous = 0; //last squareuser was on

        int rollC = 1;//computer roll
        int currentC = 1;//computers square
        int previousC = 0;//computers last square

        int turn = 0;//players turn
        int turnC = 0;//computers turn

        System.out.println("Welcome to Snakes and Ladders! When prompted for your roll please enter a number between and including 2 and 12. If you want to quit enter 0. ");
        while (1 == 1) {
            while (turn == 0) {//quit game if 0 is entered
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

                if (current == 40) {//second ladder brings player to 64
                    System.out.println("You landed on a ladder on square " + current + "!");
                    current = 64;
                }

                if (current == 67) {//third ladder brings player to 86
                    System.out.println("You landed on a ladder on square " + current + "!");
                    current = 86;
                }

                if (current == 54) {//first snake brings player to 19
                    System.out.println("You landed on a snake on square " + current + "!");
                    current = 19;
                }

                if (current == 90) {//second snake brings player to 48
                    System.out.println("You landed on a snake on square " + current + "!");
                    current = 48;
                }

                if (current == 99) {//third snake brings player to 77
                    System.out.println("You landed on a snake on square " + current + "!");
                    current = 77;

                }

                if (current == 100) {//if player reaches 100
                 System.out.println("You are now on square " + current); // tell user what square they are on
                 System.out.println("You Win!");
                 System.exit(0); 
                }
               
                while (current > 100) {//if player enter a roll thats too big prompt to enter a new number                    
                    current = previous;
                    System.out.println("You are now on square " + current);
                    System.out.println("Enter sum of dice");
                    roll = input.nextInt();
                    previous = current;
                    current = roll + previous;
                }
                System.out.println("You are now on square " + current); // tell user what square they are on
                System.out.println("");//blank line
                turn = 1;//finish users turn
                turnC = 0;//start computers turn
            }

            robot: //label
            while (turnC == 0) {
                rollC = rand.nextInt((12 - 2) + 1) + 2;
                previousC = currentC;
                currentC = rollC + previousC;

                if (currentC == 9) {//first ladder brings computer to 34            
                    System.out.println("The computer landed on a ladder on square " + currentC + "!");
                    currentC = 34;
                    System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                    System.out.println("");//blank line
                    turnC = 1; //finish computers turn  
                    turn = 0;//start user turn
                    break; //go back to user
                }

                if (currentC == 40) {//second ladder brings computer to 34
                    System.out.println("The computer landed on a ladder on square " + currentC + "!");
                    currentC = 64;
                    System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                    System.out.println("");//blank line
                    turnC = 1; //finish computers turn  
                    turn = 0;//start user turn
                    break; //go back to user
                }

                if (currentC == 67) {//third ladder brings player to 34
                    System.out.println("The computer landed on a ladder on square " + currentC + "!");
                    currentC = 86;
                    System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                    System.out.println("");//blank line
                    turnC = 1; //finish computers turn  
                    turn = 0;//start user turn
                    break; //go back to user
                }

                if (currentC == 54) {//first snake brings computer to 34
                    System.out.println("The computer landed on a snake on square " + currentC + "!");
                    currentC = 19;
                    System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                    System.out.println("");//blank line
                    turnC = 1; //finish computers turn  
                    turn = 0;//start user turn
                    break; //go back to user
                }

                if (currentC == 90) {//second snake brings computer to 34
                    System.out.println("The computer landed on a snake on square " + currentC + "!");
                    currentC = 48;
                    System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                    System.out.println("");//blank line
                    turnC = 1; //finish computers turn  
                    turn = 0;//start user turn
                    break; //go back to user
                }

                if (currentC == 99) {//third snake brings computer to 34
                    System.out.println("The computer landed on a snake on square " + currentC + "!");
                    currentC = 77;
                    System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                    System.out.println("");//blank line
                    turnC = 1; //finish computers turn  
                    turn = 0;//start user turn
                    break; //go back to user
                }

                
                   if (currentC == 100) {//if player reaches 100
                 System.out.println("The robot is now on square " + currentC); // tell user what square they are on
                 System.out.println("The robots wins!"); System.exit(0); 
                   }
                 
                while (currentC > 100) {//if computer enter a roll thats too big roll a new number                  
                    currentC = previousC;
                    System.out.println("The computer is now on square " + currentC);
                    rollC = rand.nextInt((12 - 2) + 1) + 2;
                    previousC = currentC;
                    currentC = rollC + previousC;
                }
                System.out.println("The computer rolled a " + rollC + " and is now on square " + currentC); // tell user what square computer is on
                System.out.println("");//blank line
                turnC = 1;//end computers turn
                turn = 0;//start players turn
            }
        }
    }
}
