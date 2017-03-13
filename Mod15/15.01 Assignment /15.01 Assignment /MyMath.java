
/**
 * MyMath is a subclass of Homework that contains the constructor for math.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public class MyMath extends Homework
{
    public MyMath()
    {
        super();
    }
    
    public void createAssignment( int p )
    {
        setPagesRead( 8 );
        setTypeHomework( "Math" );
    }
    
    
    public String toString()
    {
        return "Type of Homework: " + getTypeHomework() + " Pages to read: " + getPagesRead();
    }
}
