
/**
  * Calculate the mileage on my car.
 * 
 * @author Glen Halonen
 * @version Sunday, Dec 4th
 */
public class CarV5
{
    //private instance variables
    
    private double gallonsUsed1, startMiles1, endMiles1, pricePerGallon;
    private String carType1;
   
    //default constructor
    CarV5()
    {
    }
    //constructor with parameters
    CarV5(String CT, double GU, double SM, double EM, double PG)
    {
        carType1 = CT;
        gallonsUsed1 = GU;
        startMiles1 = SM;
        endMiles1 = EM;
        pricePerGallon = PG;
        
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
    //calculate gallons per mile
    public double calcGPM(double miles,  double gallons)
    {
        double gallonsPerMile = gallons/miles;
        return gallonsPerMile;
    }
    //calculate total cost
    public double totalCost(double gallonPrice, double miles)
    {
        double cost = gallonPrice * miles;
        return cost;
    }
    //main
    public static void main(String[] args)
    {
        double gallonsUsed1 = 16.33;
        double startMiles1 = 147356;
        double endMiles1 = 147698;
        double pricePerGallon1 = 2.00;
        String carType1 = "Mercury Sable"; 
        
        CarV5 car1 = new CarV5(carType1, gallonsUsed1, startMiles1, endMiles1, pricePerGallon1);
        
        //call methods
        double miles = car1.calcDistance(startMiles1, endMiles1);
        double mileage = car1.calcMPG(miles, gallonsUsed1);
        double GPM = car1.calcGPM(miles, gallonsUsed1);
        double cost = car1.totalCost(pricePerGallon1, gallonsUsed1);
        
        //print results
        System.out.println("                                 Gas Mileage Calculations         ");
        System.out.println(" Type Of Car     Start Miles      End Miles      Distance     Gallons     Miles/Gal     Price/Gal     Cost     Gal/mi ");
        System.out.println("=======================================================================================================================");
        System.out.printf("%2.14s %12.1f %15.1f %12.1f %11.1f %12.1f %12.1f %12.2f %10.3f",
                          carType1, startMiles1, endMiles1, miles, gallonsUsed1, mileage, pricePerGallon1, cost, GPM);
        System.out.println();
    }
    
}