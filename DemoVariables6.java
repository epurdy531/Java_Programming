import java.util.Scanner;
public class DemoVariables6
{
   public static void main(String[] args)
   {
      double entry;
      double anotherEntry;
      Scanner keyBoard = new Scanner(System.in);
      System.out.print("Enter a double >>");
      entry = keyBoard.nextDouble();
      System.out.print("Enter another double >>");
      anotherEntry = keyBoard.nextDouble();
      System.out.print("The double is ");
      System.out.println(entry);
      System.out.print("The other double is ");
      System.out.println(anotherEntry);
      
      System.out.println(entry + " plus " + 
         anotherEntry + " is " + (entry + anotherEntry));
      System.out.println(entry + " minus " + 
         anotherEntry + " is " + (entry - anotherEntry));
      System.out.println(entry + " times " +
         anotherEntry + " is " + (entry * anotherEntry));
      System.out.println(entry + " divided by " +
         anotherEntry + " is " + (entry / anotherEntry));
      System.out.println("The remainder is " + 
         (entry % anotherEntry));
   }
}