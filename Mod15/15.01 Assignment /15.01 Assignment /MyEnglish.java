
/**
 * MyEnglish is a subclass of Homework that contains the constructor for english.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public class MyEnglish extends Homework
{
    public MyEnglish()
    {
        super();
    }
    
    public void createAssignment(int p)
    {
        setPagesRead(9);
        setTypeHomework( "English" );
    }
    
    public String toString()
    {
        return "Type of Homework: " + getTypeHomework() + " Pages to read: " + getPagesRead();
    }
}
