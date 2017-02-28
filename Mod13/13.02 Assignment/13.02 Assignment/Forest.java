
/**
 * Forest inherites from Terrain to get the dimensions but has it's own method and parameter to 
 * return the number of trees.
 * 
 * @author Glen Halonen
 * @version 02/16/2017
 */
public class Forest extends Terrain
{
    private int myTrees;
    
    public Forest(int l, int w, int trees)
    {
        super( l, w);
        myTrees = trees;
    }
    
    public int getTrees()
    {
        return myTrees;
    }
    
    public String toString()
    {
        return "Forest has dimensions: " + getWidth() + " X " + getLength() + " and " + getTrees() + " trees";
    }
}
