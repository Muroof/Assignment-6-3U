
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ranam3235
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // creating a scanner for user input
        Scanner input = new Scanner(System.in);

        // input 10 marks
        System.out.println("Enter 10 marks you wish to sort");

        // create array for 10 entries
        int[] array = new int[10];
        
        int swap = 0;

        // store the ten integers in the array
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        
        // runs through the array allowing each integer through the loop
        for (int i = 0; i < 10; i++) {
            
            for (int a = 1; a < 10 - 1; a++){
                
                if (array[a] < array[a - 1]) {
                    swap = array[a];
                    
                    array[a] = array[a - 1];
                    array[a - 1] = swap;
                }
                
            }
            
            
        }
        System.out.println("");
        System.out.println("Here are the sorted numbers:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i] + ",");
        }
        


    }
}
