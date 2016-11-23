

/**
 * Guess a number, see if your right.
 * 
 * @author Glen Halonen 
 * @version Sunday, October 23
 */
import java.util.Scanner;
public class GuessingGame_v2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Pick a range of numbers. ex(75 200)");
        int lower = in.nextInt();
        int upper = in.nextInt();
        double random = Math.random();
        
        
        
        int guessCount = 0;
        double yourNumber = 0;
        
        while(yourNumber != randomNumber)
        {
            System.out.print("Enter your guess:");
            yourNumber = in.nextInt();
            System.out.println();
            
            if(yourNumber > randomNumber)
            {
                System.out.println("Your guess was too high.");
           }
            else if(yourNumber < randomNumber)
            {
            System.out.println("Your guess was too low.");
           }
           else
           {
               System.out.println("Good job!\nThe random number was: " + randomNumber);
            }
           
           guessCount ++;
        }
        
        
        System.out.println("Number of guesses: " + guessCount);
        
    }
}
