
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creating a scanner for user input
        Scanner input = new Scanner(System.in);
        
        // ask to enter integerts
        System.out.println("Enter integers");

        // create array for two integers
        int[] array = new int[2];

        // store the two integers in the array
        for (int i = 0; i < 2; i++) {
            array[i] = input.nextInt();
        }
        
        // create integers from array
        int zero = array[0];
        int one = array[1];
        
        // interchance the values so they appear in ascending order
        if (one < zero) {
            array[0] = one;
            array[1] = zero;
        }
        
        System.out.println("These are the integers in ascending order: " + array[0] + ", " + array[1]);
        






    }
}
