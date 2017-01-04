
/**
 * Constructor for objects in myCO2ProductionTester. 
 * 
 * @author Glen Halonen
 * @version Jan 3, 2017
 */
public class myCO2Production
{
    //gas
    private double myGallonsUsed, gasPoundsCO2;
    //electric
    private double avgBill, avgPrice, elecPoundsCO2, elecReduction, netElecPounds;
    private int lightbulbs;
    //waste
    private int numPeople;
    private boolean myPaper, myPlastic, myGlass, myCans;
    private double wasteEmissions, wasteReduction, netWasteEmissions;
    //total
    private double totalCO2;
    /**
     * Default contructor for me
     * @param gals number of gallons consumed
     * @param bill average monthly bill for electricity
     * @param price average monthly price for electricity
     * @param people number of people in family
     * @param paper wether paper is recycled or not
     * @param plastic wether paper is recycled or not
     * @param glass wether paper is recycled or not
     * @param cans wether paper is recycled or not
     * @param bulbs the number of Energy Star bulbs that replaced older bulbs
     */
    myCO2Production (double gals, double bill, double price, int people, boolean paper,
                     boolean plastic, boolean glass, boolean cans, int bulbs)
    {
        myGallonsUsed = gals;
        avgBill = bill;
        avgPrice = price;
        numPeople = people;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;
        lightbulbs = bulbs;
        wasteEmissions = 0.0;
        wasteReduction = 0.0;
        netWasteEmissions = 0.0;
        gasPoundsCO2 = 0.0;
        elecPoundsCO2 = 0.0;
        elecReduction = 0.0;
        netElecPounds = 0.0;
        totalCO2 = 0.0;
    }

    //gas
    /**
     * Mutator method to calculate pounds of CO2 produced based on tons produced (no parameters)
     */
    public void calcGasPounds()
    {
        gasPoundsCO2 = myGallonsUsed * (8.78 * Math.pow(10,-3)) * 2000;
    }
    
    /**
     * Getter method to return the amount of CO2 produced in pounds (no parameters)
     */
    public double getGasPounds()
    {
        return gasPoundsCO2;
    }
    
    //electric
    /**
     * Mutator method to calulate the amount of CO2 released (no parameters)
     */
    public void calcElecPounds()
    {
        elecPoundsCO2 = (avgBill / avgPrice) * 1.37 * 12;
    }
    
    /**
     * Mutator method to calculate the amount of CO2 reduced with new bulbs (no parameters)
     */
    public void calcElecReduction()
    {
        elecReduction = lightbulbs * 1.37 * 73;
    }
    
    /**
     * Mutator method to calculate the net amount of CO2 released due to electricity (no parameters)
     */
    public void calcNetElecPounds()
    {
        netElecPounds = elecPoundsCO2 - elecReduction;
    }
    
    /**
     * Getter method to return pounds CO2 due to electricity use (no parameters)
     */
    public double getElecPounds()
    {
        return elecPoundsCO2;
    }
    
    /**
     * Getter method to return the amount od reduction due to lightbulb
     */
    public double getElecReduction()
    {
        return elecReduction;
    }
    
    
    //waste
    /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
    public void calcGrossWasteEmission()
    {
        wasteEmissions = (184.0 + 25.6 + 46.6 + 165.8) * numPeople;
    }
   
    /**
     * Mutator method to calculate the emission reduction from recycling (no parameters)
     */
    public void calcWasteReduction()
    {
      if(myPaper)
      {
           wasteReduction += (184.0 * numPeople);
      }
       
      if(myPlastic)
      {
           wasteReduction += (25.6 * numPeople);
      }
      
      if(myGlass)
      {
          wasteReduction += (46.6 * numPeople);
      }
      
      if(myCans)
      {
          wasteReduction += (165.8 * numPeople);
      }
    }
   
    /**
     * Mutator method to calculate the net emissions (no paramters)
     */
    public void calcNetWaste()
    {
        netWasteEmissions = wasteEmissions - wasteReduction;
    }
   
    /**
     * Getter method to return the reduction amount (no paramters)
     */
    public double getWasteReduction()
    {
       return wasteReduction;
    }
    
    /**
     * Getter method to return the net emissions (no paramters)
     */
    public double getNetEmissions()
    {
       return wasteEmissions;
    } 
   
    /**
     * Getter method to return the total emissions (no paramters)
     */
    public double getWasteEmissions()
    {
       return wasteEmissions;
    }
   
    //calc total CO2 Footprint
    /**
     * Mutator method to calculate total CO2 footprint (no parameters)
     */
    public void calcTotalCO2()
    {
        totalCO2 = gasPoundsCO2 + netElecPounds + netWasteEmissions;
    }
    
    /**
     * Mutator method to return the total CO2 footprint (no parameters)
     */
    public double getTotalCO2()
    {
        return totalCO2;
    }
}
