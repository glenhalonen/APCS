
/**
 * See if the numbers entered are winners.
 * 
 * @author Glen Halonen
 * @version 10/24/2016
 */
import java.util.Scanner;
public class Lottery
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       
       
       String userGuess = "";
       String lotteryNum = "";
      
       int x;
       String lotterySt = String.valueOf((int)(1000 * Math.random()));
       
       for( x = 0 ; x < 3 ; x++)
       {
           char lotteryChar = lotterySt.charAt(x);
           lotteryNum += lotteryChar;
        } 
        
       System.out.print("Enter your three numbers. (ex. 123) ");
       userGuess = in.next();
       
       String match = "";
       
       //if your number matches front two u win
       if(userGuess.substring(0,2).equals(lotteryNum.substring(0,2)))
       {
           match = "Good job, front pair matched.";
        }
        else if (userGuess.substring(1,3).equals(lotteryNum.substring(1,3)))
        {
             match = "Good job, last pair matched.";
        }
        else if(userGuess.equals(lotteryNum))
        {
             match = "Good job, both pairs matched.";
        }
        else
        {
             match = "Sorry, neither pair matched";
        }
        
        System.out.println("Winner: " + lotteryNum);
        System.out.println(match);
   }
}
