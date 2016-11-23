
/**
 * Overdue book charges
 * 
 * @author Glen Halonen 
 * @version 10/1/2016
 */
import java.util.Scanner;
public class Mona
{
  public static void main(String[] args)
  {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Please enter the name. (last, first): ");
      String lastName = in.next();
      String firstName = in.nextLine();
      System.out.println();
      
      System.out.print("Please enter the phone number (xxx) xxx - xxxx:  ");
      String phoneNumber  = in.nextLine();
      System.out.println();
      
      System.out.print("Enter the title of the book : ");
      String book = in.nextLine();
      System.out.println();
      
      System.out.print("Enter the date checked out mm/dd/yyyy: ");
      String dateCheckedOut = in.nextLine();
      System.out.println();
      
      System.out.print("Days late: ");
      String daysLate = in.next();
      
      System.out.print("Daily fine: ");
      String dailyFine = in.next();
      System.out.println();
      System.out.println();
      
      System.out.println("*****************Text for email message*****************");
      System.out.println();
      System.out.println();
      
      System.out.println("To: " + firstName + " " + lastName + " ("+ firstName + "@brightonk12.com)");
      System.out.println();
      System.out.println("From : Mona (mona@brightonk12.com)");
      System.out.println();
      System.out.println("Subject: Overdue Book Notice");
      
      System.out.println("===============================================================");
      
      System.out.println(book + " was checked out on: " + dateCheckedOut);
      
      System.out.println("This book is currently " + daysLate + " day(s) late.");
      
      int lateDays = Integer.parseInt(daysLate);
      double fineDaily = Double.parseDouble(dailyFine);
      
      Double overdueFine = fineDaily * lateDays;
      System.out.println("Your fine has accumulated to: " + overdueFine + " dollar(s).");
      
      
      
    }
    
    
    
}

