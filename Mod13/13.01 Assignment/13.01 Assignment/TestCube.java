
/**
 * Contins main method which creates two objects from contructors Cube (in class Cube) and 
 * Rectangle (in class Rectangle). Prints dimensions to screen. 
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
public class TestCube
{
    public static void main(String[] args)
    {
        Cube same = new Cube(4);
        Rectangle rect = new Rectangle(2, 4);
        
        System.out.println("One's dimensions are: " +
                            rect.getLength() + " x " + rect.getWidth());
        System.out.println();
        System.out.println("Cube's dimensions are: " + 
                           same.getLength() + " x " + same.getWidth() + " x " + same.getHeight());
    }
}
