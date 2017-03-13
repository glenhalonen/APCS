
/**
 * TestHomework2 creates an ArrayList of objects of type homework. It than prints out the amount of
 * reading done and the amount of homework left. 
 * 
 * @author Glen Halonen
 * @version 03/12/17
 */
import java.util.ArrayList;
public class TestHomework2
{
    public static void main(String[] args)
    {
        ArrayList<Homework2> homework = new ArrayList<Homework2>();
        
        homework.add( new MyMath2()     );
        homework.add( new MyScience2()  );
        homework.add( new MyEnglish2()  );
        homework.add( new MyJava2()     );
        
        for( Homework2 h: homework)
        {
            h.createAssignment(1);
            System.out.println("Before reading: \n" + h);
            h.doReading();
            System.out.println("After reading: \n" + h);
        }
    }
}
