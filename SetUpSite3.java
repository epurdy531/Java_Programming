import java.util.Scanner;
public class SetUpSite3
{

   public static void main (String[] args)
   {
      final int FOUNDED_YEAR = 1977;
      int currentYear;
      int age;
      Scanner input = new Scanner (System.in);
      //added a statement that declares and allocates emeory for new EventSite
      //objected named 'oneSite'
      EventSite oneSite = new EventSite();
      //added an integer
      int siteNum;
      statementOfPhilosophy();
      System.out.print("Enter the current year as a four-digit number ");
      currentYear = input.nextInt();
      //prompt and recieve the site number
      System.out.print("Enter the event site number ");
      siteNum = input.nextInt();
      //call the method setSiteNumber() to set the site number for oneSite
      oneSite.setSiteNumber(siteNum);
      age = calculateAge(FOUNDED_YEAR, currentYear);
      System.out.println("Founded in " + FOUNDED_YEAR);
      System.out.println("Serving you for " + age + " years");
      //display site number
      System.out.println("The site number is " + oneSite.getSiteNumber());
   }
   public static void statementOfPhilosophy()
   {
      System.out.println("Event Handlers Incorporated is");
      System.out.println("dedicated to making your event");
      System.out.println("a most memorable one.");
   }
   
   public static int calculateAge(int originYear, int currDate)
   {
      int years;
      years = currDate - originYear;
      return years;
   }
}