
/**
 * Calculate amount calories to be consumed. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {
    
    Scanner in = new Scanner(System.in);
    
    System.out.print("Please enter your name: ");
    String fullName = in.nextLine();
    System.out.println();
    
    System.out.print("Please enter your BMR: ");
    double basalMR = in.nextDouble();
    System.out.println();
    
    System.out.print("Please enter your gender (M/F): ");
    String gender = in.next();
     System.out.println();
     
    System.out.println("Activity Levels:");
    System.out.println("[A] Resting           (sleeping or reclining)");
    System.out.println("[B] Sedentary         (Reading or lying down)");
    System.out.println("[C] Light             (office work or easy walking)");
    System.out.println("[D] Moderate          (light manual labor or cycling)");
    System.out.println("[E] Very Active       (hard manual labor or sports)");
    System.out.println("[F] Extremely Active  (heavy manual labor or fulltime athlete)");
    System.out.print("Please select your activity level: ");
    String choice = in.next();
    System.out.println();
    System.out.println();
    System.out.println("************************************************");
    System.out.println("************************************************");
    System.out.println();
    System.out.println();
    //use not for female
    boolean genderH = gender.equalsIgnoreCase("M");
    
    double activityFactor = 0;
    
    //male then letter
    
    if(choice.equalsIgnoreCase("A")){
        activityFactor = 1.0;
    }
    else if(choice.equalsIgnoreCase("B")){
        activityFactor = 1.3;
    }
    else if(choice.equalsIgnoreCase("C") && genderH){
        activityFactor = 1.6;
    }
    else if(choice.equalsIgnoreCase("C") && !genderH){
        activityFactor = 1.5;
    }
    else if(choice.equalsIgnoreCase("D") && genderH){
        activityFactor = 1.7;
    }
    else if(choice.equalsIgnoreCase("D") && !genderH){
        activityFactor = 1.6;
    }
    else if(choice.equalsIgnoreCase("E") && genderH){
        activityFactor = 2.1;
    }
    else if(choice.equalsIgnoreCase("E") && !genderH){
        activityFactor = 1.9;
    }
    else if(choice.equalsIgnoreCase("F") && genderH){
        activityFactor = 2.4;
    }
    else if(choice.equalsIgnoreCase("F") && !genderH){
        activityFactor = 2.2;
    }
    else{
        System.out.println("SORRY, THE LETTER YOU HAVE ENTERED IS NOT IN THE MENU!");
        System.out.println();
    }
    double tDEE = basalMR * activityFactor;
    
    System.out.println("Name: " + fullName + "\tGender: " + gender);
    System.out.println("BMR: " + basalMR + " calories \t Activity Factor: " + activityFactor);
    System.out.println("TDEE: " + tDEE);
    
  } 
}
