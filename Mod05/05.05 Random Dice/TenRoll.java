import java.util.Random;

/**
 * Write a description of class TenRoll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TenRoll
{
    public static int random1throughX(int x)
    {
       return new Random().nextInt(x) + 1; 
    }
    
    public static void main()
    {
        //roll dice 10 times
        for( int roll = 0; roll < 10; roll++ )
        {
            //for each roll, print value (1-6)
            System.out.println( "Dice = " + random1throughX(6) );
        }
        return;
    }
}
