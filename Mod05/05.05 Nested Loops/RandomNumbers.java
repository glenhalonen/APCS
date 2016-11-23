
/**
 * Write a description of class Random here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.Scanner;
public class RandomNumbers
{
    public static void main(String[] args)
    {
   Scanner in = new Scanner(System.in);
   
   System.out.println("GENERATE RANDOM NUMBERS");
        System.out.println("Enter Range of Whole Integers. Lower space Higher. e.x.(100 200)");
   int lower = in.nextInt();
   int upper = in.nextInt();
   
   System.out.println("How many numbers?");
   double number = in.nextDouble();
   System.out.println("*****************************************");
   
   int randNum;
  
  Random randNumList = new Random();
  for(int n = 1; n <= number;)
  {   
      if(upper > 0)
      randNum = (int)(100000 * randNumList.nextDouble());
      else
      randNum = (int)(-100000 * randNumList.nextDouble());
      
      if(randNum <= upper && randNum >= lower) 
      {
      System.out.println(randNum + " ");
       n++;
    }
  }
 }
} 


