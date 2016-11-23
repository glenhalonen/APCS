import java.util.Scanner;
/**
 * Write a description of class AnnualClimate1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnualClimate1
{
    public static void main(String[] args)
    {

        //Declare and intialize variables - programmer to provide initial values
        Scanner in = new Scanner(System.in);
        String city = "Miami";
        String state = "Florida";

        String month [] ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", 
                          "Sep", "Oct", "Nov", "Dec"};
        double temperature [] ={ 68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};       //initialize with Fahrenheit values
        double precipitation [] ={ 1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2 };  //initialize with inches values
        
        String tempLabel = "(F)";   //initialize to F
        String precipLabel = "(in)"; //initialize to cm


        //INPUT - ask user for temp and preciptation scale choice
        System.out.print("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String tempChoice = in.next();
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String precipChoice = in.next();


        //PROCESSING - convert from F to C and in to cm based on user's choices
        // remember 5/9 = 0, 5.0/9 = .5555
        //c(9/5)+32=f
        if(tempChoice.equalsIgnoreCase("C"))
        {
            tempLabel = "(C)";
            for( int index = 0; index < temperature.length; index++)
            {
                //code for assigning new C values to the temperature array
                double x = (temperature[index] - 32) * (5.0/9);
                temperature[index] = x;
            }

        }

        //Convert in values to cm; replace the current values in precipitation
        if(precipChoice.equalsIgnoreCase("C"))
        {
            precipLabel="(cm)";
            for( int index = 0; index < precipitation.length; index++)
            {
                double x = precipitation[index] * 2.54;
                precipitation[index] = x;
            }

        }

        //OUTPUT - print table using printf to format and align data

        System.out.println();
        System.out.println("Climate Data");
        System.out.println("Location: " + city +", " + state);
        System.out.printf("%5s %18s %s %18s %s","Month","Temperature",tempLabel,"Precipitation",precipLabel);
        System.out.println();
        System.out.printf("***************************************************");
        System.out.println();
        
        double sumTemp = 0;
        double sumPrec = 0;
        for(int i = 0; i < temperature.length; i++)
        {
            System.out.printf("%3S %18.1f %18.1f%n", month[i], temperature[i], precipitation[i]);
            sumTemp += temperature[i];
            sumPrec+= precipitation[i];
        }
        System.out.println();
        System.out.println("**************************************************");
        System.out.println();
        
        double avgTemp = sumTemp / temperature.length;
        double avgPrec = sumPrec / precipitation.length;
        System.out.printf("%22.2f %18.2f%n", avgTemp, avgPrec);




    }//end main
}//end Annual Climate
   