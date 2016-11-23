
/**
 * Convert text messages to street code
 * 
 * @author Glen Halonen 
 * @version 9/28/2016
 */
import java.util.Scanner;
public class TestMessageV2
{
         public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter message to be converted, that is all lowercase, and has at least 79 charactors");
        String formalText = in.next();
        formalText += in.nextLine();
      
        int lengthOriginal = formalText.length();
        System.out.println("Original Message");
        System.out.println(formalText);
        System.out.println("Message length = " + lengthOriginal + " charactors");
        System.out.println();
        
        String laughLong = formalText.substring(6,23);
        String laughShort = "lol";
        String lolLaugh = formalText.replace(laughLong,laughShort);
        
        String seeYouLong = formalText.substring(25,37);
        String seeYouShort = "cys";
        String seeYouSoon = lolLaugh.replace(seeYouLong, seeYouShort);
        
        String gotToLong = formalText.substring(39,48);
        String gotToShort = "gtg";
        String gotToGo = seeYouSoon.replace(gotToLong, gotToShort);
        
        String byTheLong = formalText.substring(50,60);
        String byTheShort = "btw";
        String byTheWay = gotToGo.replace(byTheLong, byTheShort);
        
        String whyYouLong = formalText.substring(62, 79);
        String whyYouShort = "wryt";
        String whyAreYou = byTheWay.replace(whyYouLong, whyYouShort);
        
        
        System.out.println("New Message");
        System.out.println(whyAreYou);
        int lengthNew = whyAreYou.length();
        System.out.println("Message length = " + lengthNew + " charactors");
        System.out.println();
        
        System.out.println("String method samples:");
        
        int bIsHere = whyAreYou.indexOf(byTheShort);
        System.out.println("IndexOf \"b\":                              " + bIsHere);

        String firstThird = whyAreYou.substring(0,12) ;
        System.out.println("substring (two parameters) first third:   " + firstThird);
        
        String lastThird = whyAreYou.substring(23,32);
        System.out.println("substring (one parameter) last third:     " + lastThird);
        
        String removedLetters = whyAreYou.replaceAll("[ysgo]","");
        System.out.println("repllacAll ysgo's:                        " + removedLetters);
    }
}

    



