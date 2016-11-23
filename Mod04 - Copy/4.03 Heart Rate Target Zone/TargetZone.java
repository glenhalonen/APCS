
/**
 * To determine your heart rate zone in a cardiovascular exercise.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner(System.in);  
     
     System.out.println("Determind Your Target Heart Rate Zone for Cardiovascular Execise (65% - 85%)");
     System.out.println();
     
     System.out.println("Enter your age: ");
     String ageT = in.next();
     int ageI = Integer.parseInt(ageT);
     
     System.out.println("Enter your resting heart rate: ");
     String restingHeartT = in.next();
     int restingHeartI= Integer.parseInt(restingHeartT);
     
     System.out.println("Enter your heart rate after exercising: ");
     String exercisedHeartT = in.next();
     int exercisedHeartI = Integer.parseInt(exercisedHeartT);
     System.out.println();
     
     double maxHeartRate =  206.9 - (0.67*ageI);
     double heartRateReserve = maxHeartRate - restingHeartI;
     double lowerEnd = (heartRateReserve*0.65)+ restingHeartI;
     double upperEnd = (heartRateReserve*0.85)+ restingHeartI;
     
     
     
     
     //conveert back to an int so there aren't decimals in output
     System.out.println("Your target heart range is between " + (int)lowerEnd  + " and " + (int)upperEnd);
     
     
        
    }
}
