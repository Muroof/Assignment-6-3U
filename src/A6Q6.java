
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input
        Scanner input = new Scanner(System.in);

        // ask for amount of students in the class
        System.out.println("How many students are in the class:");

        // store number of marks as an integer
        int students = input.nextInt();

        System.out.println("Enter the Marks for the students:");
        // create a list for the amount of marks 
        int[] array = new int[students];
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
        // giving the average value a variable
        double average = 0;
        
        for (int a = 0; a < students; a++) {
            average = average + array[a];
           
        }
        average = average / students;
        
        
        
        System.out.println("The lowest mark is a  " + array[0]);
        System.out.println("The highest mark is a" + array[students - 1]);   
        
        System.out.println("The average is " + average);
        
    }
}
