
/**
 * Calculate tons and pounds of CO2 produced by car.
 * 
 * @author Glen Halonen
 * @version Jan 2, 2017
 */
public class CO2FootprintV1
{
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;
    private String foo;
    
    CO2FootprintV1( double gals, String input )
    {
        myGallonsUsed = gals;
        foo = input;
    }
    
    CO2FootprintV1()
    {
    }
    
    /**
     * Constructor for Objects of type CO2FootprintV1
     * @param gals the number of gallons consumed annualy.
     */
    CO2FootprintV1(double gals)
    {
        myGallonsUsed = gals;
        foo = "fee";
    }
    
    /**
     * Mutator method to calculate tons of CO2 released (no parameters)
     */
    public void calcTons()
    {
        myTonsCO2 = myGallonsUsed * (8.78 * Math.pow(10,-3)) ;
    }

    /**
     * Mutator method to calculate pounds of CO2 produced based on tons produced (no parameters)
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2000;
    }
    
    /**
     * Getter method to return the amount of CO2 produced in tons (no parameters)
     */
    public double getTons()
    {
        return myTonsCO2;
    }
    
    /**
     * Getter method to return the amount of CO2 produced in pounds (no parameters)
     */
    public double getPounds()
    {
        return myPoundsCO2;
    }
    
    /**
     * Getter method to return gallons used in gallons (no parameters)
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }
}
