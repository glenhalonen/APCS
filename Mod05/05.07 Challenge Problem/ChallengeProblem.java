import java.util.Scanner;
import java.util.Random;
/**
 * Generate Passwords.
 * 
 * @author Glen Halonen
 * @version Sunday, October 30
 */
public class ChallengeProblem
{
    public static void printBanner()
    {
        System.out.println("Password Generator Menu");
        System.out.println("******************************************************");
        System.out.println("* [A] Lowercase                                      *");
        System.out.println("* [B] Lowercase and Numbers                          *");
        System.out.println("* [C] Lowercase, Uppercase, and Numbers              *");
        System.out.println("* [D] Lowercase, Uppercase, Numbers, and Punctuation *");
        System.out.println("* [Q] Quit                                           *");
        System.out.println("******************************************************");
    }
    
    public static void generateLowerCasePassword( int passwordLength )
    {
        Random randNum = new Random();
        String pass = "";
        for(int i = 0; i < passwordLength; i++)
        {
            int randPass = randNum.nextInt(26) + 97;
            char x = (char)randPass;
            pass += x;
        }
        System.out.println("Random password: " + pass);
        System.out.println();
    }
    
    public static void generateLowerNumberPassword(int passwordLength)
    {
        Random randNum = new Random();
        String pass = "";
        for (int i = 0; i < passwordLength;)
        {
            int randPass = randNum.nextInt(75) + 48;
            if((randPass >= 48 && randPass < 58) || (randPass >= 97 && randPass < 123))
            {
                char x = (char)randPass;
                pass += x;
                i++;
            }
        }
        System.out.println("Random password: " + pass);
        System.out.println();
    }
    
    public static void generateLowerUpperNumber(int passwordLength)
    {
        Random randNum = new Random();
        String pass = "";
        for (int i = 0; i < passwordLength;)
        {
            int randPass = randNum.nextInt(75) + 48;
            if((randPass >= 48 && randPass < 58) || (randPass >= 65 && randPass < 91) || (randPass >= 97 && randPass < 123))
            {
                char x = (char)randPass;
                pass += x;
                i++;
            }
        }
        System.out.println("Random password: " + pass);
        System.out.println();
    }
    
    public static void generateLowerUpperPunctuationNumbers(int passwordLength)
    {
        Random randNum = new Random();
        String pass = "";
        for (int i = 0; i < passwordLength;)
        {
            int randPass = randNum.nextInt(69) + 58;
            if((randPass >= 48 && randPass < 127))
            {
                char x = (char)randPass;
                pass += x;
                i++;
            }
        }
        System.out.println("Random password: " + pass);
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        printBanner();
        boolean done = false;
        
        while(!done)
        {
            System.out.print("Please enter a menu option: ");
            String option = in.next();
            System.out.println();
            
            if(option.equalsIgnoreCase("Q"))
            {   
                System.out.println("Password generator will quit now.");
                done = true;
            }
            else 
            {
                System.out.print("Password length: (at least 6) ");
                String passwordLength = in.next();
                int length = Integer.parseInt(passwordLength);
                if(option.equalsIgnoreCase("A"))
                {
                    generateLowerCasePassword( length ); 
                } 
                else if(option.equalsIgnoreCase("B"))
                {
                    generateLowerNumberPassword( length );
                }
                else if(option.equalsIgnoreCase("C"))
                {
                    generateLowerUpperNumber( length );
                }
                else if(option.equalsIgnoreCase("D"))
                {
                    generateLowerUpperPunctuationNumbers( length );
                }
                else
                {
                    System.out.println("The letter you entered is not in the menu. Please try again.");
                    printBanner();
                }
            }
        }
  }
}