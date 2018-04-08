/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_5;

import java.util.Scanner;

/**
 *
 * @author camet2651
 */
public class Ubbi_Dubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the word you would like translated");
        String word = input.nextLine();

        //set word to lower case
        word = word.toLowerCase();

        // find length of word
        int length = word.length();

        // set strings and integers 
        String finalWord = "";
        String newWord = "";
        int vowelCount = 0;
        int vowel = 0;

        while (true) {
                //go through each letter in the word
                for (int i = 0; i < length; i++) {

                    //is the character at poistion i, is it a vowel
                    if (word.charAt(i) == 'a'
                            || word.charAt(i) == 'e'
                            || word.charAt(i) == 'i'
                            || word.charAt(i) == 'o'
                            || word.charAt(i) == 'u') {

                        char letter = word.charAt(i); // save letter

                        String str = Character.toString(letter); // make letter a string

                        newWord = "ub" + str; // add ub to the vowel

                        vowelCount++; // show that there was a vowel

                        if (vowel == 1) { // if there was previously a vowel
                            letter = word.charAt(i); // save letter
                            str = Character.toString(letter); // make it a string
                            newWord = str;
                            //debugging   System.out.println("there was a vowel before " + letter);             
                            //subtract from ub and vowel count
                            vowelCount--;
                        }
                        vowel = 1;

                        //debug     System.out.println("there was not a vowel before " + letter);
                    } else {
                        char letter = word.charAt(i);
                        String str = Character.toString(letter);
                        newWord = str;
                        vowel = 0;
                        //debugging  System.out.println("there was not a vowel before " + letter);
                    }

                    finalWord = finalWord + newWord;
                    //checking System.out.println(finalWord);

                    // each vowel has a ub added, so find  how long the word should be when it is done 
                    if (finalWord.length() == (word.length() + (vowelCount * 2))) {
                        System.out.println("Your word in Ubbi Dubbi is " + finalWord);
                        System.exit(0);
                    }
                }
            }
        }
    }

