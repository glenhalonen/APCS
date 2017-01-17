
/**
 * Main class. Calculate the projectile motion of an object in terms of feet with intial velocity
 * and an angle of launch.
 * 
 * @author Glen Halonen 
 * @version Tuesday, January 17th
 */
public class CatapultTester
{
    public static void main(String[] args)
    {
        Catapult cat = new Catapult();
        
        Double[][] catapult = {  { 20.0, 20.0, 20.0, 20.0, 20.0, 20.0},
                                 { 25.0, 25.0, 25.0, 25.0, 25.0, 25.0}, 
                                 { 30.0, 30.0, 30.0, 30.0, 30.0, 30.0},
                                 { 35.0, 35.0, 35.0, 35.0, 35.0, 35.0},
                                 { 40.0, 40.0, 40.0, 40.0, 40.0, 40.0},
                                 { 45.0, 45.0, 45.0, 45.0, 45.0, 45.0},
                                 { 50.0, 50.0, 50.0, 50.0, 50.0, 50.0}, };
                                 
        Integer[] MPH = { 20, 25, 30, 35, 40, 45, 50,};
                                 
        cat.calcTrajectory(catapult);
        
        System.out.println("                  Projectile Distance (ft)               ");
        System.out.println("MPH   25 deg   30 deg   35 deg   40 deg   45 deg   50 deg");
        System.out.println("---------------------------------------------------------");

        cat.printScores(catapult, MPH);
    }
}
