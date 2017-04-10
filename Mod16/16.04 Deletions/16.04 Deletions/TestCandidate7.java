

/**
 * Contains main method for constructor Candidate7, an array of candidates, and methods to manipulate
 * outcome.
 * 
 * @author Glen Halonen 
 * @version 03/25/17
 */
import java.util.ArrayList;
public class TestCandidate7 
{
    static int sum = 0;
    public static void main(String[] args)
    {
      Candidate7[] election = new Candidate7[10];  
        
      election[0] = new Candidate7("John Smith", 5000);
      election[1] = new Candidate7("Mary Miller", 4000);
      election[2] = new Candidate7("Michael Duffy", 6000);
      election[3] = new Candidate7("Tim Robinson", 2500);
      election[4] = new Candidate7("Joe Ashtony", 1800);
      election[5] = new Candidate7("Mickey Jones", 3000);
      election[6] = new Candidate7("Rebecca Morgan", 2000);
      election[7] = new Candidate7("Kathleen Turner", 8000);
      election[8] = new Candidate7("Tory Parker", 5000);
      election[9] = new Candidate7("Ashton Davis", 10000);
      
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
      
      System.out.println("DELETE AT 6");
      System.out.println();
      deleteByLoc(election, 5);
      printResults(election);
      System.out.println();
      
      System.out.println("DELETE Rebecca Morgan");
      System.out.println();
      deleteByName(election, "Rebecca Morgan");
      printResults(election);
      System.out.println();
      
    }
    
    public static void printVotes(Candidate7[] election )
    {
        for( int i = 0; i < election.length; i++)
        {
            System.out.print(election[i].toString());
        }
    }
    
    public static void getTotal(Candidate7[] election)
    {
        
        for(int i = 0; i < election.length; i++)
        {
            if(election[i] != null)
            {
                sum += election[i].getVotes();
            }
        }
        
    }
    
    public static void printResults(Candidate7[] election)
    {
        sum = 0;
        getTotal(election);
        System.out.printf("%15s %27s %19s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        
        for(int i = 0; i < election.length; i++)
        {
            if( election[i] != null )
            {
                double percentVote = 100 * (double)election[i].getVotes() / sum;
                System.out.printf("%15s %20d %20.0f%n", election[i].getName(), 
                                                     election[i].getVotes(),
                                                     percentVote);
            }
        }
        System.out.println();
        System.out.println("Election total: " + sum);
        System.out.println();
    }
    
    public static void replaceName(Candidate7[] election, String replace, String replacement)
    {
        for( int i = 0; i < election.length; i++)
        {
            if(election[i].getName().equalsIgnoreCase(replace))
            {
                election[i].setName(replacement);
            }
        }
    }
    
    public static void replaceVotes(Candidate7[] E, String replace, int newVotes)
    {
        for( int i = 0; i < E.length; i++)
        {
            if(E[i].getName().equalsIgnoreCase(replace))
            {
                E[i].setVotes(newVotes);
            }
        }
    }
    
    public static void insertPosition(Candidate7[] can, int inPosition, String name, int votes)
    {
        for(int move = can.length - 1; move > inPosition; move--)
        {
            can[move].setName( can[move - 1].getName() );
            can[move].setVotes( can[move - 1].getVotes() );
        }
        can[inPosition].setName(name);
        can[inPosition].setVotes(votes);
    }
    
    public static void insertCandidate(Candidate7[] can, String location, String name, int votes)
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
    
    public static void deleteByLoc(Candidate7[] can, int location)
    {
        for( int i = location; i < can.length - 1; i++)
        {
            can[i] = can[i + 1];
        }
        can[can.length - 1] = null;
    }
    
    public static void deleteByName(Candidate7[] can, String name)
    {
        int location = 0;
        for( int i = 0; i < can.length - 1; i++)
        {
            if(can[i].getName().equals(name))
            {
                location = i;
            }
        }
        
        for( int i = location; i < can.length - 1; i++)
        {
            can[i] = can[i + 1];
        }
        can[can.length - 1] = null;
    }
}
