
/**
 * Main class that contains an ArrayList of students with quiz scores. Methods manipulate the list
 * of students.
 * 
 * @author Glen Halonen 
 * @version 3/25/17
 */
import java.util.ArrayList;
public class TestStudent
{
    public static void main(String[] args)
    {
        ArrayList<Student> myClass = new ArrayList<Student>();
        
        myClass.add( new Student("Mark Kennedy", 70, 80, 90, 100, 90)  );
        myClass.add( new Student("Max Gerard", 80, 85, 90, 85, 80 )    );
        myClass.add( new Student("Jean Smith", 50, 79, 89, 99, 100)    );
        myClass.add( new Student("Betty Farm", 85, 80, 85, 88, 89)     );
        myClass.add( new Student("Dilbert Gamma", 70, 70, 90, 70, 80)  );
        
        printBook(myClass);
        System.out.println();
        
        System.out.println("Changing Betty to Betty Boop");
        System.out.println();
        replaceStudent(myClass, "Betty Farm", "Betty Boop");
        printBook(myClass);
        System.out.println();
        
        System.out.println("Changing Jean's quiz 1 score to 80");
        System.out.println();
        replaceQuiz(myClass, "Jean Smith", 1, 80);
        printBook(myClass);
        System.out.println();
        
        System.out.println("Replacing Dilbert with Mike Kappa.");
        System.out.println();
        replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        printBook(myClass);
        System.out.println();
        
        System.out.println("Inserting Lily Mu before Betty.");
        System.out.println();
        insertStudent(myClass, "Betty Boop", "Lily Mu", 85, 95, 70, 0, 100);
        printBook(myClass);
        System.out.println();
        
        System.out.print("Deleting Max Gerard");
        System.out.println();
        deleteStudent(myClass, "Max Gerard");
        printBook(myClass);
        System.out.println();
        
    }
    
    public static void printBook(ArrayList<Student> stud)
    {
        System.out.printf("%16s %5s %5s %5s %5s %5s", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println();
        System.out.println("-------------------------------------------------");
        for(int i = 0; i < stud.size(); i++)
        {
            if(stud.get(i) != null){
                System.out.printf("%15s: %5s %5s %5s %5s %5s%n", stud.get(i).getName(), 
                                            stud.get(i).getQuiz(1), stud.get(i).getQuiz(2),
                                            stud.get(i).getQuiz(3), stud.get(i).getQuiz(4),
                                            stud.get(i).getQuiz(5));
            }
        }
    }
    
    public static void replaceStudent(ArrayList<Student> stud, String old, String knew)
    {
        for(int i = 0; i < stud.size(); i++){
            if(stud.get(i).getName().equals(old)){
                stud.get(i).setName(knew);
            }
        }
    }
    
    public static void replaceQuiz(ArrayList<Student> stud, String name, int quizNum, int quizVal)
    {
        for( int i = 0; i < stud.size(); i++)
        {
            if( stud.get(i).getName().equals(name) ){
                stud.get(i).setQuiz(quizNum, quizVal);
            }
        }
    }
    
    public static void replaceStudent(ArrayList<Student> stud, String old, String knew, 
                                      int Q1, int Q2, int Q3, int Q4, int Q5)
    {
        for( int i = 0; i < stud.size(); i++)
        {
            if( stud.get(i).getName().equals(old)){
                stud.get(i).setName(knew);
                
                stud.get(i).setQuiz(1, Q1);
                stud.get(i).setQuiz(2, Q2);
                stud.get(i).setQuiz(3, Q3);
                stud.get(i).setQuiz(4, Q4);
                stud.get(i).setQuiz(5, Q5);
            }
        }
    }
    
    public static void insertStudent(ArrayList<Student> stud, String old, String knew, 
                                      int Q1, int Q2, int Q3, int Q4, int Q5)
    {
        int position = 0;
        for( int i = 0; i < stud.size(); i++)
        {
            if( stud.get(i).getName().equals(old)){
                position = i;
            }
        }
        
        for( int i = position; i < stud.size() - 1; i++)
        {
            stud.get(i + 1).setName( stud.get(i).getName() );
            for( int j = 1; j < 6; j++)
            {
                stud.get(i + 1).setQuiz( j, stud.get(i).getQuiz(j) );
            }
        }
        stud.get(position).setName(knew);
        stud.get(position).setQuiz(1, Q1);
        stud.get(position).setQuiz(2, Q2);
        stud.get(position).setQuiz(3, Q3);
        stud.get(position).setQuiz(4, Q4);
        stud.get(position).setQuiz(5, Q5);
    }
    
    public static void deleteStudent(ArrayList<Student> stud, String old)
    {
        int position = 0;
        for(int i = 0; i < stud.size(); i++)
        {
            if(stud.get(i).getName().equals(old)){
                stud.remove(i);
            }
        }
    }
}
