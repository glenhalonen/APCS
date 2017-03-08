
/**
 * Abstract class HomeWork - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Homework
{
   private int pagesRead;
   private String typeHomework;
    
    public Homework()
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
