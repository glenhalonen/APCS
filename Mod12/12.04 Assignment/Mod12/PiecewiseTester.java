
/**
 * Contains the main method for the Piecewise class and method calls with parameters. Prints 
 * values to the screen for the x value entered.
 * 
 * @author Glen Halonen 
 * @version 2/1/2017
 */
public class PiecewiseTester
{
    public static void main(String[] args)
    {
        Piecewise function = new Piecewise();
        System.out.println("Answer to problem 1:");
        System.out.println(function.firstPiece(25));
        System.out.println("Answer to problem 2:");
        System.out.println(function.secondPiece(30));
        System.out.println("Answer to problem 4:");
        System.out.println(function.thirdPiece(500));
    }
}
