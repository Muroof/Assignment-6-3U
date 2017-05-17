
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creating a scanner for user input
        Scanner input = new Scanner(System.in);



        // ask for amount of marks the user wishes to input
        System.out.println("How many marks do you wish to sort?");

        // store number of marks as an integer
        int marks = input.nextInt();

        System.out.println("Enter the Marks");
        // create a list for the amount of marks 
        int[] array = new int[marks];
        // ask for each individual mark
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int swap = 0;



        // runs through the array allowing each integer through the loop
        for (int i = 0; i < array.length; i++) {


            for (int a = 1; a < array.length; a++) {

                if (array[a] < array[a - 1]) {
                    swap = array[a];

                    array[a] = array[a - 1];
                    array[a - 1] = swap;
                }

            }


        }
        // space
        System.out.println("");
        // output sorted numbers
        System.out.println("Here are the sorted numbers:");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + ",");
        }
        // space
        System.out.println("");

        // if the amount of marks is odd, subtract 1 from the total amount of marks and then divide by 2 to get the Median
        if (marks % 2 == 1) {
            marks = (marks - 1) / 2;
            System.out.println("The Median is:" + array[marks]);

        // if the amount of marks is even, simply divide by 2 to get the median    
        } 
        else {
            double median = 0;
            median = ((double) array[array.length /2] + (double) array[array.length /2 - 1]) /2;
            System.out.println("The Median is:" + median);
        }
            
            
        




    }
}
