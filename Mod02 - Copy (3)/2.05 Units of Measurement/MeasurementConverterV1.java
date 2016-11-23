
/**
 * MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 *
 *      Sample Calculation:
 *        1 mile = 5280 ft,
 *        therefore    6230 ft / 5280 = 1.17992 miles
 *          and    1.179 miles * 5280 = 6225.12 ft
 *
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Glen Halonen
 * Date: 9/13/2016
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;              // distance in kilometers
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        double gallons;                 // volume in gallons
        double liters;                  // volume in liters
        double centimeters;             // distance in centimeters
        double inches;                  // distance in inches
        
        double feetPerMile = 5280;             //number of feet per 1 mile
        double milePerFeet = 0.00018939;       //number of miles per 1 foot
        
        double milePerKilometer = 0.621371;    //number of miles per 1 kilometer
        double kilometerPerMile = 1.60934;     //number of kilometers per 1 mile
        
        double kilogramPerPound = 0.453592;    //number of kilograms per 1 pound
        double poundPerKilogram = 2.20462;     //number of pounds per 1 kilogram
        
        double literPerGallon = 3.78541;        //number of liters per gallon
        double gallonPerLiter = 0.264172;       //number of gallons per liter
        
        double centimeterPerInch = 2.54;        //number of centimeters per inch
        double inchPerCentimeter = 0.393701;    //number of inches per centimeter
       
        
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        
        //convert miles to feet
        miles = 2.1;
        feet = miles / milePerFeet;
        System.out.println(miles + " mi. = " + feet + " ft. ");
        
        
        //convert miles to kilometers
        miles = 3.0;
        kilometers = miles / milePerKilometer;
        System.out.println(miles + " mi. = " + kilometers + " km ");
        
        //convert kilometers to miles
        kilometers = 123;
        miles = kilometers / kilometerPerMile;
        System.out.println( kilometers + " km = " + miles + " mi. ");
        
        
        //convert pounds to kilograms
        pounds = 175;
        kilograms = pounds / poundPerKilogram ;
        System.out.println( pounds + " lbs. = " + kilograms + " kg ");
        
        //convert kilograms to pounds
        kilograms = 321;
        pounds = kilograms / kilogramPerPound ;
        System.out.println( kilograms + " kg = " + pounds + " lbs. ");
        
        
        //convert gallons to liters
        gallons = 5;
        liters = gallons / gallonPerLiter;
        System.out.println( gallons + " gal. = " + liters + " l ");
        
        //converet liters to gallons
        liters = 2;
        gallons = liters / literPerGallon;
        System.out.println( liters + " l = " + gallons + " gal. ");
        
        
        //convert centimeters to inches
        centimeters = 10;
        inches = centimeters / centimeterPerInch;
        System.out.println( centimeters + " cm = " + inches + " in. ");
        
        //convert inches to centimeters
        inches = 12;
        centimeters = inches / inchPerCentimeter;
        System.out.println( inches + " in. = " + centimeters + " cm ");
        
        
        
        

    }//end of main method
}//end of class


