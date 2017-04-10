
/**
 * Contains the Student constructor with methods to return private instance variables.
 * 
 * @author Glen Halonen 
 * @version 3/25/17
 */
public class Student
{
    private int qz1, qz2, qz3, qz4, qz5;
    private String name;
    
    public Student(String name, int qz1, int qz2, int qz3, int qz4, int qz5)
    {
        this.name = name;
        this.qz1 = qz1;
        this.qz2 = qz2;
        this.qz3 = qz3;
        this.qz4 = qz4;
        this.qz5 = qz5;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name2)
    {
        name = name2;
    }
    
    public int getQuiz(int quizNumber)
    {
        if(quizNumber == 1){
            return qz1;
        }
        else if( quizNumber == 2){
            return qz2;
        }
        else if( quizNumber == 3){
            return qz3;
        }
        else if( quizNumber == 4){
            return qz4;
        }
        else {
            return qz5;
        }
    }
    
    public void setQuiz(int quizNumber, int score)
    {
        if(quizNumber == 1){
            qz1 = score;
        }
        else if( quizNumber == 2){
            qz2 = score;
        }
        else if( quizNumber == 3){
            qz3 = score;
        }
        else if( quizNumber == 4){
            qz4 = score;
        }
        else {
            qz5 = score;
        }   
    }
    
    public String toString()
    {
        System.out.println("Name: " + name + " Quiz: " + qz1 + " " + qz2 + " " + qz3 + " " + qz4 + " " + qz5);
        return "";
    }
}
