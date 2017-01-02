/**
 * @purpose: Calculate yearly CO2 emissions from electricity (8.10)
 *
 * @author:
 * @version:
 */
import java.util.ArrayList;
public class CO2FromElectricity

{
   
    CO2FromElectricity()
   {
   	//default constructor to be used
   }

   public double calcAverageBill(ArrayList<Double> monthlyBill)
   {
       // **** insert code for method here ****//
       double billSum = 0.0;
       for(int i = 0; i < monthlyBill.size(); i++)
       {
           billSum += monthlyBill.get(i);
       }
       return billSum/monthlyBill.size();
   }

   public double calcAveragePrice (ArrayList<Double> monthlyPrice)
   {
        // **** insert code for method here ****//
       double priceSum = 0.0;
       for(int i = 0; i < monthlyPrice.size(); i++)
       {
           priceSum += monthlyPrice.get(i);
       }
       return priceSum/monthlyPrice.size();
   }

   public double calcElectricityCO2 (double avgBill, double avgPrice)
   {
        // **** insert code for method here ****//
        double electricityCO2 = (avgBill / avgPrice) * 1.37 * 12;
        return electricityCO2;
   }
   
}

