/**
 * box demo.
 * 
 * 
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box2 extends Rectangle2
{
    // instance variables 
    private int height;

    /**
     * Constructor for objects of class box
     */
    public Box2(int l, int w, int h)
    {
        // call superclass
        super(l, w);
        // initialise instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
    
    public String equals( Box2 x)
    {
        if( ( getWidth() == x.getWidth() ) && ( getLength() == x.getLength() ) && ( getHeight() == x.getHeight() ))
        {
            return " is the same size as ";
        }
        else
        {
            return " is not the same size as ";
        }
    }
}
