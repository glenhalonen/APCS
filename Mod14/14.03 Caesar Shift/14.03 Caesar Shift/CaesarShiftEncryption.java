
/**
 * Contains methods that encrypts or derypts a message based on a Caesar Shift of the users choice.
 * 
 * @author Glen Halonen 
 * @version 02/26/17
 */
import java.util.Scanner;
import java.util.ArrayList;
import static java.util.Arrays.asList;
public class CaesarShiftEncryption
{
    private static final ArrayList<String> alphabet = new ArrayList<String>(asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
                        "k", "l","m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    public static ArrayList<String> alphabetShift = new ArrayList<String>();    
    public static ArrayList<String> messages = new ArrayList<String>();
                                               
    public CaesarShiftEncryption()
    {
        
    }
    
    public static String userChoice()
    {
        int again = 1;
        String choice = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a Caesar Shift number 0 - 25");
        int shift = in.nextInt();
        int j = shift;
        for(int i = 0; i < shift; i++)
        {
            alphabetShift.add( alphabet.get(alphabet.size() - j));
            j--;
        }
        
        for(int k = 0; k < alphabet.size(); k++)
        {
            alphabetShift.add( alphabet.get(k));
        }
        
        for(int l = 0; l < shift; l++)
        {
            alphabetShift.remove( (alphabet.size() + shift - 1) - l);
        }
        
        for(int i = 0; i < alphabetShift.size(); i++)
        {
            System.out.println(alphabetShift.get(i));
        }
        
        while( again == 1 )
        {
            System.out.println( "Please Select An Option." );
            System.out.println( "\"A\" for Encryption" );
            System.out.println( "\"B\" for Decryption" );
            choice = in.next();
            
            if(choice.equalsIgnoreCase("A") || choice.equalsIgnoreCase("B"))
            {
                again = 0;
            }
        }
        System.out.println();
        return choice;
    }
    
    public static ArrayList getUserInput(String L)
    {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        if(L.equalsIgnoreCase("A"))
        {
            int quit = 0;
            
            while( quit != 3 )
            {
                System.out.println("Enter a message without punctuation: ");
                messages.add(in.nextLine());
                System.out.println();
                System.out.println("Enter 3 to stop entering messages. Enter any other integer to continue");
                quit = in2.nextInt();
            }
        }
        else if(L.equalsIgnoreCase("B"))
        {
            int quit = 0;
            
            while( quit != 3 )
            {
                System.out.println("Enter encypted message without punctuation: ");
                messages.add(in.nextLine());
                System.out.println();
                System.out.println("Enter 3 to stop entering messages. Enter any other integer to continue");
                quit = in2.nextInt();
            }
        }
        else
        {
            System.out.println("Please try again");
        }
        return messages;
    }
    
    public static ArrayList useableInput()
    {
        for(int i = 0; i < messages.size(); i++)
        {
            messages.set(   i, messages.get(i).toLowerCase()         );
            messages.set(   i, messages.get(i).replaceAll(" ", "")   );
            /*String Lower = U.toLowerCase();
            String noSpaceOrUpper = Lower.replaceAll(" ","");
            System.out.println(noSpaceOrUpper);
            return noSpaceOrUpper;
            */
        }
        return messages;
    }
    
    public static void encryptMessage()
    {
        System.out.println("Encrypted messages are:");
        for(int i = 0; i < messages.size(); i++)
        {
            int letters = messages.get(i).length();
            for(int j = 0; j < letters; j++)
            {
                String find = messages.get(i).substring(j, j + 1);
                int index = alphabet.indexOf(find);
                System.out.print(alphabetShift.get(index));
            }
            System.out.println();
        }
    }
    
    public static void decryptMessage()
    {
        System.out.println("Decrypted messages are:");
        for(int i = 0; i < messages.size(); i++)
        {
            int letters = messages.get(i).length();
            for(int j = 0; j < letters; j++)
            {
                String find = messages.get(i).substring(j, j + 1);
                int index = alphabetShift.indexOf(find);
                System.out.print(alphabet.get(index));
            }
            System.out.println();
        }
    }
}
