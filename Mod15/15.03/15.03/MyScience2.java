
/**
 * MyScience2 is a subclass of Homework that contains a toString method and a doReading method.
 * 
 * @author Glen Halonen 
 * @version 03/12/17
 */
public class MyScience2 extends Homework2
{
     public MyScience2()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(7);
        setTypeHomework( "Science" );
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
