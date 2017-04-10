
/**
 * Class Candidate contains constructor for objects of type Candidate along with multiple
 * getter and setter methods. Includes a toString method.
 * 
 * @author Glen Halonen 
 * @version March 19, 2017
 */
public class Candidate
{
    private String name;
    private int numVotes;
    
    public Candidate( String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getVotes()
    {
        return numVotes;
    }
    
    public String toString()
    {
        System.out.println("Name: " + name + " Votes: " + numVotes);
        return "";
    }
}
