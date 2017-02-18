
/**
 * Contains the constructor for Isosceles objects. Reuses code in Triangle with slight manipulation to 
 * one variable.
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
public class IsoscelesRight extends Triangle
{
    /**
     * Constructor for isosceles right triangles.
     */
    public IsoscelesRight(double side)
    {
        super(side, side, side * Math.pow(2, .5));                   
    }
}
