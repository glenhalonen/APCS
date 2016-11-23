import java.util.Random;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
/**
 * Write a description of class BottleCapPrize here.
 * 
 * @author Glen Halonen 
 * @version Sunday, October 30
 */

public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
        Random randNum = new Random();
        double numberOfSubjects = 20;
        PrintWriter outFile = new PrintWriter(new File("bottles.txt"));
        
        for(int i = 1; i <= numberOfSubjects; i++)
        {
            int bottlesDrank = 0;
            int bottleCap = 0;
            while(bottleCap != 1)
            {
                bottleCap = randNum.nextInt(5) + 1;
                bottlesDrank++;
            }
            outFile.println(bottlesDrank);
        }
        outFile.close();
        
        String token = "";
        File fileName = new File("bottles.txt");
        Scanner inFile = new Scanner(fileName);
        int numBottles;
        int totalBottles = 0;
        while(inFile.hasNext())
        {
            token = inFile.next();
            numBottles = Integer.parseInt(token);
            totalBottles += numBottles;
            
        
        }
        System.out.println((double)totalBottles/numberOfSubjects);
    }
}
