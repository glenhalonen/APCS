
/**
 * Analyze Information On the Chances of Boy(s) and/or Girl(s)
 * 
 * @author Glen Halonen 
 * @version Sunday, October 23
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
    public static void main(String[] args) throws IOException
    {
        String token = "";
        File fileName = new File("MaleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);
        
        double counterBB = 0;
        double counterGB = 0;
        double counterGG = 0;
        int counterSize = 0;
        while (inFile.hasNext())
        {
            token = inFile.next( );
            System.out.println(token);
            if (token.equalsIgnoreCase("BB"))
            {
                counterBB++;
            }
            else if (token.equalsIgnoreCase("GG"))
            {
                counterGG++;
            }
            else
            {
                counterGB++;
            }
            
            counterSize++;
        }
        inFile.close();
        
        System.out.println("Sample Size: " + counterSize);
        System.out.println("Two Boys : " + counterBB + "          Percent: " + counterBB/counterSize);
        System.out.println("One Boy One Girl : " + counterGB + "  Percent: " + counterGB/counterSize);
        System.out.println("Two Girls: " + counterGG + "          Percent: " + counterGG/counterSize);
    }
}
