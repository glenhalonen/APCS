
/**
 * Music contains the constructor Music which takes three parameters and typical getter methods and a toString method.
 * 
 * @author Glen Halonen
 * @version 04/09/17
 */
public class Music
{
    private String title, singer;
    private int year;
    
    public Music(String title, int year, String singer)
    {
        this.title = title;
        this.year = year;
        this.singer = singer;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getSinger()
    {
        return singer;
    }
    
    public String toString()
    {
        System.out.printf("%20s %7s %19s", title, year, singer);
        return "";
    }
}
