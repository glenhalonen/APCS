
/**
 * Convert Units Through Method Calls
 * 
 * @author Glen Halonen
 * @version 11/21/2016
 */
public class MeasurementConverterV2
{
    //Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi * 0.621371; //return statement calculate kilometers goes here      
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km * 1.60934; //return statement to calculate miles goes here     
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public static double convertPoundsToKilograms(double lbs)
    {
        return lbs * 2.20462; //return statement to calculate kilograms goes here    
    } 
    
    //convert kilograms to pounds
    // method header to convert kilograms to pounds goes here
    public static double convertKilogramsToPounds(double kg)
    {
        return kg * 0.453592; //return statement to calculate pounds goes here     
    } 
    
    //convert gallons to liters
    public static double convertGallonsToLiters(double gal)
    {
        return gal * 0.264172;
    }
    
    //convert liters to gallons
    public static double convertLitersToGallons(double l)
    {
        return l * 3.78541;
    }
    
    //convert centimeters to inches
    public static double  convertCentimetersToInches(double cm)
    {
        return cm * 2.54;
    }
        
    //convert years to days
    public static double convertYearsToDays(double yrs)
    {
        return yrs * 365 + yrs/4; 
    }
    
    public static void main(String[ ] args)
    {
        //local variables
        //double miles, feet, inches, pounds, gallons;
        //double kilometers, kilograms, liters;
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        double feet = 6230;
        double miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        //call method to convert kilometers to miles goes here
        double mile = convertKilometersToMiles(kilometers);
        //print results goes here
        System.out.printf("%8.1f km. = %7.1f km. %n", kilometers, miles);
        
        double pounds = 204;
        //call method to convert pounds to kilograms goes here
        double kilogram = convertPoundsToKilograms(pounds);
        //print results goes here
        System.out.printf("%7.1f lbs. = %7.1f kg. %n", pounds, kilogram);
       
        //declare and initialize the kilograms variable goes here
        double kilograms = 1000;
        //call method to convert kilograms to pounds goes here
        double pound = convertKilogramsToPounds(kilograms);
        //print results goes here
        System.out.printf("%7.1f lbs. = %7.1f kg. %n", kilograms, pound);
       
        //declare and initialize the gallons variable goes here
        double gallons = 5;
        //call method to convert gallons to liters goes here
        double liter = convertGallonsToLiters(gallons);
        //print results goes here
        System.out.printf("%7.1f gal. = %8.1f l. %n", gallons, liter);
        
        //declare and initialize the liters variable goes here
        double liters = 1.5;
        //call method to convert liters to gallons goes here
        double gallon = convertLitersToGallons(liters);
        //print results goes here
        System.out.printf("%9.1f l. = %6.1f gal. %n", liters, gallons);
        
        //initialize centimeters
        double centimeters = 10.3;
        //method call, convert cm to in.
        double inch = convertCentimetersToInches(centimeters);
        //print results
        System.out.printf("%8.1f cm. = %7.1f in. %n", centimeters, inch);
        
        //intitialize years
        double years = 100;
        //call method to convert years to days
        double days = convertYearsToDays(years);
        //print results
        System.out.printf("%7.1f yrs. = %6.1f days %n", years, days);
    }//end of main method
	
}//end of class
