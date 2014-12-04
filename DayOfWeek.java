//Filename is DayOfWeek.java
//Written by Erica Peharda
//Written on September 29th, 2013

import java.util.Scanner;
public class DayOfWeek
{
   enum Day {MON, TUES, WED, THURS, FRI, SAT, SUN};
   
   public static void main(String[] args)
   {
      Day DayOfWeek;
      String userEntry;
      
      Scanner input = new Scanner(System.in);
      System.out.println("The days are:");
      for(Day d : Day.values())
         System.out.print(d + " ");
         
      System.out.print("\n\nPlease choose a day of the week from the list by " +
         "\ntyping its abbreviation > ");
      userEntry = input.nextLine().toUpperCase();
      
      
      if(userEntry.equals("SUN"))
         System.out.print("You chose " + userEntry + ". \nStore hours are 11am - 5pm "
            + "on " + userEntry + ".");
      else if(userEntry.equals("MON") || userEntry.equals("TUES") || userEntry.equals("WED") 
            || userEntry.equals("THURS") || userEntry.equals("FRI"))
         System.out.print("You chose " + userEntry + ". \nStore hours are 9am - 9pm "
            + "on " + userEntry + ".");
      else if(userEntry.equals("SAT"))
         System.out.print("You chose " + userEntry + ". \nStore hours are 9am - 6pm "
            + "on " + userEntry + ".");
         
   
   }
}