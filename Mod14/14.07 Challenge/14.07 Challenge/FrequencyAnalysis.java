
/**
 * Write a description of class FrequencyAnalysis here.
 * 
 * @author Glen Halonen 
 * @version 02/28/17
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class FrequencyAnalysis 
{
    private static ArrayList<String> file = new ArrayList<String>();
    private static String fileS;
    //read in file
    static void readTXT() throws IOException
    {
        Scanner inFile = new Scanner( new File("Short.txt") );
        String fileS = inFile.next();
    }
    
    static void removeAndLower()
    {
        for(int i = 0; i < file.size(); i++)
        {
            boolean upper = Integer.parseInt(fileS.substring(i, i+1)) < 64 && Integer.parseInt(fileS.substring(i, i+1)) > 91;
            boolean lower = Integer.parseInt(fileS.substring(i, i+1)) < 96 && Integer.parseInt(fileS.substring(i, i+1)) > 123;
            
            if( lower || upper )    
            {
                String temp = fileS.substring(i, i+1);
                fileS.replaceAll(temp, "");
            }
        }
    }
    
    static void print()
    {
        System.out.println(fileS);
    }
    
    
}
