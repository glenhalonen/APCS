
/**
 * Throw darts to estimate pie.
 * 
 * @author Glen Halonen
 * @version Wednesday, November 23
 */
import java.util.Scanner;
import java.util.Random;
public class Darts
{
    
    //number of attempts
    public static int numberOfAttempts()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of attempts: ");
        return scan.nextInt();
    }
    
    //number of trials
    public static int numberOfTrials()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of trials: ");
        return scan.nextInt();
    }
    
    //number of hits
    public static double numberOfHits(double toss)
    {   
        int hit = 0;
        for(int i = 0; i <= toss; i++)
        {
            double x = Math.random();
            double y = Math.random();
            if(Math.pow(x,2) + Math.pow(y,2) <=1)
            {
               hit++;
            }
        }
        return hit;
    }
    
    //estimate pie and print for each trial and return total
    public static double estimatePie(double trial, double attempt)
    {
        double total = 0;
        
        for(int i = 0; i < trial; i++)
        {
            double hits = numberOfHits(attempt);
            total += (hits / attempt) * 4;
            double estimate = (hits / attempt) * 4;
            System.out.print("Trial [" + i +"]: pi = "); 
            System.out.printf("%3.6f%n", estimate);
        }
        return total;
    }
    
    //printout estimate
    public static void printEstimate(double total, int trial)
    {
        double pieEstimate = total / trial;
        System.out.printf("Pi estimate: %2.6f", pieEstimate);
    }
    
    public static void main(String[] args)
    {
        int trials = numberOfTrials();
        int attempts = numberOfAttempts();
        double total = estimatePie(trials, attempts);
        printEstimate(total, trials);
    }
}
