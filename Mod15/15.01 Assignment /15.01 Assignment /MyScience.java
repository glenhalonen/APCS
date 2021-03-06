
/**
 * MyScience is a subclass of Homework that contains the constructor for science.
 * 
 * @author Glen Halonen 
 * @version 03/12/17
 */
public class MyScience extends Homework
{
    public MyScience()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(3);
        setTypeHomework( "Science" );
    }
    
    public String toString()
    {
        return "Type of Homework: " + getTypeHomework() + " Pages to read: " + getPagesRead();
    }
}
