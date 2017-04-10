
/**
 * Contains the contructor for objects of Candidate5 along with typical getters, setters, and a toString
 * method.
 * 
 * @author Glen Halonen 
 * @version March 25, 2017
 */
public class Candidate5
{
    private String name;
    private int numVotes;
    
    public Candidate5( String name, int numVotes)
    {
        this.name = name;
        this.numVotes = numVotes;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name2)
    {
        name = name2;
    }
    
    public int getVotes()
    {
        return numVotes;
    }
    
    public void setVotes(int v)
    {
        numVotes = v;
    }
    
    public String toString()
    {
        System.out.println("Name: " + name + " Votes: " + numVotes);
        return "";
    }
}
