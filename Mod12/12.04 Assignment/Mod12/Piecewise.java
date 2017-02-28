
/**
 * Contains constructor and mutator methods for PiecewiseTester class. Calculates the 
 * value of a piecewise function in terms of x.
 * 
 * @author Glen Halonen 
 * @version 2/1/2017
 */
public class Piecewise
{
    private int x;
    /**
     * Default constructor for PiecewiseTester class.
     */
    Piecewise()
    {
        
    }
    
    /**
     * Mutator method that returns the value of a piecewise function with recursion.
     * @param the value that the funtion is using to compute.
     */
    public int firstPiece(int x)
    {
        
        if(x <= 10)
        {
            return -7;
        }
        else
        {
            return firstPiece(this.x-4) + 2;
        }
    }
    
    /**
     * Mutator method that returns the value of a piecewise function with recursion.
     * @param the value that the funtion is using to compute.
     */
    public int secondPiece(int x)
    {
        if(x <= 25)
        {
            return 20;
        }
        else
        {
            return secondPiece(x/12 + 5) - 3;
        }
    }
    
    /**
     * Mutator method that returns the value of a piecewise function with recursion.
     * @param the value that the funtion is using to compute.
     */
    public int thirdPiece(int x)
    {
        if(x > 20)
        {
            return -100;
        }
        else
        {
            return thirdPiece(x * 2) - 4;
        }
    }
}
