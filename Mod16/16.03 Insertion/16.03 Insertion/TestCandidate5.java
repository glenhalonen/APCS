
/**
 * Contains main method for constructor Candidate3, an array of candidates, and methods to manipulate
 * outcome.
 * 
 * @author Glen Halonen 
 * @version 03/25/17
 */
import java.util.ArrayList;
public class TestCandidate5 
{
    static int sum = 0;
    public static void main(String[] args)
    {
      Candidate5[] election = new Candidate5[10];  
        
      election[0] = new Candidate5("John Smith", 5000);
      election[1] = new Candidate5("Mary Miller", 4000);
      election[2] = new Candidate5("Michael Duffy", 6000);
      election[3] = new Candidate5("Tim Robinson", 2500);
      election[4] = new Candidate5("Joe Ashtony", 1800);
      election[5] = new Candidate5("Mickey Jones", 3000);
      election[6] = new Candidate5("Rebecca Morgan", 2000);
      election[7] = new Candidate5("Kathleen Turner", 8000);
      election[8] = new Candidate5("Tory Parker", 5000);
      election[9] = new Candidate5("Ashton Davis", 10000);
      
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
      System.out.println();
      
      System.out.println("Position 5 will be Woody");
      System.out.println();
      insertPosition(election, 4, "Woody Pride", 19300);
      printResults(election);
      System.out.println();
      
      System.out.println("Added Joy Anderso");
      System.out.println();
      insertCandidate(election, "John Kennedy", "Joy Anderson", 2000);
      printResults(election);
      System.out.println();
    }
    
    public static void printVotes(Candidate5[] election )
    {
        for( int i = 0; i < election.length; i++)
        {
            System.out.print(election[i].toString());
        }
    }
    
    public static void getTotal(Candidate5[] election)
    {
        
        for(int i = 0; i < election.length; i++)
        {
            sum += election[i].getVotes();
        }
        
    }
    
    public static void printResults(Candidate5[] election)
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
    
    public static void replaceName(Candidate5[] election, String replace, String replacement)
    {
        for( int i = 0; i < election.length; i++)
        {
            if(election[i].getName().equalsIgnoreCase(replace))
            {
                election[i].setName(replacement);
            }
        }
    }
    
    public static void replaceVotes(Candidate5[] E, String replace, int newVotes)
    {
        for( int i = 0; i < E.length; i++)
        {
            if(E[i].getName().equalsIgnoreCase(replace))
            {
                E[i].setVotes(newVotes);
            }
        }
    }
    
    public static void insertPosition(Candidate5[] can, int inPosition, String name, int votes)
    {
        for(int move = can.length - 1; move > inPosition; move--)
        {
            can[move].setName( can[move - 1].getName() );
            can[move].setVotes( can[move - 1].getVotes() );
        }
        can[inPosition].setName(name);
        can[inPosition].setVotes(votes);
    }
    
    public static void insertCandidate(Candidate5[] can, String location, String name, int votes)
    {
        int inPosition = 0;
        for(int i = 0; i < can.length; i++)
        {
            if(can[i].getName().equals(location)){
                inPosition = i;
            }
        }
        
        for(int move = can.length - 1; move > inPosition; move--)
        {
            can[move].setName( can[move - 1].getName() );
            can[move].setVotes( can[move - 1].getVotes() );
        }
        can[inPosition].setName(name);
        can[inPosition].setVotes(votes);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}