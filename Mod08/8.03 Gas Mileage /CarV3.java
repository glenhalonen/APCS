
/**
 * Calculate the mileage on my car.
 * 
 * @author Glen Halonen
 * @version Sunday, Dec 4th
 */
public class CarV3
{
    //default constructor
    public CarV3()
    {
    }
    //calculate distance
    public double calcDistance(double start, double finish)
    {
        double difference = finish - start;
        return difference;
    }
    //calculate mileage
    public double calcMPG(double difference, double gallons)
    {
        double mileage = difference / gallons;
        return mileage;
    }
    //main
    public static void main(String[] args)
    {
        double gallons = 16.33;
        double start = 147356;
        double end = 147698;
        String car = "Mercury Sable"; 
        
        CarV3 car1 = new CarV3();
        
        //call methods
        double miles = car1.calcDistance(start, end);
        double mileage = car1.calcMPG(miles, gallons);
        
        //print results
        System.out.println("                                 Gas Mileage Calculations         ");
        System.out.println(" Type Of Car     Start Miles      End Miles      Distance     Gallons      Miles/Gal");
        System.out.println("====================================================================================");
        System.out.printf("%2.14s %12.1f %15.1f %12.1f %11.1f %12.1f", car, start, end, miles, gallons, mileage);
        System.out.println();
    }
    
}
