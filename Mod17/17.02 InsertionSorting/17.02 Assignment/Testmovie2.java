
/**
 * TestMovie2 creates and sorts a list of objects of type Movie2. Contains a printMovies method to 
 * display results.
 * 
 * 
 * @author Glen Halonen 
 * @version 04/01/17
 */
public class Testmovie2
{
    public static void main(String args[])
    {
        Movie2[] movie = new Movie2[10];
        
        movie[0] = new Movie2("The Puppets Take Manhattan", 2001, "Columbia Tristar");
        movie[1] = new Movie2("Mulan Speacial Edition", 2004, "Disney");
        movie[2] = new Movie2("Shrek2", 2004, "Dreamworks");
        movie[3] = new Movie2("The Incredibles", 2004, "Pixar");
        movie[4] = new Movie2("Nanny McPhee", 2006, "Universal");
        movie[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
        movie[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
        movie[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
        movie[8] = new Movie2("Robots", 2005, "20th Century Fox");
        movie[9] = new Movie2("Monsters Inc.", 2001, "Pixar");
        
        System.out.println("Before Sorting:");
        printMovies(movie);
        System.out.println();
        
        System.out.println("Ascending by Title");
        printMovies(sortTitles(movie, 1));
        System.out.println();
        
        System.out.println("Descending By Years");
        printMovies(sortYears(movie, 2));
        System.out.println();
        
        System.out.println("Ascending By Studio");
        printMovies(sortStudios(movie, 1));
        System.out.println();
    }
    
    public static void printMovies(Movie2[] movie)
    {
        for(Movie2 m: movie)
        {
            m.toString();
        }
    }
    
    public static Movie2[] sortTitles(Movie2[] movie, int order)
    {
        Movie2[] dest = new Movie2[movie.length];
        for( int i = 0; i <  movie.length; i++)
        {
            Movie2 next = movie[i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0)
            {
                if( order == 1)
                {
                    if( next.getTitle().compareTo(dest[k-1].getTitle()) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k-1];
                    }
                }
                else
                {
                    if( next.getTitle().compareTo(dest[k-1].getTitle()) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k-1];
                    }
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
    
    public static Movie2[] sortYears(Movie2[] movie, int order)
    {
        Movie2[] dest = new Movie2[movie.length];
        for( int i = 0; i <  movie.length; i++)
        {
            Movie2 next = movie[i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0)
            {
                if( order == 1)
                {
                    if( next.getYear() - dest[k-1].getYear() > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k-1];
                    }
                }
                else
                {
                    if( next.getYear() - dest[k-1].getYear() < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k-1];
                    }
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
    
    public static Movie2[] sortStudios(Movie2[] movie, int order)
    {
        Movie2[] dest = new Movie2[movie.length];
        for( int i = 0; i <  movie.length; i++)
        {
            Movie2 next = movie[i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0)
            {
                if( order == 1)
                {
                    if( next.getStudio().compareTo(dest[k-1].getStudio()) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k-1];
                    }
                }
                else
                {
                    if( next.getStudio().compareTo(dest[k-1].getStudio()) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[k] = dest[k-1];
                    }
                }
                k--;
            }
            dest[insertIndex] = next;
        }
        return dest;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
