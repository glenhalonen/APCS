
/**
 * This program prints the ASCII characters that correspond to ASCII values, and
 * prints the ASCII values that correspond to specific ASCII characters.
 * 
 * Notice that (int) is used to cast a character literal to its corresponding ASCII value, and
 * that (char) is used to cast an ASCII value to its corresponding character literal.
 * 
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 */
public class ShowASCII
{
    public static void main(String[ ] args)
    {   
        //cast a character literal to its integer ASCII value
        System.out.println("The ASCII code for " + 'A' + " is " + (int)'A');
        System.out.println("The ASCII code for " + '9' + " is " + (int)'9');
        System.out.println();
        
        //cast an integer ASCII value to its corresponding character literal
        System.out.println("93 is the ASCII code for " + (char)93);
        System.out.println("173 is the ASCII code for " + (char)173);
        System.out.println();
        
        //cast a character literal to its integer ASCII value( my name)
        System.out.print("The ASCII code for " + 'G' + 'l' + 'e' + 'n' + " is ");
        System.out.print((int)'G' + " ");
        System.out.print((int)'l' + " ");
        System.out.print((int)'e' + " ");
        System.out.println((int)'n' + " ");
        
        //cast an integer ASCII value to its corresponding character literal (phone)
        System.out.println("810 is the ASCII code for " + (char)810);
        System.out.println("360 is the ASCII code for " + (char)360);
        System.out.println("5655 is the ASCII code for " + (char)5655);
        
        System.out.println('8' + '2');
        System.out.println("128" + "32");
        
        //83 101 110 100 32 121 111 117 114 32 116 101 97 99 104 101 114 32 
        //97 110 32 101 109 97 105 108 32 116 111 100 97 121
        
        System.out.print((char)83);
        System.out.print((char)101);
        System.out.print((char)110);
        System.out.print((char)100);
        System.out.print((char)32);
        System.out.print((char)121);
        System.out.print((char)111);
        System.out.print((char)117);
        System.out.print((char)114);
        System.out.print((char)32);
        System.out.print((char)116);
        System.out.print((char)101);
        System.out.print((char)97);
        System.out.print((char)99);
        System.out.print((char)104);
        System.out.print((char)101);
        System.out.print((char)114);
        System.out.print((char)32);
        System.out.print((char)97);
        System.out.print((char)110);
        System.out.print((char)32);
        System.out.print((char)101);
        System.out.print((char)109);
        System.out.print((char)97);
        System.out.print((char)105);
        System.out.print((char)108);
        System.out.print((char)32);
        System.out.print((char)116);
        System.out.print((char)111);
        System.out.print((char)100);
        System.out.print((char)97);
        System.out.print((char)121);
        
        String course = " heelooo ";
        System.out.print(course);

    }//end of main method
}//end of class
