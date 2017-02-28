
/**
 * Find the dimensions of a cube. Contains the constructor for a cube.
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
public class Cube2 extends Box2 
{
    /**
     * Constructor for Cube
     */
    public Cube2(int l)
    {
        super(l, l, l);
    }
   
    public String toString()
    {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight(); 
    }
}

