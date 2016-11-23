
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
        double pounds;                  // weight in pounds
        double kilograms;               // weight in kilograms
        double gallons;                 // volume in gallons
        double liters;                  // volume in liters
        double mol;                     // mass in moles
        double grams;                   // mass in grams
        
        double feetPerMile = 5280;      //number of feet per 1 mile
        double milePerFeet = 0.00018939;    //number of miles per 1 foot
        
        double kilometer;               // distance in kilometers
        
        double milePerKilometer = 0.621371;    //number of miles per 1 kilometer
        double kilometerPerMile = 1.60934;     //number of kilometers per 1 mile
        
        
        
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");
        
        //convert miles to feet
        miles = 2.1;
        feet = miles / milePerFeet;
        System.out.println(miles + " mi. " + feet + " ft. ");
        
        //convert miles to kilometers
        miles = 3.0;
        kilometers = miles / milePerKilometer;
        System.out.println(miles + " mi. " + kilometers + " Km. ");
        
        


        //convert miles to feet




    }//end of main method
}//end of class


