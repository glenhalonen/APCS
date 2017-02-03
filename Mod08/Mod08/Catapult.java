
/**
 * Methods for calculating the distance of a projectile from speed and angle of launch.
 * 
 * @author Glen Halonen 
 * @version Tuesday, January 17th
 */
public class Catapult
{
    static final double ROWS = 7;
    static final double COLS = 6;
    
    /**
     * Mutator method that changes the values in catapult to distance travled from angle and intial speed.
     * @param catapult 2d array contains intial velocities
     * 
     */
    public static void calcTrajectory(Double[][] catapult)
    {
        for(int row = 0; row < ROWS; row++)
        {
            int angle = 25;
            for(int col = 0; col < COLS; col++)
            {
                catapult[row][col] = (Math.pow(catapult[row][col], 2) * Math.sin(2 * angle* Math.PI/180)) / 32.174;
                angle += 5;
            }
        
        }
    }
    
    /**
     * Print method that prints out the values of catapult.
     * @param catapult the distance a projectile travels
     * @param MPH the intial velocity of the projectile
     */
    public static void printScores(Double[][] catapult, Integer[] MPH)
    {
        for(int row = 0; row < ROWS; row++)
        {
            System.out.print(MPH[row]);
            for(int col = 0 ; col < COLS; col++)
            {    
                System.out.printf("    %5.4s", catapult[row][col] + " ");
            }
            System.out.println();
        }
    }
}