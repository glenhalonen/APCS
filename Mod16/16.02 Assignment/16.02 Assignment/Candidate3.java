
/**
 * Contains the contructor for objects of Candidate3 along with typical getters, setters, and a toString
 * method.
 * 
 * @author Glen Halonen 
 * @version March 19, 2017
 */
public class Candidate3
{
    private String name;
    private int numVotes;
    
    public Candidate3( String name, int numVotes)
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
