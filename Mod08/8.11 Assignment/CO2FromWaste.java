/**
 * This class instantiates CO2FromWaste(8.11) objects with 8 private instance variables.
 * It contains three mutator methods to calculate the pounds of CO2: in total emissions,
 * emission reductions, and net emissions.  It contains getter methods for each private
 * instance variables.  Private instance variables include myNumPeople, myPaper, myPlastic,
 * myGlass, myCans, myEmissions, myReduction, and myNetEmissions.
 *
 * @author:
 * @version:
 */
public class CO2FromWaste
{
   private int myNumPeople;
   private boolean myPaper, myPlastic, myGlass, myCans;
   private double myEmissions, myReduction, myNetEmissions;

   /**
    * Constructor for objects of type CO2FromWaste
    * @param numPeople number of people in a household
    * @param paper whether or not paper is recycled
    * @param plastic whether or not plastic is recycled
    * @param glass whether or not glass is recycled
    * @param cans whether or not cans are recycled
    */
   CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
   {
       myNumPeople = numPeople;
       myPaper = paper;
       myPlastic = plastic;
       myGlass = glass;
       myCans = cans;
       myEmissions = 0.0;
       myReduction = 0.0;
       myNetEmissions = 0.0;
   }

   /**
    * Mutator method to calculate the total emissions, without any recycling (no parameters)
    */
   public void calcGrossWasteEmission()
   {
        //******* fill in code for method here ****//
   }

   /**
    * Mutator method to calculate the emission reduction from recycling (no parameters)
    */
   public void calcWasteReduction()
   {
       if(myPaper)
       {
           myReduction += (184.0 * myNumPeople);
       }

      //******* fill in rest of method here ****//
      if(myPlastic)
       {
           myReduction += (25.6 * myNumPeople);
       }



   }

   /**
    * Mutator method to calculate the net emissions (no paramters)
    */
   public void calcNetWasteReduction()
   {
        //******* fill in rest of method here ****//
   }

   /**
    * Getter method to return the number of people (no paramters)
    */
   public int getNumPeople()
   {
       return myNumPeople;
   }

   /**
    * Getter method to return paper's recycled status (true or false) (no paramters)
    */
   public boolean getPaper()
   {
       return myPaper;
   }

   /**
    * Getter method to return glass's recycled status (true or false) (no paramters)
    */
   public boolean getGlass()
   {
       return myGlass;
   }

   /**
    * Getter method to return plastic's recycled status (true or false) (no paramters)
    */
   public boolean getPlastic()
   {
       return myPlastic;
   }

   /**
    * Getter method to return cans' recycled status (true or false) (no paramters)
    */
   public boolean getCans()
   {
       return myCans;
   }

   /**
    * Getter method to return the total emissions (no paramters)
    */
   public double getEmissions()
   {
       return myEmissions;
   }

   /**
    * Getter method to return the reduction amount (no paramters)
    */
   public double getReduction()
   {
       return myReduction;
   }

   /**
    * Getter method to return the net emissions (no paramters)
    */
   public double getNetEmissions()
   {
       return myNetEmissions;
   }
}

