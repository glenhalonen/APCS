
/**
 * Contains the main method that creates objects from contructors Triangle, Equilateral, IsoscelesRight.
 * Prints out the value of dimensions. 
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
public class TestTriangles
{
    public static void main()
    {
        Triangle random = new Triangle(5, 4, 3);
        Equilateral equal = new Equilateral(52.342);
        IsoscelesRight twoEqual = new IsoscelesRight(35.3459);
        
        
        System.out.println("Trianles sides are: A = " + random.getSide1() + "  B = " + random.getSide2()
                           + "  C = " + random.getSide3());
        System.out.println("Equilateral Triangle has sides: A = " + equal.getSide1() + "  B = " +
                           equal.getSide2() + "  C = " + equal.getSide3());
        System.out.println("Isosceles Triangle has sides: A = " + twoEqual.getSide1() + "  B = " + 
                           twoEqual.getSide2() + "  C = " + twoEqual.getSide3());
    }
}
