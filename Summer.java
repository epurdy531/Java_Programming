//Filename is Summer.java
//Written by Erica Peharda
//Written on August 18th, 2013

import java.util.*;
public class Summer
{
   public static void main(String[] args)
   {
      GregorianCalendar now = new GregorianCalendar();
      int dayOfYear;
      int daysLeft;
      dayOfYear = now.get(GregorianCalendar.DAY_OF_YEAR);      
      daysLeft = 365 - dayOfYear;
      System.out.println("There are " + daysLeft + 
         " days left in this year.");
      
      GregorianCalendar nextSummer = new GregorianCalendar(2014,5,21);
      int dayOfSummer = nextSummer.get(GregorianCalendar.DAY_OF_YEAR);
      System.out.println("There are " + dayOfSummer + 
         " days from January 1st, 2014 to June 21st, 2014.");
   }
   
}