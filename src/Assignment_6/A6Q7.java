/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_6;

/**
 *
 * @author camet2651
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[999];//make an array with 1000 integers
        boolean[] arrayfinal = new boolean[999];//make a second array with 1000 integers

        for (int i = 0; i < array.length; i++) {//populate array
            array[i] = i;
        }

        for (int i = 0; i < arrayfinal.length; i++) {//populate array as all being prime
            arrayfinal[i] = true;
        }

        arrayfinal[0] = false; //0 is not prime
        arrayfinal[1] = false; //1 is not prime

        int p = 2;//first prime number is 2

        int factor = 2;//start multiplying each prime by 2 

        int count = 1;//include 2 as a prime


        while (true) {

            while (factor * p <= 998) {//find all prime multiples up to 1000 and set them as false
                arrayfinal[factor * p] = false;
                factor++;
            }

            for (int i = (p + 1); i < 999; i++) {//find next prime
                if (arrayfinal[i] == true) { //if number hasn't been marked false yet it is prime
                    p = i;
                    factor = 2;
                    System.out.println(p + " is prime");//print out prime number
                    count++;
                    break;
                }

                if (arrayfinal[i] == false) {
                    if (array[i] == 998) {//if i is the last number print out number of primes and quit program
                        System.out.println("There are " + count + " prime numbers");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
