
/**
 * Abstract class HomeWork that delcares methods to be used by subclasses. Includes one abstract method
 * createAssignment which must be overwritten in each subclass.
 * 
 * @author Glen Halonen
 * @version 03/12/17
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
