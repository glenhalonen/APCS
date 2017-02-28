
/**
 * Contins main method which creates two objects from contructors Cube (in class Cube) and 
 * Rectangle (in class Rectangle). Prints dimensions to screen. 
 * 
 * @author Glen Halonen
 * @version 02/12/2017
 */
import java.util.ArrayList;
public class TestNew
{
    public static void main(String[] args)
    {
        ArrayList <Rectangle2> shape = new ArrayList <Rectangle2>();
 
        shape.add( new Rectangle2(5, 20)  );
        shape.add( new Box2(4, 4, 4)      );
        shape.add( new Box2(4, 10, 4)     );
        shape.add( new Cube2(4)           );
        
        Box2 x = (Box2) shape.get(1);
        System.out.println( x.equals( (Box2) shape.get(2) ));
        for(Rectangle2 s: shape)
        {
            showEffectBoth(s);
        }
    }
    
    static void showEffectBoth(Rectangle2 r)
    {
        System.out.println(r);
    }
}

