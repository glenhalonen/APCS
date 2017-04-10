
/**
 * Initializes multiple objects in a list of type Candidate. Contains methods to print results.
 * 
 * @author Glen Halonen 
 * @version 03/19/17
 */
import java.util.ArrayList;
public class TestCandidate 
{
    static Candidate[] election = new Candidate[5];
    static int sum = 0;
    public static void main(String[] args)
    {
      election[0] = new Candidate("John Smith   ", 5000);
      election[1] = new Candidate("Mary Miller  ", 4000);
      election[2] = new Candidate("Michael Duffy", 6000);
      election[3] = new Candidate("Tim Robinson ", 2500);
      election[4] = new Candidate("Joe Ashtony  ", 1800);
      
      printVotes();
      getTotal();
      printResults();
      
    }
    
    public static void printVotes()
    {
        for( int i = 0; i < election.length; i++)
        {
            System.out.print(election[i].toString());
        }
    }
    
    public static void getTotal()
    {
        
        for(int i = 0; i < election.length; i++)
        {
            sum += election[i].getVotes();
        }
        System.out.println();
        System.out.println("Total Votes: " + sum);
        System.out.println();
    }
    
    public static void printResults()
    {
        System.out.printf("%s %24s %20s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        
        for(int i = 0; i < election.length; i++)
        {
            double percentVote = 100 * (double)election[i].getVotes() / sum;
            System.out.printf("%s %20d %20.2f%n", election[i].getName(), 
                                                 election[i].getVotes(),
                                                 percentVote);
        }
    }
}
