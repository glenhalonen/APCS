
/**
 * Write a description of class TestTerrain here.
 * 
 * @author Glen Halonen 
 * @version 02/16/2017
 */
import java.util.ArrayList;
public class TestTerrain
{
    public static void main(String[] args)
    {
        ArrayList<Terrain> terr = new ArrayList<Terrain>();
        
        terr.add( new Forest( 1000, 5000, 1776));
        terr.add( new Mountain( 100, 100, 3));
        terr.add( new WinterMountain( 321, 556, 10, 19));
        
        for( Terrain t: terr )
        {
            System.out.println(t);
        }
    }
}
