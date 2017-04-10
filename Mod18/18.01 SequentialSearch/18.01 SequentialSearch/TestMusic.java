import java.util.ArrayList;
/**
 * TestMusic declares an ArrayList of objects of type Music. Methods in this class search the ArrayList
 * for the specified charactoristic than returns the result to the screen.
 * 
 * @author Glen Halonen 
 * @version 04/09/17
 */
public class TestMusic
{
    public static void main(String[] args)
    {
        ArrayList<Music> myMusic = new ArrayList<Music>();
        
        myMusic.add( new Music("Pieces of You", 1994, "Jewel") );
        myMusic.add( new Music("Jagged Little Pill", 1995, "Alanis Morissette") );
        myMusic.add( new Music("What If It's You", 1995, "Reba McEntire") );
        myMusic.add( new Music("Misunderstood", 2001, "Pink") );
        myMusic.add( new Music("Laundry Service", 2001, "Shakira") );
        myMusic.add( new Music("Take The Long Way", 2006, "Dixie Chicks") );
        myMusic.add( new Music("Under My Skin", 2004, "Avril Lavigne") );
        myMusic.add( new Music("Let Go", 2002, "Avril Lavigne") );
        myMusic.add( new Music("Let It Go", 2007, "Tim McGraw") );
        myMusic.add( new Music("White Flag", 2004, "Dido") );
        
        searchTitle(myMusic, "Let Go");
        searchTitle(myMusic, "Some Day");
        searchYear(myMusic, 2001);
        searchYear(myMusic, 2003);
        searchSinger(myMusic, "Avril Lavigne");
        searchSinger(myMusic, "Tony Curtis");
    }
    
    public static void printMusic(ArrayList myMusic){
        for(int i = 0; i < myMusic.size(); i++){
            myMusic.get(i).toString();
        }
    }
    
    public static void searchTitle(ArrayList<Music> myMusic, String title)
    {
        int found = -1;
        for(int i = 0; i < myMusic.size(); i++){
            if(myMusic.get(i).getTitle().equals(title)){
                found = i;
                break;
            }
        }
        
        if(found != -1){
            System.out.println("Found " + title + " in music list.");
            System.out.println(myMusic.get(found));
        }
        else{
            System.out.println(title + " is not in the list.");
        }
    }
    
    public static void searchYear(ArrayList<Music> myMusic, int year)
    {
        int notFound = 0;
        for(int i = 0; i < myMusic.size(); i++){
            if(myMusic.get(i).getYear() - year == 0){
                myMusic.get(i).toString();
                System.out.println();
                notFound = 1;
            }
        }
        if(notFound == 0){
            System.out.println("There are no songs from " + year);
        }
    }
    
    public static void searchSinger(ArrayList<Music> myMusic, String singer)
    {
        int notFound = 0;
        for(int i = 0; i < myMusic.size(); i++){
            if(myMusic.get(i).getSinger().equals(singer)){
                myMusic.get(i).toString();
                System.out.println();
                notFound = 1;
            }
        }
        if(notFound == 0){
            System.out.println("There are no singers with the name " + singer);
        }
    }
}
