/**
 * Hurricane description:
 *
 * @author:
 * @version:
 *
 */


import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Hurricanes2
{
    public static void main(String[] args)throws IOException
    {
    	//declare and initialize variables


		int arrayLength = 59;
        int [] year = new int[arrayLength];
        String [] month = new String[arrayLength];



        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            index++;
        }
        inFile.close();


		//PROCESSING - calculate and convert values
		// convert windspeed from knots to MPH
		// determine category
		// count number of each category


        //Find min, max and average for category, windspeed and pressure



        //Output - print table using printf to format the columns


        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");



        System.out.println("=====================================================================");



    }//end main()
}//end Hurricanes2
