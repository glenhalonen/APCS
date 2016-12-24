
/**
  * Calculate the mileage on my car.
 * 
 * @author Glen Halonen
 * @version Sunday, Dec 4th
 */
public class CarV7
{
    //private instance variables
    
    private double gallonsUsed1, startMiles1, endMiles1, pricePerGallon;
    private String carType1;
   
    //default constructor
    CarV7()
    {
    }
    //constructor with parameters
    CarV7(String CT, double GU, double SM, double EM, double PG)
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
    
    
}
