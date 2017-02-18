
/**
 * Contains the methods and constructor for RecursivePalindromeTester. Mutates user input and 
 * decides if the phrase is a palindrome.
 * 
 * @author Glen Halonen 
 * @version Tuesday, February 7th
 */
public class RecursivePalindrome
{
    RecursivePalindrome()
    {

    }
    
    public int isPalindrome(String pal)
    {
        int x = 0;
                    
        if(pal.length() == 1)
        {
            x = 1;
        }
        else if(pal.length() == 0)
        {
            x = 1;
        }
        else if(pal.substring(0, 1).equalsIgnoreCase(pal.substring(pal.length() - 1)))
        {
            String removed = pal.substring(1, pal.length() - 1);
            return isPalindrome(removed);
        }
        
        return x;
        
    }
    
    public String manipulate(String input)
    {
        String noExc, noComma, absNoSpace = "";
       
        absNoSpace = input.replaceAll(" ",  "");
        noComma = absNoSpace.replaceAll(",", "");
        noExc = noComma.replaceAll("!", "");
        
        return noExc;
    }
    
}
