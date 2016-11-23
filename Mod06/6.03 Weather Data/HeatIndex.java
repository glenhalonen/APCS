
/**
 * Calculate the heat index. 
 * 
 * @author Glen Halonen 
 * @version Thursday, November 10
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class HeatIndex
{
    public static void main(String[] args) throws IOException
    {
        //initialize and declare vars

        String location = "";
        File fileNameTemp = new File("KeyWestTemp.txt");
        File fileNameHumid = new File("KeyWestHumid.txt");

        Scanner inFileTemp = new Scanner(fileNameTemp);
        Scanner inFileHumid = new Scanner(fileNameHumid);

        String [] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "Novermber", "December"};
        int length = month.length;
        double [] temperature = new double[length];
        int [] humidity = new int[length];
        double [] hI = new double[length];


        //INPUT - read in data for temp and humidity from files
        int n = 0; //index value for arrays
        while( inFileTemp.hasNextDouble() )
        {
            temperature[n] = inFileTemp.nextDouble( );
            //System.out.println (temperature[n]); //debug statement - uncomment to see values assignned to temperature
            n++;
        }
        inFileTemp.close();


        n = 0; //reset index to 0
        while (inFileHumid.hasNextDouble())
        {
                humidity[n] = inFileHumid.nextInt( );
                //System.out.println (humidity[n]);  //debug statement - uncomment to see values assignned to humidity
                n++;
        }
        inFileHumid.close();

        //PROCESSING - calculate Heat Index if needed- see lecture notes for details, formula is incomplete

        double t = 0.0;
        int h = 0;

        for(n = 0; n < hI.length; n++)
        {
            if( temperature[n] >= 80.0 && humidity[n] <= 13) //determine if HI should be calculated, complete the condition based on Lecture notes
            {
                t = temperature[n];
                h = humidity[n];

                hI[n] = -42.379
                        + 2.04901523 * t
                        + 10.14333127 * h
                        - .22475541 * t * h
                        - .00683783 * t * t
                        - .05481717 * h * h
                        + .00122874 * t * t * h
                        + .00085282 * t * h * h
                        - .00000199 * t * t * h * h;   //complete formula found in lecture notes
            }
            else  // HI is the temperature value
            {
                hI[n] = temperature[n];
            }
        }


        //calculate averages for temperature, humidity and HI

        double tempSum = 0.0;
        int humidSum = 0;
        double hISum = 0.0;

        for(n = 0; n < temperature.length; n++)
        {
            tempSum += temperature[n];
        }
        
        for(n = 0; n < humidity.length; n++)
        {
            humidSum += humidity[n];
        }
        for(n = 0; n < hI.length; n++)
        {
            hISum += hI[n];
        }
        
        double tempAvg = tempSum/temperature.length;
        double humAvg = humidSum/humidity.length;
        double hIAvg = hISum/hI.length;


        //OUTPUT - print table. Use enhanced for loops to print the months, temp, humidity and HI

        System.out.println("              Heat Index: Key West, Florida");
        System.out.println();
        
        System.out.println("              Months");
        System.out.println();
        System.out.print("            ");
        for(String m : month)    
        {
            System.out.printf("%7.3s", m);
        }
        System.out.println();
        System.out.println("************************************************************************************************");


        System.out.print("Temp (F)    ");
         //for:each loop to print temperature
        for(Double temp : temperature)
            System.out.printf("%7.1f", temp);
        //print averagf
        System.out.println();
       

        System.out.print("Humidity (%)");
        for(Integer hum : humidity)
            System.out.printf("%7.3s", hum);
        //for:each loop to print h5idity
        System.out.println();

        System.out.print("HI (F)      ");
        //for:each loop to print HI
        for(Double hIn : hI)
            System.out.printf("%7.1f", hIn);
        System.out.println();
        
        PrintWriter outFile = new PrintWriter(new File("heatIndex.txt"));
        for(int i = 0; i < hI.length; i++)
        {
            outFile.println(hI[i]);
        }
        outFile.close();
    } //end main()He
}//end HeatIndex

