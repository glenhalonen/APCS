
/**
 * Contains main method for constructor Candidate6, an ArrayList of candidates, and methods to manipulate
 * outcome.
 * 
 * @author Glen Halonen 
 * @version 03/25/17
 */
import java.util.ArrayList;
public class TestCandidate6 
{
    static int sum = 0;
    public static void main(String[] args)
    {
      ArrayList<Candidate5> election = new ArrayList<Candidate5>();  
        
      election.add( new Candidate5("John Smith", 5000));
      election.add( new Candidate5("Mary Miller", 4000));
      election.add( new Candidate5("Michael Duffy", 6000));
      election.add( new Candidate5("Tim Robinson", 2500));
      election.add( new Candidate5("Joe Ashtony", 1800));
      election.add( new Candidate5("Mickey Jones", 3000));
      election.add( new Candidate5("Rebecca Morgan", 2000));
      election.add( new Candidate5("Kathleen Turner", 8000));
      election.add( new Candidate5("Tory Parker", 5000));
      election.add( new Candidate5("Ashton Davis", 10000));
      
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
      
      System.out.println("Added Joy Anderson");
      System.out.println();
      insertCandidate(election, "John Kennedy", "Joy Anderson", 2000);
      printResults(election);
      System.out.println();
    }
    
    public static void printVotes(ArrayList<Candidate5> election )
    {
        for( int i = 0; i < election.size(); i++)
        {
            System.out.print(election.get(i).toString());
        }
    }
    
    public static void getTotal(ArrayList<Candidate5> election)
    {
        
        for(int i = 0; i < election.size(); i++)
        {
            sum += election.get(i).getVotes();
        }
        
    }
    
    public static void printResults(ArrayList<Candidate5> election)
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
    
    public static void replaceName(ArrayList<Candidate5> election, String replace, String replacement)
    {
        for( int i = 0; i < election.size(); i++)
        {
            if(election.get(i).getName().equalsIgnoreCase(replace))
            {
                election.get(i).setName(replacement);
            }
        }
    }
    
    public static void replaceVotes(ArrayList<Candidate5> E, String replace, int newVotes)
    {
        for( int i = 0; i < E.size(); i++)
        {
            if(E.get(i).getName().equalsIgnoreCase(replace))
            {
                E.get(i).setVotes(newVotes);
            }
        }
    }
    
    public static void insertPosition(ArrayList<Candidate5> can, int inPosition, String name, int votes)
    {
        for(int move = can.size() - 1; move > inPosition; move--)
        {
            can.get(move).setName( can.get(move - 1).getName() );
            can.get(move).setVotes( can.get(move - 1).getVotes() );
        }
        can.get(inPosition).setName(name);
        can.get(inPosition).setVotes(votes);
    }
    
    public static void insertCandidate(ArrayList<Candidate5> can, String location, String name, int votes)
    {
        int inPosition = 0;
        for(int i = 0; i < can.size(); i++)
        {
            if(can.get(i).getName().equals(location)){
                inPosition = i;
            }
        }
        
        for(int move = can.size() - 1; move > inPosition; move--)
        {
            can.get(move).setName( can.get(move - 1).getName() );
            can.get(move).setVotes( can.get(move - 1).getVotes() );
        }
        can.get(inPosition).setName(name);
        can.get(inPosition).setVotes(votes);
    }
}
