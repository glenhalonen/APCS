
/**
 * Contains main method for class Candidate4, an array of candidates, and methods to manipulate
 * outcome.
 * 
 * @author Glen Halonen 
 * @version 03/19/17
 */
import java.util.ArrayList;
public class TestCandidate4 
{
    static int sum = 0;
    public static void main(String[] args)
    {
      ArrayList<Candidate4> election = new ArrayList<Candidate4>();  
        
      election.add( new Candidate4("John Smith", 5000));
      election.add( new Candidate4("Mary Miller", 4000));
      election.add( new Candidate4("Michael Duffy", 6000));
      election.add( new Candidate4("Tim Robinson", 2500));
      election.add( new Candidate4("Joe Ashtony", 1800));
      election.add( new Candidate4("Mickey Jones", 3000));
      election.add( new Candidate4("Rebecca Morgan", 2000));
      election.add( new Candidate4("Kathleen Turner", 8000));
      election.add( new Candidate4("Tory Parker", 5000));
      election.add( new Candidate4("Ashton Davis", 10000));
      
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
    
    public static void printVotes(ArrayList<Candidate4> election )
    {
        for( int i = 0; i < election.size(); i++)
        {
            System.out.print(election.get(i).toString());
        }
    }
    
    public static void getTotal(ArrayList<Candidate4> election)
    {
        
        for(int i = 0; i < election.size(); i++)
        {
            sum += election.get(i).getVotes();
        }
        
    }
    
    public static void printResults(ArrayList<Candidate4> election)
    {
        sum = 0;
        getTotal(election);
        System.out.printf("%15s %27s %19s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        
        for(int i = 0; i < election.size(); i++)
        {
            double percentVote = 100 * (double)election.get(i).getVotes() / sum;
            System.out.printf("%15s %20d %20.0f%n", election.get(i).getName(), 
                                                 election.get(i).getVotes(),
                                                 percentVote);
        }
    }
    
    public static void replaceName(ArrayList<Candidate4> election, String replace, String replacement)
    {
        for( int i = 0; i < election.size(); i++)
        {
            if(election.get(i).getName().equalsIgnoreCase(replace))
            {
                election.get(i).setName(replacement);
            }
        }
    }
    
    public static void replaceVotes(ArrayList<Candidate4> E, String replace, int newVotes)
    {
        for( int i = 0; i < E.size(); i++)
        {
            if(E.get(i).getName().equalsIgnoreCase(replace))
            {
                E.get(i).setVotes(newVotes);
            }
        }
    }
}