
/**
 * Contains method to get user input, find the prime numbers, and prints them to the screen. 
 * 
 * @author Glen Halonen
 * @version 02/26/17
 */
import java.util.ArrayList;
import java.util.Scanner;
public class PrimeNumber
{
    public static ArrayList<Integer> prospects = new ArrayList<Integer>();
    public static Scanner in = new Scanner(System.in);
    private int userNum;
    
    public PrimeNumber(int userNum)
    {
        this.userNum = userNum;
    }
    
    public void getUserRange()
    {
        for(int i = 0; i < this.userNum; i++)
        {
            prospects.add(i);
        }
    }
    
    public void findPrime()
    {
        int numberOfPrimes = 0;
        for(Integer p: prospects)
        {
            int prime = 0;
            for(int i = 0; i <= 0.5 * p; i++)
            {
                if( (p % (i + 1)) == 0)
                {
                    prime++;
                }
            }
            
            if(prime < 2 && p != 0)
            {
                System.out.println(p);
                numberOfPrimes ++;
            }
        }
        System.out.println("The number of primes are: \n" + numberOfPrimes);
    }
}
