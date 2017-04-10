
/**
 * Contains main method for constructor Candidate3, an array of candidates, and methods to manipulate
 * outcome.
 * 
 * @author Glen Halonen 
 * @version 03/19/17
 */
import java.util.ArrayList;
public class TestCandidate3 
{
    static int sum = 0;
    public static void main(String[] args)
    {
      Candidate3[] election = new Candidate3[10];  
        
      election[0] = new Candidate3("John Smith", 5000);
      election[1] = new Candidate3("Mary Miller", 4000);
      election[2] = new Candidate3("Michael Duffy", 6000);
      election[3] = new Candidate3("Tim Robinson", 2500);
      election[4] = new Candidate3("Joe Ashtony", 1800);
      election[5] = new Candidate3("Mickey Jones", 3000);
      election[6] = new Candidate3("Rebecca Morgan", 2000);
      election[7] = new Candidate3("Kathleen Turner", 8000);
      election[8] = new Candidate3("Tory Parker", 5000);
      election[9] = new Candidate3("Ashton Davis", 10000);
      
      printResults(election);
      System.out.println();
      System.out.println("Michael to John");
      System.out.println();
      replaceName(election, "Michael Duffy", "John Elmos");
      printResults(election);
      System.out.println();
      
      System.out.println("Mickey Reduced to 2500");
      System.out.println();
      replaceVotes(election, "Mickey Jones", 2500);
      printResults(election);
      System.out.println();
     
      System.out.println("Kathleen to John with 8500 votes");
      System.out.println();
      replaceName(election, "Kathleen Turner", "John Kennedy");
      replaceVotes(election, "John Kennedy", 8500);
      printResults(election);
    }
    
    public static void printVotes(Candidate3[] election )
    {
        for( int i = 0; i < election.length; i++)
        {
            System.out.print(election[i].toString());
        }
    }
    
    public static void getTotal(Candidate3[] election)
    {
        
        for(int i = 0; i < election.length; i++)
        {
            sum += election[i].getVotes();
        }
        
    }
    
    public static void printResults(Candidate3[] election)
    {
        sum = 0;
        getTotal(election);
        System.out.printf("%15s %27s %19s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        
        for(int i = 0; i < election.length; i++)
        {
            double percentVote = 100 * (double)election[i].getVotes() / sum;
            System.out.printf("%15s %20d %20.0f%n", election[i].getName(), 
                                                 election[i].getVotes(),
                                                 percentVote);
        }
    }
    
    public static void replaceName(Candidate3[] election, String replace, String replacement)
    {
        for( int i = 0; i < election.length; i++)
        {
            if(election[i].getName().equalsIgnoreCase(replace))
            {
                election[i].setName(replacement);
            }
        }
    }
    
    public static void replaceVotes(Candidate3[] E, String replace, int newVotes)
    {
        for( int i = 0; i < E.length; i++)
        {
            if(E[i].getName().equalsIgnoreCase(replace))
            {
                E[i].setVotes(newVotes);
            }
        }
    }
}
