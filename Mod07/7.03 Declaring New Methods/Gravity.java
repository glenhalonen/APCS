
/**
 * Calculate Gravitational Force of Planets
 *
 * @author Glen Halonen
 * @version 11/22/2016
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravity
{
    // calcGravity returns an array of doubles containing teh gravity values
    //and takes two arrays of doubles as parameters for the radius values and mass
    public static double[] calcGravity(double[] radius, double[] mass)
    {
        // fill in code here
        double[] gravities = new double[radius.length];
        // The formula to calculate gravity is: GM/r2 6.67 x 10^-11
        for(int i = 0; i < radius.length; i++)
        {
            gravities[i] = ((6.67 * Math.pow(10, -17)) * mass[i]) / Math.pow(radius[i], 2);
        }
        // 6.67E-11 times the massOfPlanet divided by the radius of the planet squared
        return gravities;
    }

    // printResults will print the table to output screen
    // return type is voide because no values are returned
    public static void printResults(String[] name, double[] radius, double[] mass, double gravity[])
    {
        // fill in code here
        System.out.println("                      Planetary Data");
        System.out.println();
        System.out.println("  Planet     Radius(km)      Mass(kg)      Gravity(Gm/s^2)");
        System.out.println("--------------------------------------------------------------");
        for(int i = 0; i < name.length; i++)
        {
            System.out.printf("%10.20s %11.1f %15.7s %15.3f%n", name[i], radius[i], mass[i], gravity[i]);
        
        }
    }
      //print the gravity values to text file
    public static void printToFile(double[] gravity)throws IOException
    {
        // fill in code here
        PrintWriter outFile = new PrintWriter(new File("gravities.txt"));
        for(int i = 0; i < gravity.length; i++)
        {
            outFile.println(gravity[i]); 
        }
        outFile.close();
    }

    public static void main(String[] args)throws IOException
    {
        // Initialize variables
        String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
        double[] radii = {2439.7, 6051.9, 6378, 3402.5, 71492, 60270, 25562, 24774, 1195};
        double[] masses = {3.3022 * Math.pow(10,23), 4.8685 * Math.pow(10,24), 5.9736 * Math.pow(10,24), 6.4185 * Math.pow(10,23), 1.8986 * Math.pow(10,27), 5.6846 * Math.pow(10,26), 8.6810 * Math.pow(10,25), 1.0243 * Math.pow(10,26), 1.312 * Math.pow(10,22)};
        // or using big E notation:
        double [] mass = {3.30E23, 4.87E24, 5.97E24, 6.42E23, 1.90E27, 5.68E26, 8.68E25, 1.02E26, 1.27E22}; // See IMACS double lesson for big E notation

        // Processing
        double[] gravities = calcGravity(radii, masses);

        // Output
        printResults(names, radii, mass, gravities);
        printToFile(gravities);


    } //end main
}//end class0