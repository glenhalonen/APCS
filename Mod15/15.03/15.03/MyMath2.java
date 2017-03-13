
/**
 * MyMath2 is a subclass of Homework that contains a toString method and a doReading method.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public class MyMath2 extends Homework2
{
    public MyMath2()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(3);
        setTypeHomework( "Math" );
    }
    
    public String toString()
    {
        return getTypeHomework() + " must read " + getPagesRead() + " pages.";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 2);
    }
}
