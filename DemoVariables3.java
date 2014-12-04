import java.util.Scanner;
public class DemoVariables3
{
   public static void main(String[] args)
   {
      int entry;
      int anotherEntry;
      Scanner keyBoard = new Scanner(System.in);
      System.out.print("Enter an integer >>");
      entry = keyBoard.nextInt();
      System.out.print("Enter another integer >>");
      anotherEntry = keyBoard.nextInt();
      System.out.print("The entry is ");
      System.out.println(entry);
      System.out.print("The other entry is ");
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