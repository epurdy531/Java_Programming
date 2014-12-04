//this associates scanner obj. with system in!  it allows use of scanner class
import java.util.Scanner;
public class SetUpSite2
{
//this is the main method
   public static void main (String[] args)
   {
   //these are integer declarations
   final int FOUNDED_YEAR = 1977;
   int currentYear;
   int age;
   Scanner input = new Scanner (System.in);
   statementOfPhilosophy();
   //prompt for the current year
   System.out.print("Enter the current year as a four-digit number ");
   currentYear = input.nextInt();
   //this is a call to the method below that will recieve the founding & current years
   age = calculateAge(FOUNDED_YEAR, currentYear);
   System.out.println("Founded in " + FOUNDED_YEAR);
   System.out.println("Serving you for " + age + " years");
   }
   public static void statementOfPhilosophy()
   {
      System.out.println("Event Handlers Incorporated is");
      System.out.println("dedicated to making your event");
      System.out.println("a most memorable one.");
   }
   //these two int in parenthesis are same as FOUNDED_YEAR, current year...
   //but you can rename like they did here (as long as it's the same order)
   public static int calculateAge(int originYear, int currDate)
   {
      int years;
      years = currDate - originYear;
      return years;
   }
}