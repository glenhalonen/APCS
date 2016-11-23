
/**
 * Grades and averages.
 * 
 * @author Glen Halonen 
 * @version 9/17/16
 */
public class GradesV2
{
    public static void main(String[] args)
    {
        //local variables
        int numTest = 0;        //number of tests
        int testGrade = 0;      //individual test grade
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;   //average grade
        
        
        testGrade = 97;
        totalPoints += testGrade;
        numTest ++;
        System.out.print(" n = " + numTest);
        System.out.print(" Test grade = " + testGrade);
        System.out.print(" Total points = " + totalPoints);
        System.out.println(" Average grade = " + (double)totalPoints/numTest);
        
        testGrade = 79 ;
        totalPoints += testGrade;
        numTest ++;
        System.out.print(" n = " + numTest);
        System.out.print(" Test grade = " + testGrade);
        System.out.print(" Total points = " + totalPoints);
        System.out.println(" Average grade = " + (double)totalPoints/numTest);
        
        testGrade = 83;
        totalPoints += testGrade;
        numTest ++;
        System.out.print(" n = " + numTest);
        System.out.print(" Test grade = " + testGrade);
        System.out.print(" Total points = " + totalPoints);
        System.out.println(" Average grade = " + (double)totalPoints/numTest);
        
        testGrade = 88;
        totalPoints += testGrade;
        numTest ++;
        System.out.print(" n = " + numTest);
        System.out.print(" Test grade = " + testGrade);
        System.out.print(" Total points = " + totalPoints);
        System.out.println(" Average grade = " + (double)totalPoints/numTest);
        
    }    
}
