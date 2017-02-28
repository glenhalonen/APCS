
/**
 * Inherits from Mountain to get mountains and dimensions. Contains it's own toString() to return the
 * charactoristics to return it terrain.
 * 
 * @author Glen Halonen
 * @version 02/19/2017
 */
public class WinterMountain extends Mountain
{
    private int myTemperature;
    
    public WinterMountain(int l, int w, int mountain, int temp)
    {
        super( l, w, mountain);
        myTemperature = temp;
    }
    
    public double getTemperature()
    {
        return myTemperature;
    }
    
    public String toString()
    {
        return "Winter Mountian has dimensions: " + getWidth() + " X " + getLength()
               + ", " + getMountains() + " mountains, " + " and the temperature is " + getTemperature();
    }
}
