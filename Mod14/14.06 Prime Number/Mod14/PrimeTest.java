
/**
 * Contains the main class that calls on the Prime Number class to get the user input and 
 * calculates all the prime numbers up to that input.
 * 
 * @author Glen  Halonen 
 * @version 02/26/17
 */
import java.util.Scanner;
public class PrimeTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to find prime's from zero to that number");
        int input = in.nextInt();
        
        PrimeNumber prime = new PrimeNumber(input);
        
        prime.getUserRange();
        
        System.out.println();
        System.out.println("Prime numbers are: ");
        prime.findPrime();
    }
}
