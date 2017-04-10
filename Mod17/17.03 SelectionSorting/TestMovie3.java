
/**
 * TestMovie3 has an array of objects of type Movie2 that is sorted according to title, studio, and 
 * the year it was released.
 * 
 * @author Glen Halonen
 * @version 02/04/17
 */
public class TestMovie3
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
        
        System.out.println("Before Sorting:");
        printMovies(movie);
        System.out.println();
        
        System.out.println("Ascending Order by Title:");
        printMovies(sortTitles(movie, 1));
        System.out.println();
        
        System.out.println("Descending Order by Year:");
        printMovies(sortYears(movie, 2));
        System.out.println();
        
        System.out.println("Ascending Order by Studio:");
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
        int i;
        int k;
        int posmax;
        Movie2 temp;
        for( i = movie.length - 1; i >= 0; i--)
        {
            posmax = 0;
            for( k = 0; k <= i; k++)
            {
                if( order == 2 )
                {
                    if( movie[posmax].getTitle().compareTo(movie[k].getTitle()) > 0 )
                    {
                        posmax = k;
                    }
                }
                else
                {
                    if( movie[posmax].getTitle().compareTo(movie[k].getTitle()) < 0 )
                    {
                        posmax = k;
                    }
                }
            }
            temp = movie[i];
            movie[i] = movie[posmax];
            movie[posmax] = temp;
        }
        return movie;
    }

    public static Movie2[] sortYears(Movie2[] movie, int order)
    {
        int i;
        int k;
        int posmax;
        Movie2 temp;
        for( i = movie.length - 1; i >= 0; i--)
        {
            posmax = 0;
            for( k = 0; k <= i; k++)
            {
                if( order == 2 )
                {
                    if( movie[posmax].getYear() - movie[k].getYear() > 0 )
                    {
                        posmax = k;
                    }
                }
                else
                {
                    if( movie[posmax].getYear() - movie[k].getYear() < 0 )
                    {
                        posmax = k;
                    }
                }
            }
            temp = movie[i];
            movie[i] = movie[posmax];
            movie[posmax] = temp;
        }
        return movie;
    }
    
    public static Movie2[] sortStudios(Movie2[] movie, int order)
    {
        int i;
        int k;
        int posmax;
        Movie2 temp;
        for( i = movie.length - 1; i >= 0; i--)
        {
            posmax = 0;
            for( k = 0; k <= i; k++)
            {
                if( order == 2 )
                {
                    if( movie[posmax].getStudio().compareTo(movie[k].getStudio()) > 0 )
                    {
                        posmax = k;
                    }
                }
                else
                {
                    if( movie[posmax].getStudio().compareTo(movie[k].getStudio()) < 0 )
                    {
                        posmax = k;
                    }
                }
            }
            temp = movie[i];
            movie[i] = movie[posmax];
            movie[posmax] = temp;
        }
        return movie;
    }
}
