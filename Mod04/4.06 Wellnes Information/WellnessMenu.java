
/**
 * Prompts user to select a category and tests the menu structure.
 * 
 * @author Glen Halonen 
 * @version 10/11/12
 */
import java.util.Scanner;
public class WellnessMenu
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyramid");
        System.out.println("[E] Fitness Pyramid");
        System.out.print("Please enter A,B,C,D, or E: ");
        
        String option = in.next();
        
        System.out.println();
        System.out.println();
        System.out.println("///////////////////////////////");
        System.out.println();
        System.out.println();
        
        if(option.equalsIgnoreCase("A") ) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("You chose A for BMI");
        }
        
        else if(option.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            System.out.println("You chose B for BMR");
        }
        else if (option.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
            System.out.println("You chose C for Healthy Eating");
        }
        else if (option.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
            System.out.println("You chose D for Food Pyramid");
        }
        else if (option.equalsIgnoreCase("E") ) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
            System.out.println("You chose E for Fitness Pyramid");
        }
        else //default choice for an invalid entry
        {
            System.out.println("Sorry, the letter you entered is not in the menu!");
        }
        System.out.println();
    }
}