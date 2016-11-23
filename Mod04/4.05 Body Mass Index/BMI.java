
/**
 * Calculate BMI
 * 
 * @author Glen Halonen 
 * @version 10/8/16
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter you name (first last): ");
        String name = in.nextLine();
        System.out.println();
        
        System.out.print("Enter your weight in pounds (e.g. 175): ");
        double pounds = in.nextDouble();
        System.out.println();
        
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        int heightFeet = in.nextInt();
        int heightInches = in.nextInt();
        System.out.println();
        System.out.println();
        
        System.out.println("Body mass Index Calculator");
        
        System.out.println("==========================");
        
        System.out.println("Name: " + name);
        
        
        double heightMeter = 0.3048 * heightFeet + 0.0254 * heightInches;
        System.out.println("Height (m): " + heightMeter);
        
        double mass = pounds * 0.453592;
        System.out.println("Weight (kg): " + mass);
        
        double bodyMassIndex = mass / (heightMeter * heightMeter);
        System.out.println("BMI: " + bodyMassIndex);
        
        //if statements to categorize
        
        String category;
        
        if(bodyMassIndex > 29.9)
            category = "Obese";
        else if(bodyMassIndex >= 25.0)
            category = "Over Weight";
        else if(bodyMassIndex >= 18.5)
            category = "Good Weight";
        else 
            category = "Under Weight";
            
        System.out.println("Category: " + category);
            
             
        
        
        
        
        
        
        
    }
}