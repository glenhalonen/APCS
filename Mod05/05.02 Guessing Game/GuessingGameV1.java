
/**
 * Guess a number, see if your right.
 * 
 * @author Glen Halonen 
 * @version Sunday, October 23
 */
import java.util.Scanner;
public class GuessingGameV1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int randomNumber = (int) (100 * Math.random());
        int guessCount = 0;
        int yourNumber = 0;
        
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
