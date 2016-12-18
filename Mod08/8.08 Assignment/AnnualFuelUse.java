
/**
 * Methods to calulate car fuel usage.
 * 
 * @author Glen Halonen
 * @version Saturday, December 17th
 */
public class AnnualFuelUse
{
    //private instance variables
    
    private double gallonsUsed, startMiles, endMiles, pricePerGallon;
    private double distance, mileage, cost;
    private int days;
    
    //constructor with parameters
    AnnualFuelUse(int DS, double GU, double SM, double EM, double PG)
    {
        gallonsUsed = GU;
        startMiles = SM;
        endMiles = EM;
        pricePerGallon = PG;
        days = DS;
        distance = 0.0;
        mileage = 0.0;
        cost = 0.0;
        
    }
    
    //get methods for variables
    
    //get gallons used
    public double getGallonsUsed()
    {
        return gallonsUsed;
    }
    //get day
    public int getDay()
    {
        return days;
    }
    //get start miles
    public double getStart()
    {
        return startMiles;
    }   
    //get end miles
    public double getEnd()
    {
        return endMiles;
    }
    //get price
    public double getPrice()
    {
        return pricePerGallon;
    }
    
    
    
    
    
    //calculate distance
    public void calcDistance()
    {
        distance = endMiles - startMiles;
    }
    //getter for distance
    public double getDistance()
    {
        return distance;
    }
    
    //calculate mileage
    public void calcMPG()
    {
        mileage = distance / gallonsUsed;
    }
    //getter for MPG
    public double getMPG()
    {
        return mileage;
    }
    
    //calculate total cost
    public void totalCost()
    {
        cost = pricePerGallon * gallonsUsed;
    }
    //get cost
    public double getCost()
    {
        return cost;
    }
    
    
}
