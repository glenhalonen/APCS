/**
 * @purpose: Calculate yearly CO2 emissions from electricity 
 *
 * @author: Glen Halonen
 * @version: Jan 2, 2017
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
   private double billSum, avgBill, priceSum, avgPrice, electricityCO2; 
   
    /**
    * Default constructor to create an object from the CO2FromElectricity class.
    */
    CO2FromElectricity()
   {
       billSum = 0.0;
       avgBill = 0.0;
       priceSum = 0.0;
       avgPrice = 0.0;
       electricityCO2 = 0.0;
   }

   /**
    * Mutator method to calculate the average montly bill
    * @param monthlyBill an array of bills from a few months
    * @return avgBill the average bill monthly for electricity
    */
   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       double billSum = 0.0;
       for(int i = 0; i < monthlyBill.size(); i++)
       {
           billSum += monthlyBill.get(i);
       }
       double avgBill = billSum/monthlyBill.size();
       return avgBill;
   }

   /**
    * Mutator method to calculate the average monthly price
    * @param montlyPrice an array of prices from a few months
    * @return avgPrice the average price per month for electricity
    */
   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
       double priceSum = 0.0;
       for(int i = 0; i < monthlyPrice.size(); i++)
       {
           priceSum += monthlyPrice.get(i);
       }
       double avgPrice = priceSum/monthlyPrice.size();
       return avgPrice;
   }

   /**
    * Mutator method to calulate the amount of CO2 released
    * @param avgBill the average monthly bill
    * @param avgPrice the average monthly price
    * @return electricityCO2 the amount of CO2 produced from electricity
    */
   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
        double electricityCO2 = (avgBill / avgPrice) * 1.37 * 12;
        return electricityCO2;
   }
   
}

