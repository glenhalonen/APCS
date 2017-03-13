
/**
 * MyJava3 is a subclass of Homework3 that contains a doReading method and a toString method.
 * 
 * @author Glen Halonen 
 * @version 03/12/17
 */
public class MyJava3 extends Homework3
{
    public MyJava3()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(7);
        setTypeHomework( "Java" );
    }
    
    public String toString()
    {
        return getTypeHomework() + " must read " + getPagesRead() + " pages.";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 3);
    }
}
