
/**
 * Contains constructor Triangle. Contains methods that return the dimensions of the triangle.
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
public class Triangle
{
    private double mySide1, mySide2, mySide3;
    
    /**
     * Constructor for triangle
     */
    public Triangle(double side1, double side2, double side3)
    {
        mySide1 = side1;
        mySide2 = side2;
        mySide3 = side3;
    }
    
    /**
     * Getter method for side1
     */
    public double getSide1()
    {
        return mySide1;
    }
    
    /**
     * Getter method for side2
     */
    public double getSide2()
    {
        return mySide2;
    }
    
    /**
     * Getter method for side3
     */
    public double getSide3()
    {
        return mySide3;
    }
}
