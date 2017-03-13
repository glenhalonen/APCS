
/**
 * MyJava is a subclass of Homework that contains the constructor for java.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public class MyJava extends Homework
{
    public MyJava()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(3);
        setTypeHomework( "Java" );
    }
    
    public String toString()
    {
        return "Type of Homework: " + getTypeHomework() + " Pages to read: " + getPagesRead();
    }
}
