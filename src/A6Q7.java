/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Here are the prime numbers up to 1000:");

        // int for non prime numbers to eliminate
        int nonprime = 0;
//        boolean prime = true; (not needed)

        // an array of integers for 1000
        int[] sieve = new int[1001];

        /// an array of digits unchanged by the sieve array
        int[] unchanged = new int[101];

        // assign every int in array with number between 1 to 1000
        for (int i = 1; i < 1001; i++) {
            sieve[i] = sieve[i - 1] + 1;
        }

        // 10 digits in array are assigned to a integer
        for (int a = 1; a < 100; a++) {
            unchanged[a] = unchanged[a - 1] + 1;
        }

        // ints 2 to a 100 
        for (int a = 2; a <= 100; a++) {
            // makes nonprime equal the multiples of the current digit and loops through the other multiples 
            for (int i = 2; i < 1001; i++) {
                nonprime = unchanged[a] * i;

                // looks through the whole array looking for nonprime, and removes it by assigning it to -1
                for (int m = 2; m < 1001; m++) {
                    if (sieve[m] == nonprime) {
                        sieve[m] = -1;

                    }
                }

            }
        }

        // runs through the whole array and pritns every prime numbers
        for (int i = 2; i < 1001; i++) {
            if (sieve[i] != -1) {
                System.out.println(sieve[i]);
            }

        }

    }
}
