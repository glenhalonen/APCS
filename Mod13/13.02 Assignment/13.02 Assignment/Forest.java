
/**
 * Write a description of class Forest here.
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
