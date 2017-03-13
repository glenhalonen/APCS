
/**
 * TestHomework3 is the tester method for MyMath, MyScience, MyEnglish, and MyJava. This class
 * declares the objects and prints out the amount of homework before and after reading.
 * 
 * @author Glen Halonen 
 * @version 03/12/17
 */
import java.util.ArrayList;
public class TestHomework3
{
    public static void main(String[] args)
    {
        /*ArrayList<Homework3> homework = new ArrayList<Homework3>();
        
        homework.add( new MyMath3()    );
        homework.add( new MyScience3() );
        homework.add( new MyJava3()    );
        homework.add( new MyEnglish3() );
        */
        Homework3 [] homework = {new MyMath3(), new MyScience3(), new MyJava3(), new MyEnglish3()};
        int compare = 0;
        
        for (Homework3 h: homework)
        {
            h.createAssignment(1);
        }
        
        for (Homework3 h: homework)
        {
            System.out.println(h);
        }
        
        for (int i = 0; i < 4; i++)
        {
            
            for (int j = 1; j < 4; j++)
            {
                compare = homework[i].compareTo(homework[j]); 
                
                if (compare == 0)
                {
                    if(!homework[i].equals(homework[j])){
                        System.out.print("The homework for ");
                        System.out.println(homework[i].getTypeHomework() + " and " + homework[j].getTypeHomework() +
                        " are the same.");
                    }
                }
               
                j++;
            }    
        }
    }
}
