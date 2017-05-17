
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a scanner for user input
        Scanner input = new Scanner(System.in);

        // ask how many heights will be inputed
        System.out.println("How many heights will be inputed");
        // store number of heights as a integer
        int heights = input.nextInt();

        // ask for the amount of heights
        System.out.println("Enter the heights");
        // create a list for the amount of heights 
        double[] list = new double[heights];

        // ask for each individual height
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        // use a for loop to determine the sum
        // start with an accumulator
        double sum = 0;
        // for loop to go through each number
        for (int i = 0; i < list.length; i++) {
            // add whatever number I'm on to sum
            sum = sum + list[i];
        }
        // calculate average
        double avg = sum / list.length;
        
        // output all those heights above the average
        for (int a = 0; a < heights; a ++) {
            if (list[a] > avg) {
                System.out.println("These heights are above average: " + list[a]);
                
            }
            
        }
        
            
        
    }
}
