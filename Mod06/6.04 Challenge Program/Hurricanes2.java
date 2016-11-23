/**
 * Hurricane description: Find category of hurricanes along with average. 
 * Print to screen in user friendly format.
 *
 * @author: Glen Halonen
 * @version: Sunday, November 13
 *
 */

import java.io.PrintWriter;
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
        int [] pressure = new int[arrayLength];
        int [] knots = new int[arrayLength];
        String [] name = new String[arrayLength];


        File fileName = new File("hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //INPUT  - read data in from the file
        int index = 0;
        while (inFile.hasNext())
        {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            knots[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        inFile.close();


        //PROCESSING - calculate and convert values
        // convert windspeed from knots to MPH
        int [] mph = new int[arrayLength];
        for(int i = 0; i < knots.length; i++)
        {
            mph[i] = (int)(knots[i] * 1.151);
        }
        // determine cate(gory
        
        int category1 = 0;
        int category2 = 0;
        int category3 = 0;
        int category4 = 0;
        int category5 = 0;
        int [] category = new int[arrayLength];
        for(int i = 0; i < mph.length; i++)
        {
            if(mph[i] >= 74 && mph[i] <= 95)
            {
                category[i] = 1;
                category1++;
            }
            else if(mph[i] >= 96 && mph[i] <= 110)
            {
                category[i] = 2;
                category2++;
            }
            else if(mph[i] >= 111 && mph[i] <= 130)
            {
                category[i] = 3;
                category3++;
            }
            else if(mph[i] >= 131 && mph[i] <= 155)
            {
                category[i] = 4;
                category4++;
            }
            else if(mph[i] >= 155)
            {
                category[i] = 5;
                category5++;
            }
        }
        // count number of each category
        

        //Find min, max and average for category, windspeed and pressure
       int maxCategory = Integer.MIN_VALUE;
       int minCategory = Integer.MAX_VALUE;
       int categorySum = 0;
       for(int i = 0; i < category.length; i++)
       {
           categorySum += category[i];
           if(maxCategory < category[i])
           {
               maxCategory = category[i];
           }
           if(minCategory > category[i])
           {
               minCategory = category[i];
           }
       }
       int avgCategory = categorySum/category.length;
       
       int maxMph = Integer.MIN_VALUE;
       int minMph = Integer.MAX_VALUE;
       int mphSum = 0;
       for(int i = 0; i < category.length; i++)
       {
           mphSum += mph[i];
           if(maxMph < mph[i])
           {
               maxMph = mph[i];
           }
           if(minMph > mph[i])
           {
               minMph = mph[i];
           }
       }
       
       int avgMph = mphSum/mph.length;
       
       int maxPressure = Integer.MIN_VALUE;
       int minPressure = Integer.MAX_VALUE;
       int pressureSum = 0;
       for(int i = 0; i < category.length; i++)
       {
           pressureSum += category[i];
           if(maxPressure < pressure[i])
           {
               maxPressure = pressure[i];
           }
           if(minPressure > pressure[i])
           {
               minPressure = pressure[i];
           }
       }
       
       int avgPressure = pressureSum/pressure.length;
       
        //Output - print table using printf to format the columns


        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        
        for(int i = 0; i < arrayLength; i++)
        {
            System.out.printf(" %2.4s %10.12s %10.1s %13.4s %20.4s%n", year[i], name[i], category[i], pressure[i], mph[i]);
        }

        System.out.println("=====================================================================");

        System.out.println("Average                   " + avgCategory + "             " + avgPressure + "                  " + avgMph);
        System.out.println("Maximum                   " + maxCategory + "          " + maxPressure + "                  " + maxMph);
        System.out.println("Minimum                   " + minCategory + "           " + minPressure + "                   " + minMph);
        
        System.out.println();
        System.out.println();
        
        System.out.println("Number of Category 1: " + category1);
        System.out.println("Number of Category 2: " + category2);
        System.out.println("Number of Category 3: " + category3);
        System.out.println("Number of Category 4: " + category4);
        System.out.println("Number of Category 5: " + category5);
        
        PrintWriter outFile = new PrintWriter(new File("Summary.txt"));
        outFile.println(avgCategory + " " + maxCategory + " " + minCategory + "\n"
                       + avgPressure + " " + maxPressure + " " +minPressure + "\n"
                       + avgMph + " " + maxMph + " " + minMph + "\n"
                       + category1 + "\n"
                       + category2 + "\n"
                       + category3 + "\n"
                       + category4 + "\n"
                       + category5 + "\n");
        outFile.close();
    }//end main()
}//end Hurricanes2