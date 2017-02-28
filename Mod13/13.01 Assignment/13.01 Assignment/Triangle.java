
/**
 * Contains constructor Triangle. Contains methods that return the dimensions of the triangle.
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
public class Triangle
{
    private double side1, side2, side3;
    
    /**
     * Constructor for triangle
     */
    public Triangle(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    /**
     * Getter method for side1
     */
    public double getSide1()
    {
        return this.side1;
    }
    
    /**
     * Getter method for side2
     */
    public double getSide2()
    {
        return this.side2;
    }
    
    /**
     * Getter method for side3
     */
    public double getSide3()
    {
        return this.side3;
    }
}
