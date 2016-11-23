
/**
 * To determind the male to female ratio in China.
 * 
 * @author Glen Halonen 
 * @version (a version number or a date)
 * 1.06 MALE/FEMALE
 */
import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Ratio of males to females in China.\n Please input the total amount of people:");
        int totalPeople = in.nextInt();
        System.out.println();
        
        int male = 0;
        int female = 0;
        int x = 0;
        
        //repeat procedure until false
        while( x <= totalPeople)
        {
            double y = Math.random();
            
                if(y < 0.5146)
                {
                    System.out.println("M " + y);
                    male++;
                }
                else
                {
                    System.out.println("F " + y);
                    female++;
                }
            x++;
        }
        
        System.out.println("Male: " + male);
        System.out.println("Female: " + female);
    }
}