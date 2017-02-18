
/**
 * Main class for methods and constructor in RecursivePalindrome. Loop that asks the user for 
 * input than tell the user if the phrase or word that they entered is a Palindrome.
 * 
 * @author Glen Halonen 
 * @version Tuesday, February 7th
 */
import java.util.Scanner;
public class RecursivePalindromeTester
{
    public static void main(String[] args)
    {
        int oneOrZero;
        
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        RecursivePalindrome palin = new RecursivePalindrome();
        
        //start loop to tell each one is a palindrome or not
        
        String readyForAction = "";
        String exit = "";
        while(!exit.equalsIgnoreCase("E"))
        {
            System.out.println("Input a word or phrase:");
            String phrase = in.nextLine();
            
            readyForAction = palin.manipulate(phrase);
            
            oneOrZero = palin.isPalindrome(readyForAction);
            if(oneOrZero == 1)
            {
                 System.out.println("PALINDROME!");
            }
            else
            {
                System.out.println("Not a palindrome.");
                System.out.println();
            }
            
            System.out.println("Not a palindrome.");
            
            System.out.println("Enter \"E\" to exit.");
            System.out.print("Enter any other charactor to continue: ");
            exit = in2.next();
            System.out.println();
            System.out.println();
        }
        System.out.println("Program has been terminated");
    }
}
