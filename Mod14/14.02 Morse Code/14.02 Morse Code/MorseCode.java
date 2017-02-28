
/**
 * Contains MorseCode class that is called on in the main method of MorseCodeTester. Methods
 * import file and convert message to morse code.
 * 
 * @author Glen Halonen 
 * @version 02/21/2017
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
public class MorseCode
{
    public static ArrayList getMorseCode() throws IOException
    {
        Scanner inFile = new Scanner( new File("morsecode.txt"));
        ArrayList<String> morse = new ArrayList<String>();
       
        while(inFile.hasNext())
        {
            morse.add( inFile.next());
        }
        
        return morse;
    }
    
    public static String getUserInput()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a message without punctuation");
        String input = in.nextLine();
        String inputLCase = input.toLowerCase();
        
        return inputLCase;
    }
    
    public static void convertMessage( ArrayList m, String s)
    {
        ArrayList<Character> userChar = new ArrayList<Character>();
        String noSpace = s.replaceAll(" ", "");
        for(int i = 0; i < noSpace.length(); i++)
        {
            userChar.add( noSpace.charAt(i));
        }
        
        for(int i = 0; i < userChar.size(); i++)
        {
            int ascii = (int)userChar.get(i);
            System.out.println(m.get(ascii - 97));
        }
    }
}
