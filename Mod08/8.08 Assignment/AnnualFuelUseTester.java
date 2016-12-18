
/**
 * Calulate fuel usage related data.
 * 
 * @author Glen Halonen
 * @version Saturday, December 17th
 */
public class AnnualFuelUseTester
{
    public static void main(String[] args)
    {
        //create an array of methods EVERY FILL UP IS AN OBJECT!
        AnnualFuelUse[] car = {new AnnualFuelUse(1, 16.33, 147356, 147698, 2.00),
                               new AnnualFuelUse(7, 20.89, 147698, 148120, 2.25),
                               new AnnualFuelUse(14, 18.40, 148120, 148503, 2.15)};
        //call methods
        for(int i = 0; i < car.length; i++)
        {
            car[i].calcDistance();
            car[i].calcMPG();
            car[i].totalCost();
            
        }
        
        //set up table
        System.out.println("Fill Up   Days   Start Miles   End Miles   Distance   Gallons Used   MPG   Price   Cost");
        System.out.println();
        
        //print out table
        for(int i = 0; i < car.length; i++)
        {
            System.out.printf("%3.1s %8s %12.0f %12.0f %9.0f %13.2f %9.1f %7.2f %7.2f%n" , 
            (i + 1), car[i].getDay(), car[i].getStart(), car[i].getEnd(), 
            car[i].getDistance(), car[i].getGallonsUsed(), car[i].getMPG(),
            car[i].getPrice(), car[i].getCost());
        }
        System.out.println();
        
        //find minimum distance
        double minDistance = Double.MAX_VALUE;
        for(int i = 0; i < car.length; i++)
        {
            if(minDistance > car[i].getDistance())
                minDistance = car[i].getDistance();
        }
        //find maximum distance
        double maxDistance = Double.MIN_VALUE;
        for(int i = 0; i < car.length; i++)
        {
            if(maxDistance < car[i].getDistance())
                maxDistance = car[i].getDistance();
        }
    
    
        //find maximum mpg
        double maxMPG = Double.MIN_VALUE;
        for(int i = 0; i < car.length; i++)
        {
            if(maxMPG < car[i].getMPG())
                maxMPG = car[i].getMPG();
        }
        //find minimum mpg
        double minMPG = Double.MAX_VALUE;
        for(int i = 0; i < car.length; i++)
        {
            if(minMPG > car[i].getMPG())
                minMPG = car[i].getMPG();
        }
        
        
        //find max price
        double maxPrice = Double.MIN_VALUE;
        for(int i = 0; i < car.length; i++)
        {
            if(maxPrice < car[i].getPrice())
                maxPrice = car[i].getPrice();
        }
        //find min price 
        double minPrice = Double.MAX_VALUE;
        for(int i = 0; i < car.length; i++)
        {
            if(minPrice > car[i].getPrice())
                minPrice = car[i].getPrice();
        }
        
        System.out.printf("Minimum: %39.0f %23.1f %7.2f%n", minDistance, minMPG, minPrice);
        System.out.printf("Maximum: %39.0f %23.1f %7.2f%n", maxDistance, maxMPG, maxPrice);
        System.out.println();
        
        // totals
        double sumDistance = 0.0;
        double sumGallonsUsed = 0.0;
        double sumCost = 0.0; 
        double sumMPG = 0.0;
        for(int i = 0; i < car.length; i++)
        {
            sumDistance += car[i].getDistance();
            sumGallonsUsed += car[i].getGallonsUsed();
            sumCost += car[i].getCost();
            sumMPG += car[i].getMPG();
        }
        
        System.out.printf("Totals: %40.0f %13.2f %25.2f%n", sumDistance, sumGallonsUsed, sumCost);
        
        //Annual Projections
        double annDistance = sumDistance * 26;
        double annGallons = sumGallonsUsed * 26;
        double annMPG = sumMPG/car.length;
        double annCost = sumCost * 26;
        System.out.printf("Annual Projection: %29.0f %13.2f %9.1f %15.2f%n", 
        annDistance, annGallons, annMPG, annCost);
        //use print f to format
    }
}
