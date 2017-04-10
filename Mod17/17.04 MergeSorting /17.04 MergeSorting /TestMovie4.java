
/**
 * Write a description of class TestMovie4 here.
 * 
 * @author Glen Halonen 
 * @version 04/05/17
 */
public class TestMovie4
{
    public static void main(String[] args)
    {
        Movie2[] movie = new Movie2[10];
        
        movie[0] = new Movie2("The Puppets Take Manhattan", 2001, "Columbia Tristar");
        movie[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
        movie[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
        movie[3] = new Movie2("The Incredibles", 2004, "Pixar");
        movie[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        movie[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        movie[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        movie[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        movie[8] = new Movie2("Robots", 2005, "20th Century Fox");
        movie[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
        sortTitles(movie, 0, 2);
        printMovies(movie);
    }
    
    public static void printMovies(Movie2[] movie)
    {
        for(Movie2 m: movie)
        {
            m.toString();
        }
    }
    
    public static void sortTitles(Movie2[] movie, int low, int high)
    {
        if(low == high)
            return;
        
        int mid = (low + high)/2;
        sortTitles(movie, low, mid);
        sortTitles(movie, mid + 1, high);
            
        mergeTitles(movie, low, mid, high);
    }
    
    public static void mergeTitles(Movie2[] movie, int low, int mid, int high)
    {
        Movie2[] temp = new Movie2[high - low + 1];
        
        int i = low, j = mid + 1, n = 0;
        
        while( i <= mid || j <= high)
        {
            if( i > mid )
            {
                temp[n] = movie[j];
                j++;
            }
            else if(j > high)
            {
                temp[n] = movie[i];
                i++;
            }
            else if(movie[i].getTitle().compareTo(movie[j].getTitle()) < 0)
            {
                temp[n] = movie[j];
                j++;
            }
            else
            {
                temp[n] = movie[i];
                i++;
            }
        }
        
        for(int k = low; k <= high; k++)
        {
            movie[k] = temp[k - low];
        }
    }
}
