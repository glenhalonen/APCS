
/**
 * Homework3 is an abstract class that implements the Comparable t interface and contains the abstract
 * method createAssignment.
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
public abstract class Homework3 implements Comparable<Homework3>
{
    private int pagesRead;
    private String typeHomework;
    
    public Homework3()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    public int compareTo(Homework3 homework)
    {
        if (pagesRead > homework.pagesRead)
        {
            return 1;
        }
        else if (pagesRead == homework.pagesRead)
        {
            return 0;
        }
        else
        {
            return -1;
        }
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
    public boolean equals(Homework3 homework)
    {
        boolean type = false;
        if(typeHomework.equals( homework.typeHomework)){
            type = true;
        }
        return type;
    }
    public abstract void createAssignment(int p);
}
