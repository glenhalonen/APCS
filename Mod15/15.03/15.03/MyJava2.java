
/**
 * MyJava2 is a subclass of Homework that contains a toString method and a doReading method.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public class MyJava2 extends Homework2
{
    public MyJava2()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(5);
        setTypeHomework( "Java" );
    }
    
    public String toString()
    {
        return getTypeHomework() + " must read " + getPagesRead() + " pages.";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 4);
    }
}
