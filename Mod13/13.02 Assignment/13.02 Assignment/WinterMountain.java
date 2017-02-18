
/**
 * Write a description of class WinterMountain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
