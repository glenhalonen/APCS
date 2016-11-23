
/**
 * Claculate Basal Metabolic Rate.
 * 
 * @author Glen Halonen 
 * @version Saturday, October 8th
 */
import java.util.Scanner;
public class BMR
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String firstName = in.next();
        System.out.println();
        
        System.out.print("Gender M or F: ");
        String genderS = in.next();
        char gender = genderS.charAt(0);
        System.out.println();
        
        System.out.print("Enter your age: ");
        String ageS = in.next();
        int age = Integer.parseInt(ageS);
        System.out.println();
        
        System.out.print("Enter height in inches: ");
        double heightEnglish = in.nextDouble();
        System.out.println();
        
        System.out.print("Weight in pounds: ");
        double weight = in.nextDouble();
        System.out.println();
        System.out.println();
    
       
        System.out.println("Calculate Your Basal Metabolism");
        System.out.println();
        System.out.println();
        
        System.out.println("Name: " + firstName);
        
        System.out.println("Gender: " + gender);
       
        System.out.println("Age: " + age);
        
        //conersions
        double mass = weight * 0.453592;
        double heightMetric = heightEnglish * 2.54;
        
        System.out.println("Weight (kg): " + mass);
        System.out.println("Height (cm): " + heightMetric);
        
        //if female calculate else calculate male
        double BMR;
        boolean female = gender == 'F';
        
        if(female)
            BMR = 655.1 + ( 9.563 * mass ) + ( 1.850 * heightMetric ) - ( 4.676 * age ); 
        else
            BMR = 66.5 + ( 13.75 * mass ) + ( 5.003 * heightMetric ) - ( 6.755 * age ); 
            
        System.out.println("Basal Metabolic Rate: " + BMR  + " calories per day.");
        
    }
}
