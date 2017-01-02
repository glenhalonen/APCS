/**
 * @purpose: Calculate yearly CO2 emissions from electricity 8.10
 *
 * @author: Glen Halonen
 * @version: 
 */
import java.util.ArrayList;
public class CO2FromElectricityTester
{
   public static void main(String[] args)
   {
       	CO2FromElectricity CO2 = new CO2FromElectricity();

       	ArrayList<Double> monthlyBill = new ArrayList<Double>(3);
       	ArrayList<Double> monthlyPrice = new ArrayList<Double>(3);

       	//Values to add to the monthly bill or use your own:
       	monthlyBill.add(322.34);
       	monthlyBill.add(300.98);
       	monthlyBill.add(351.09);
       	//	209.60, 249.68. 222.59

       	// Values to add to the monthly Price or use your own:
       	monthlyPrice.add(210.90/3501);
       	monthlyPrice.add(260.31/3217);
       	monthlyPrice.add(233.51/2701);
		// (209.70 / 2464), (249.68 / 2948), (222.59 / 2621)


       double avgBill = CO2.calcAverageBill(monthlyBill);
       double avgPrice = CO2.calcAveragePrice(monthlyPrice);

       double emissions = CO2.calcElectricityCO2(avgBill, avgPrice);

       System.out.printf("Average Monthly Electricity Bill: %6.2f%n", avgBill);
       System.out.printf("Average Monthly Electricity Price: %4.2f%n", avgPrice);
       System.out.printf("Annual CO2 Emissions from Electricity Usage: %7.1f pounds", emissions);
   }
}

