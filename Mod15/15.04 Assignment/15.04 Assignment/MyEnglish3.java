
/**
 * MyEnglish3 is a subclass of Homework3 that contains a doReading method and a toString method.
 * 
 * @author Glen Halonen 
 * @version 03/12/17
 */
public class MyEnglish3 extends Homework3
{
    public MyEnglish3()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(3);
        setTypeHomework( "English" );
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
