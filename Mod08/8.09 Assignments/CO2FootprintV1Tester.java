
/**
 * @purpose: Calculate CO2 emissions from car.
 * 
 * @author Glen Halonen
 * @version Jan 2, 2017
 */
public class CO2FootprintV1Tester
{
    public static void main(String[] args)
    {
        //create object car
        CO2FootprintV1 car1 = new CO2FootprintV1(1198);
        
        //call methods
        car1.calcTons();
        car1.convertTonsToPounds();
        
        //print results
        System.out.println("      CO2 Emissions     ");
        System.out.println("Gallons   Pounds    Tons");
        System.out.println(" of gas  from gas  from gas");
        System.out.println("***************************");
        System.out.printf("%5.1f %10.2f %7.3f", car1.getGallons(), car1.getPounds(), car1.getTons());
    }
}
