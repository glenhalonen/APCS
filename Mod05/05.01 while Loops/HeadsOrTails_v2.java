
/**
 * This program models flipping a biased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author B. Jordan 
 * @version 04/01/08
 * @edited Glen Halonen
 * @date 10/20/16
 */
import java.util.Scanner;
public class HeadsOrTails_v2
{
	public static void main(String[] args)
	{
	    int heads = 0;
	    int tails = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    
	    Scanner in = new Scanner(System.in);
	    
	    System.out.println("How many times will the coin be flipped? ");
	    int flips = in.nextInt();
	    
	    while(counter <= flips)
	    {
	        
	        randNum = Math.random();
	        
	        
	        if(randNum < .8)
	        {
	            heads++;
	            
	            System.out.println("H " + randNum);
	        }
	        else
	        {
	            tails++;
	            
	            System.out.println("T " + randNum);
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Heads = " + heads);
	    System.out.println("Tails = " + tails);
	    
	    
	    
	}
}
