
/**
 * Write a description of class IntArray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntArray
{
    public static void main(String[] args)
    {
        int[] x; //zero is 1st slot
        
        x = new int[5];
        x[0] = 100;
        x[1] = 200;
        x[2] = 10;
        x[3] = 20;
        x[4] = 5;
        
        for( int i = 0; i < 5; i++ ) {
            System.out.println( "x[ " + i + " ] = " + x[i] );
        }
        
        for( int roll1 = 0; roll1 < 1000; roll1++ )
        {
            rollValue1 = randomBetween1And6();
            rollValue2 = randomBetween1And6();
            recordRollsInTable( rollValue1, rollValue2 );
        }
        return;
    }
}
