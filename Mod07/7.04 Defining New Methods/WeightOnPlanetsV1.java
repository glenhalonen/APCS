
/**
 * Description for 7.04 Weight project
 *
 * @author Glen Halonen
 * @version Wednesday, November 23
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WeightOnPlanetsV1
{
    // write static methods here
    // Note: formula for finding weight on a planet:  Earth weight divided by Gravity constant times surface gravity
    //read in surface gravity from file
    public static double[] getGravity() throws IOException
    {
        File fileGravities = new File("gravities.txt");
        Scanner inFile = new Scanner(fileGravities);
        
        double[] gravity = new double[9];
        
        int i = 0;
        while(inFile.hasNext())
        {
            gravity[i] = Double.parseDouble(inFile.next());
            //System.out.println(gravity[i]);
            i++;
        }
        return gravity;
    }
    //calculate weight
    public static double[] calcWeight(double eWeight, double[] gravity)
    {
        double[] weight = new double[gravity.length];
        double mass = eWeight * 0.454;
        for(int i = 0; i < gravity.length; i++)
        {
            weight[i] = (mass * gravity[i]) / 4.448;
        }
        return weight;
    }
    //print statements
    public static void printResults(String[] name, double[] gravity, double[] weight)
    {
        System.out.println("      My Weight On the Planets     ");
        System.out.println("Planet      Gravity     Weight(lbs)");
        System.out.println("***********************************");
        for(int i = 0; i < gravity.length; i++)
        {
            System.out.printf("%-10.20s %6.2f %12.2f%n", name[i], gravity[i], weight[i]);
        }
    }
    //main
    public static void main(String[] args)throws IOException
    {

        // Extension idea... instead of hard codeing the weight, you may propt the user for input.

        double earthWeight = 100.0; // initalize Earth weight to 100 lbs.
        
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] gravity = getGravity();                            // static method you write
        double[] weight = calcWeight(earthWeight, gravity);  // static method you write
        printResults(names, gravity, weight);                   // static method you write

    } //end main
}//end class