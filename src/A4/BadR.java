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
public class BadR {

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
        System.out.println("To play alone enter 1, to play with a friend enter 2, to play with a friendly computer enter 3, and to play against the special computer enter 4");//user chooses theiir mode
        int choice = input.nextInt();

        if (choice == 1) {//if user wants to play alone
            while (1 == 1) {
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
            }
        }

        if (choice == 2) {
            int turn2 = 0; //for seocnd players turn
            int current2 = 1;//second players square
            int previous2 = 0; //second players last square

            System.out.println("What is player 1's name?");//get first players name   
            String name1 = input.next();

            System.out.println("What is player 2's name?"); // get second players name 
            String name2 = input.next();

            while (1 == 1) {
                while (turn == 0) {//first players turn
                    System.out.println("Enter sum of dice " + name1);
                    roll = input.nextInt();
                    previous = current;
                    current = roll + previous;

                    if (roll == 0) {//if user enters 0 quit  
                        System.out.println("You quit!");
                        System.exit(0);
                    }

                    while (roll < 2 || roll > 12) { //if user inputs an invalid number ask for new number
                        System.out.println("Enter sum of dice" + name1);
                        current = previous;
                        roll = input.nextInt();
                        previous = current;
                        current = roll + previous;
                    }

                    if (current == 9) {//first ladder brings player to 34        
                        System.out.println(name1 + " landed on a ladder on square " + current + "!");
                        current = 34;
                    }

                    if (current == 40) {//second ladder brings player to 64
                        System.out.println(name1 + " landed on a ladder on square " + current + "!");
                        current = 64;
                    }

                    if (current == 67) {//third ladder brings player to 86
                        System.out.println(name1 + " landed on a ladder on square " + current + "!");
                        current = 86;
                    }

                    if (current == 54) {//first snake brings player to 19
                        System.out.println(name1 + " landed on a snake on square " + current + "!");
                        current = 19;
                    }

                    if (current == 90) {//second snake brings player to 48
                        System.out.println(name1 + " landed on a snake on square " + current + "!");
                        current = 48;
                    }

                    if (current == 99) {//third snake brings player to 77
                        System.out.println(name1 + " landed on a snake on square " + current + "!");
                        current = 77;

                    }

                    if (current == 100) {//if player reaches 100
                        System.out.println(name1 + " is now on square " + current); // tell user what square they are on
                        System.out.println(name1 + " wins!");
                        System.exit(0);
                    }

                    while (current > 100) {//if player enter a roll thats too big prompt to enter a new number                    
                        current = previous;
                        System.out.println(name1 + " is now on square " + current);
                        System.out.println("Enter sum of dice" + name1);
                        roll = input.nextInt();
                        previous = current;
                        current = roll + previous;
                    }
                    System.out.println(name1 + " is now on square " + current); // tell user what square they are on
                    System.out.println("");//blank line
                    turn = 1;//finish player 1 turn
                    turn2 = 0;//start player 2 turn
                }

                while (turn2 == 0) {
                    System.out.println("Enter sum of dice " + name2);
                    roll = input.nextInt();
                    previous2 = current2;
                    current2 = roll + previous2;

                    if (roll == 0) {//if user enters 0 quit  
                        System.out.println("You quit!");
                        System.exit(0);
                    }

                    while (roll < 2 || roll > 12) { //if user inputs an invalid number ask for new number
                        System.out.println("Enter sum of dice" + name2);
                        current2 = previous2;
                        roll = input.nextInt();
                        previous2 = current2;
                        current2 = roll + previous2;
                    }

                    if (current == 9) {//first ladder brings player to 34        
                        System.out.println(name2 + " landed on a ladder on square " + current + "!");
                        current2 = 34;
                    }

                    if (current == 40) {//second ladder brings player to 64
                        System.out.println(name2 + " landed on a ladder on square " + current + "!");
                        current2 = 64;
                    }

                    if (current == 67) {//third ladder brings player to 86
                        System.out.println(name2 + " landed on a ladder on square " + current + "!");
                        current2 = 86;
                    }

                    if (current == 54) {//first snake brings player to 19
                        System.out.println(name2 + " landed on a snake on square " + current + "!");
                        current2 = 19;
                    }

                    if (current == 90) {//second snake brings player to 48
                        System.out.println(name2 + " landed on a snake on square " + current + "!");
                        current2 = 48;
                    }

                    if (current == 99) {//third snake brings player to 77
                        System.out.println(name2 + " landed on a snake on square " + current + "!");
                        current2 = 77;

                    }

                    if (current == 100) {//if player reaches 100
                        System.out.println(name2 + " is now on square " + current); // tell user what square they are on
                        System.out.println(name2 + " wins!");
                        System.exit(0);
                    }

                    while (current > 100) {//if player enter a roll thats too big prompt to enter a new number                    
                        current = previous;
                        System.out.println(name2 + " is now on square " + current);
                        System.out.println("Enter sum of dice" + name2);
                        roll = input.nextInt();
                        previous2 = current2;
                        current2 = roll + previous2;
                    }
                    System.out.println(name2 + " is now on square " + current2); // tell user what square they are on
                    System.out.println("");//blank line
                    turn2 = 1;//finish player 2's turn
                    turn = 0;//start computers turn
                }
            }
        }

