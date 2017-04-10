/**
 * Movie2 contains the constructor for objects that are created in TestMovie3. Contains methods
 * that return and print information in each object.
 * 
 * @author Glen Halonen
 * @version 04/01/17
 */
public class Movie2
{
    private String title, studio;
    private int year;
    public Movie2(String title, int year, String studio)
    {
        this.title = title;
        this.studio = studio;
        this.year = year;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getStudio()
    {
        return studio;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String toString()
    {
        System.out.printf("%29s %10.4s %20s%n", title, year, studio);
        return "";
    }
}
