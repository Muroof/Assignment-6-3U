
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creating a scanner for user input
        Scanner input = new Scanner(System.in);

        // ask how many students are in the class
        System.out.println("How many students are in the class:");
        // store number of students as a integer
        int students = input.nextInt();

        // ask for the marks of the students
        System.out.println("Enter the marks");
        // create a list for the marks of the students
        double[] marks = new double[students];

        // ask for a mark for each student
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        // use a for loop to determine the sum
        // start with an accumulator
        double sum = 0;
        // for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            // add whatever number I'm on to sum
            sum = sum + marks[i];
        }


        // calculate average
        double avg = sum / marks.length;
        System.out.println("The average is:" + avg);


    }
}
