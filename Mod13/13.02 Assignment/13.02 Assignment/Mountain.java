
/**
 * Inherits from Terrain to get it's own dimensions and has it's own parameter of mountains and it's own
 * toString() to return the charactoristics of mountain.
 * 
 * @author Glen Halonen 
 * @version 02/16/2017
 */
public class Mountain extends Terrain
{
    private int myMountains;
    
    public Mountain( int l, int w, int mountains)
    {
        super( l, w );
        myMountains = mountains;
    }
    
    public double getMountains()
    {
        return myMountains;
    }
    
    public String toString()
    {
        return "Mountain has dimensions: " + getWidth() + " X " + getLength()
                + " and " + getMountains() + " mountains";
    }
}
