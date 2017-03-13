
/**
 * TestHomework is a tester class for all objects of type homework. 
 * 
 * @author Glen Halonen 
 * @version 03/12/2017
 */
import java.util.ArrayList;
public class TestHomework
{
    public static void main(String[] args)
    {
        ArrayList<Homework> homework = new ArrayList<Homework>();
        homework.add( new MyMath()    );
        homework.add( new MyScience() );
        homework.add( new MyEnglish() );
        homework.add( new MyJava()    );
        
        for (Homework h: homework)
        {
            h.createAssignment(1);
            System.out.println(h);
        }
    }
}
