
/**
 * Contains main method which printouts which type each object is and common information about 
 * the center of the circle.
 * 
 * @author Glen Halonen 
 * @version Saturday, February 18th
 */
import java.util.ArrayList;
public class TestPoly2
{
    public static void main(String[] args)
    {
        ArrayList<Circle2> shapes = new ArrayList<Circle2>();
        
        shapes.add( new Circle2( 1, 2, 3)               );
        shapes.add( new Cylinder2( 1, 2, 3, 4)          );
        shapes.add( new Oval2( 4, 5, 6, 3)              );
        shapes.add( new OvalCylinder2( 7, 8, 9, 10, 4)  );
        
        for( Circle2 c: shapes)
        {
            System.out.println("For " + c.toString() + " " + showCenter(c));
        }
    }
    
    static String showCenter(Circle2 c)
    {
        return c.center();
    }
}
