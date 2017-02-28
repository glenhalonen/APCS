
/**
  * Calculate the mileage on my car.
 * 
 * @author Glen Halonen
 * @version Sunday, Dec 4th
 */
public class CarV7
{
    //private instance variables
    
    private double gallonsUsed, startMiles, endMiles, pricePerGallon;
    private String carType;
   
    //default constructor
    CarV7()
    {
    }
    //constructor with parameters
    CarV7(String carType, double gallonsUsed, double startMiles, double endMiles, double pricePerGallon)
    {
        this.carType = carType;
        this.gallonsUsed = gallonsUsed;
        this.startMiles = startMiles;
        this.endMiles = endMiles;
        this.pricePerGallon = pricePerGallon;
        
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
        double cost = this. * miles;
        return cost;
    }
    
    
}
