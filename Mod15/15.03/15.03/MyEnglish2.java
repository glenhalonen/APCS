
/**
 * MyEnglish2 is a subclass of Homework that contains a toString method and a doReading method.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public class MyEnglish2 extends Homework2
{
     public MyEnglish2()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(1);
        setTypeHomework( "English" );
    }
    
    public String toString()
    {
        return getTypeHomework() + " must read " + getPagesRead() + " pages.";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 1);
    }
}