        if (choice == 3) {//user plays with normal computer
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
                        System.out.println("The robots wins!");
                        System.exit(0);
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

        if (choice == 3) {
            while (1 == 1) {
                while (turn == 0) {
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

                while (turnC == 0) {

                    if (current > (currentC + 30)) {//if player gets more than 30 squares ahead robot brings player to start 
                        System.out.println("The computer is mad it's losing and uses its special arm to bring you back to square 1 ");
                        previous = current;
                        current = 1;
                        System.out.println("You are now on square " + current);

                    }

                    rollC = rand.nextInt((12 - 2) + 1) + 2;//robot rolls random number
                    previousC = currentC;
                    currentC = rollC + previousC;

                    if (current > (currentC + 20)) {//if player gets more than 20 squares ahead robot moves to same square
                        System.out.println("The computer is mad it's losing and uses its own dice ");
                        currentC = current;
                        System.out.println("The computer rolled a " + (currentC - previousC) + " and is now on square " + currentC + "with you");
                    }

                    if (current > (currentC + 10)) {//if player gets more than 10 squares ahead robot asks a question
                        System.out.println("If you're so good then answer a question");
                        int firstNumber = rand.nextInt((30 - 0) + 1) + 0;
                        int secondNumber = rand.nextInt((30 - -30) + 1) + -30;
                        System.out.println("What is " + firstNumber + "+" + secondNumber + "?");
                        int answer = input.nextInt();
                        if (answer == (firstNumber + secondNumber)) {
                            System.out.println("The computer moves you up 2 squares");
                            previous = current;
                            current = previous + 2;
                            System.out.println("You are now on square " + current);
                        }

                        if (answer != (firstNumber + secondNumber)) {
                            System.out.println("You must be cheating");
                            previous = current;
                            current = previous - 2;
                            System.out.println("You are now on square " + current);
                        }
                    }

                    if (currentC == 9) {//first ladder brings computer to 34            
                        System.out.println("The computer landed on a ladder on square " + currentC + "!");
                        currentC = 34;
                        System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                        System.out.println("");//blank line
                        turnC = 1; //finish computers turn  
                        turn = 0;//start user turn    
                    }

                    if (currentC == 40) {//second ladder brings computer to 64
                        System.out.println("The computer landed on a ladder on square " + currentC + "!");
                        currentC = 64;
                        System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                        System.out.println("");//blank line
                        turnC = 1; //finish computers turn  
                        turn = 0;//start user turn
                        break; //go back to user
                    }

                    if (currentC == 67) {//third ladder brings player to 86
                        System.out.println("The computer landed on a ladder on square " + currentC + "!");
                        currentC = 86;
                        System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                        System.out.println("");//blank line
                        turnC = 1; //finish computers turn  
                        turn = 0;//start user turn
                        break; //go back to user
                    }

                    if (currentC == 54) {//first snake brings computer to 19
                        System.out.println("The computer landed on a snake on square " + currentC + "!");
                        currentC = 19;
                        System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                        System.out.println("");//blank line
                        turnC = 1; //finish computers turn  
                        turn = 0;//start user turn
                        break; //go back to user
                    }

                    if (currentC == 90) {//second snake brings computer to 48
                        System.out.println("The computer landed on a snake on square " + currentC + "!");
                        currentC = 48;
                        System.out.println("The computer rolled is now on square " + currentC); // tell user what square computer is on
                        System.out.println("");//blank line
                        turnC = 1; //finish computers turn  
                        turn = 0;//start user turn
                        break; //go back to user
                    }

                    if (currentC == 99) {//third snake brings computer to 99
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
                        System.out.println("The robots wins!");
                        System.exit(0);
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
}
