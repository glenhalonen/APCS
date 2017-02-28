
/**
 * Contains main method that calls on CaesarShiftEncryption class. Encrypts or Decrypts messages based on the shift
 * of the users choice.
 * 
 * @author Glen Halonen
 * @version 02/26/2017
 */
public class CaesarShiftTester
{
   public static void main(String[] args)
   {
       
       //get user to choose encrypt or decrypt
       String aOrB = CaesarShiftEncryption.userChoice();
       
       //get the message or the encription
       CaesarShiftEncryption.getUserInput(aOrB);
       
       //manipulate input
       CaesarShiftEncryption.useableInput();
       System.out.println();
       //decide what we want to do
       
       if(aOrB.equalsIgnoreCase("A"))
       {
           CaesarShiftEncryption.encryptMessage();
       }
       else
       {
           CaesarShiftEncryption.decryptMessage();//run code for decryption
       }
       
   }
}
