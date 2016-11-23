
/**
 * The purpose of this program is to illustrate the 
 * 
 * �FLVS 2007
 * @author B. Jordan 
 * @version 03/28/2007
 */
import java.util.Scanner;
public class MathMenu
{
    public static void main(String [] args)
    {
        int answer;                                 //variable for answer to arithmetic calculations
        Scanner in = new Scanner(System.in);        //Scanner class object
        
        System.out.println("This program will perform arithmetic operations");
        System.out.println("on two numbers you enter.  Do not enter a 0, please.");
        System.out.println();
        System.out.print("Please enter two integers separated by a space: ");
        int num1 = in.nextInt();                    //first number entered
        int num2 = in.nextInt();                    //second number entered
        System.out.println();
        
        System.out.println("Select a letter that corresponds to a menu option");
        System.out.println("[A] Addition");
        System.out.println("[S] Subtraction");
        System.out.println("[M] Multiplication");
        System.out.println("[D] Division");
        System.out.println("[R] Remainder");
        System.out.println("[Q] Quit");
        System.out.print("Enter A, S, M, D, R, or Q: ");
        String choice = in.next();
        System.out.println();
        
        if(choice.equalsIgnoreCase("A"))                            //why isn't the equals() method used here?
        {                                                           //notice beginning brace for this block of code
            System.out.println("You chose A for addition");
            System.out.print(num1 + " plus " + num2 + " equals ");
            answer = num1 + num2;
            System.out.println(answer);
        }                                                           //notice the ending brace for this block of code
        if(choice.equalsIgnoreCase("S"))                            //why isn't the equals() method used here?
        {                                                           //notice beginning brace for this block of code
            System.out.println("You chose S for subtraction");
            System.out.print(num1 + " minus " + num2 + " equals ");
            answer = num1 - num2;
            System.out.println(answer);
        }
        if(choice.equalsIgnoreCase("M"))                            //why isn't the equals() method used here?
        {                                                           //notice beginning brace for this block of code
            System.out.println("You chose M for Multiplication");
            System.out.print(num1 + " times " + num2 + " equals ");
            answer = num1 * num2;
            System.out.println(answer);
        }
        if(choice.equalsIgnoreCase("D"))                            //why isn't the equals() method used here?
        {                                                           //notice beginning brace for this block of code
            System.out.println("You chose D for division");
            System.out.print(num1 + " divided by " + num2 + " equals ");
            answer = num1 / num2;
            System.out.println(answer);
        }    
        if(choice.equalsIgnoreCase("r"))                            //why isn't the equals() method used here?
        {                                                           //notice beginning brace for this block of code
            System.out.println("You chose R for remainder");
            System.out.print(num1 + " modulous " + num2 + " equals ");
            answer = num1 % num2;
            System.out.println(answer);
        }    
        if(choice.equalsIgnoreCase("q"))
        {
            System.out.println("Calculation canceled.");
        }
        else
        {
             System.out.println("You entered a letter that is not in the menu.");
        }
            
     }//end of main method
}//end of class
