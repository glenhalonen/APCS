/**
 * rectangle Demo.
 * 
 * �FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Rectangle2
{
    // instance variables 
    private int length;
    private int width;

    /**
     * Constructor for objects of class rectangle
     */
    public Rectangle2(int l, int w)
    {
        // initialise instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public String toString()
    {
        return "Rectangle - " + getLength() + " X " + getWidth();
    }
       
    public String equals( Rectangle2 x, Rectangle2 y)
    {
        if(x.getWidth() == y.getWidth() && x.getLength() == y.getLength())
        {
            return " is the same size as ";
        }
        else
        {
            return " is not the same size as ";
        }
    }
}
