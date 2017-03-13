
/**
 * Homework2 is the superclass for MyScience2, MyMath2, MyJava2, and MyEnglish2. This class implements
 * Processing.
 * 
 * @author Glen halonen
 * @version 03/12/17
 */
public abstract class Homework2 implements Processing
{
    private int pagesRead;
    private String typeHomework;
    
    public Homework2()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    public int getPagesRead()
    {
        return pagesRead;
    }
    public void setPagesRead(int pages)
    {
        pagesRead = pages;
    }
    public String getTypeHomework()
    {
        return typeHomework;
    }
    public void setTypeHomework(String H)
    {
        typeHomework = H;
    }
    public abstract void createAssignment(int p);
}
