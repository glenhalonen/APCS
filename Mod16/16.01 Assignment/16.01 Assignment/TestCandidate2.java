
/**
 * Initializes multiple objects in a list of type Candidate2. Contains methods to print results.
 * 
 * @author Glen Halonen 
 * @version 03/19/17
 */
import java.util.ArrayList;
public class TestCandidate2 
{
    static ArrayList<Candidate2> election = new ArrayList<Candidate2>();
    static int sum = 0;
    public static void main(String[] args)
    {
      election.add( new Candidate2("John Smith   ", 5000)    );
      election.add( new Candidate2("Mary Miller  ", 4000)   );
      election.add( new Candidate2("Michael Duffy", 6000) );
      election.add( new Candidate2("Tim Robinson ", 2500)  );
      election.add( new Candidate2("Joe Ashtony  ", 1800)   );
      
      printVotes();
      getTotal();
      printResults();
      
    }
    
    public static void printVotes()
    {
        for( int i = 0; i < election.size(); i++)
        {
            System.out.print(election.get(i).toString());
        }
    }
    
    public static void getTotal()
    {
        
        for(int i = 0; i < election.size(); i++)
        {
            sum += election.get(i).getVotes();
        }
        System.out.println();
        System.out.println("Total Votes: " + sum);
        System.out.println();
    }
    
    public static void printResults()
    {
        System.out.printf("%s %24s %20s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        
        for(int i = 0; i < election.size(); i++)
        {
            double percentVote = 100 * (double)election.get(i).getVotes() / sum;
            System.out.printf("%s %20d %20.2f%n", election.get(i).getName(), 
                                                 election.get(i).getVotes(),
                                                 percentVote);
        }
    }
}
