
/**
 * Roll an eleven sided Dice, find the probability of getting a particular sum.
 * 
 * @author Glen Halonen 
 * @version 10/28/2016
 */
import java.util.Random;
import java.util.Scanner;
public class DiceProbability
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);
     System.out.println("enter num");
     double userNum = in.nextInt();
     int rollOne = 0;
     int rollTwo = 0;
     int sum = 0;
     int[] probSum;
     probSum = new int[23];
     
     
     Random randNum = new Random();
     //roll two dice twice, print out numbers
     for (int n = 0; n < userNum; n++)
     {
         rollOne = randNum.nextInt(11) + 1;
         rollTwo = randNum.nextInt(11) + 1;
         
         sum = rollOne + rollTwo;
         int x = probSum[sum];
         x++;
         probSum[sum] = x;
         
        
     }
      for(int i = 2; i < 23 ; i++){
       System.out.println(i + "s: " + (probSum[i]/userNum) * 100 );
       }
                                
    }
}
