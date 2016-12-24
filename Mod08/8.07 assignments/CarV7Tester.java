
/**
 * Tester for CarV7
 * 
 * @author Glen Halonen 
 * @version Sunday, December 11th
 */
public class CarV7Tester
{
    //main
    public static void main(String[] args)
    {
        double gallonsUsed1 = 16.33;
        double startMiles1 = 147356;
        double endMiles1 = 147698;
        double pricePerGallon1 = 2.00;
        String carType1 = "Mercury Sable";
        
        double gallonsUsed2 = 18;
        double startMiles2 = 73000;
        double endMiles2 = 73252;
        double pricePerGallon2 = 2.00;
        String carType2 = "Hummer       ";
        
        double gallonsUsed3 = 10;
        double startMiles3 = 190303;
        double endMiles3 = 190883;
        double pricePerGallon3 = 2.00;
        String carType3 = "Prius        ";
        
        CarV7 car1 = new CarV7(carType1, gallonsUsed1, startMiles1, endMiles1, pricePerGallon1);
        CarV7 car2 = new CarV7(carType2, gallonsUsed2, startMiles2, endMiles2, pricePerGallon2);
        CarV7 car3 = new CarV7(carType3, gallonsUsed3, startMiles3, endMiles3, pricePerGallon3);
        
        //call methods car1
        double miles = car1.calcDistance(startMiles1, endMiles1);
        double mileage = car1.calcMPG(miles, gallonsUsed1);
        double GPM = car1.calcGPM(miles, gallonsUsed1);
        double cost = car1.totalCost(pricePerGallon1, gallonsUsed1);
        //call methods car2
        double miles2 = car2.calcDistance(startMiles2, endMiles2);
        double mileage2 = car2.calcMPG(miles2, gallonsUsed2);
        double GPM2 = car2.calcGPM(miles2, gallonsUsed2);
        double cost2 = car2.totalCost(pricePerGallon2, gallonsUsed2);
        //call methods car3
        double miles3 = car3.calcDistance(startMiles3, endMiles3);
        double mileage3 = car3.calcMPG(miles3, gallonsUsed3);
        double GPM3 = car3.calcGPM(miles3, gallonsUsed3);
        double cost3 = car3.totalCost(pricePerGallon3, gallonsUsed3);
        
        
        //print results
        System.out.println("                                 Gas Mileage Calculations         ");
        System.out.println(" Type Of Car     Start Miles      End Miles      Distance     Gallons     Miles/Gal     Price/Gal     Cost     Gal/mi ");
        System.out.println("=======================================================================================================================");
        //car1
        System.out.printf("%2.14s %12.1f %15.1f %12.1f %11.1f %12.1f %12.1f %12.2f %10.3f%n",
                          carType1, startMiles1, endMiles1, miles, gallonsUsed1, mileage, pricePerGallon1, cost, GPM);
        //car2                  
        System.out.printf("%2.14s %12.1f %15.1f %12.1f %11.1f %12.1f %12.1f %12.2f %10.3f%n",
                          carType2, startMiles2, endMiles2, miles2, gallonsUsed2, mileage2, pricePerGallon2, cost2, GPM2);
        //car3
         System.out.printf("%2.14s %12.1f %15.1f %12.1f %11.1f %12.1f %12.1f %12.2f %10.3f%n",
                          carType3, startMiles3, endMiles3, miles3, gallonsUsed3, mileage3, pricePerGallon3, cost3, GPM3);
        
        System.out.println();
        
        
    }
}
