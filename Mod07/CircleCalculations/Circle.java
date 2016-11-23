
/**
 * Calculate cordinates of a circle.
 * 
 * @author Glen Halonen 
 * @version Friday, November 13
 */
public class Circle
{
    public static void main(String[] args)
    {
        double [] xCordinate = new double[21];
        double [] yPositive = new double[xCordinate.length];
        double [] yNegative = new double[xCordinate.length];
        
        xCordinate[0] = 1;
        for(int i = 1; i < xCordinate.length; i++)
        {
            xCordinate[i] = xCordinate[i-1] - .1; 
        }
        for(int i = 0; i < xCordinate.length; i++)
        {
            double power = 1 - Math.pow(xCordinate[i], 2);
            yPositive[i] = Math.sqrt(power);
        }
        for(int i = 0; i < xCordinate.length; i++)
        {
            yNegative[i] = -(Math.sqrt(1 - Math.pow(xCordinate[i], 2)));
        }
            
        System.out.println("Cordinates on a Circle");
        System.out.println("x           y1          x         y2");
        System.out.println("*************************************************");
        for(int i = 0; i < xCordinate.length; i++)
        {
        System.out.printf("%6.2f %9.2f %11.2f %10.2f%n", xCordinate[i], yPositive[i], xCordinate[i], yNegative[i]);
        }
    }
}
