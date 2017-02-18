
/**
 * Main class for Fibonacci. Runs a while loop to calculate a Fibonacci number as many times
 * as the user wishes. Call on calcFibonacci method in Fibonacci.
 * 
 * @author Glen Halonen
 * @version 02/04/2017
 */
import java.util.Scanner;
public class FibonacciTester
{
    public static void main(String[] args)
    {
        Fibonacci fibonacci = new Fibonacci(); 
        Scanner in = new Scanner(System.in);
       
        System.out.println("Calculate Fibonacci Number");
        System.out.println("Please do not enter a number greater than 45");
        System.out.println();
        
        String exit = "C";
        
        while(!exit.equalsIgnoreCase("E"))                    
        {
            System.out.print("Please enter an integer: ");
            int userInput = in.nextInt();
            
            if(userInput > 45)
            {
                System.out.println("Your number has been changed to 45");
                userInput = 45;
            }
            
            System.out.print("The Fibonacci number is: ");
            System.out.println(fibonacci.calcFibonacci(userInput));
            System.out.println();
            
            System.out.println("Enter \"E\" to exit.");
            System.out.print("Enter any other charactor to continue: ");
            exit = in.next();
            System.out.println();
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Program terminated");
    }
}
