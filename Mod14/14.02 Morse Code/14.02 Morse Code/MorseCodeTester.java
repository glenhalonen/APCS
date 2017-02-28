
/**
 * Contains main method that calls on static methods of MorseCode. Gets user input than prints the 
 * message in morse code to the screen.
 * 
 * @author Glen Halonen
 * @version 02/21/2017
 */
import java.io.IOException;
import java.util.Scanner;
public class MorseCodeTester
{
    public static void main(String[ ] args) throws IOException
    {
        MorseCode.convertMessage(MorseCode.getMorseCode(), MorseCode.getUserInput());   
    }
}
