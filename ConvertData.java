//Filename is ConvertData.java
//Written by Erica Peharda
//Written on September 17th, 2013

import javax.swing.*;
import java.util.*;
public class ConvertData
{
   public static void main(String[] args)
   {
      String dateInput = "";
      String month = "";
      String day= "";
      String year = "";
      
      dateInput = JOptionPane.showInputDialog(null, 
         "Please enter a date in the format MM/DD/YYYY");
         
         
      if(dateInput.charAt(2) == '/')
         month = dateInput.substring(0,2);
      else if(dateInput.charAt(1) == '/')
         month = dateInput.substring(0,1);
         
      if(dateInput.charAt(5) == '/')
         day = dateInput.substring(3,5);
      else if(dateInput.charAt(4) == '/')
         day = dateInput.substring(2,4);
         
      if(dateInput.charAt(5) == '/')
         year = dateInput.substring(6,10);
      else if(dateInput.charAt(4) == '/')
         year = dateInput.substring(5,9);
       
      int intMonth = Integer.parseInt(month);
      int intDay = Integer.parseInt(day);
      int intYear = Integer.parseInt(year);
                
      while(intMonth > 12 || intMonth < 1)
      {
            JOptionPane.showMessageDialog(null,
            "You entered an invalid month.");
         dateInput = JOptionPane.showInputDialog(null,
            "Please enter a date in the format MM/DD/YYYY");
      }
      
      while(intDay > 31 || intDay < 1)
      {
         JOptionPane.showMessageDialog(null,
            "You entered an invalid day.");
         dateInput = JOptionPane.showInputDialog(null,
            "Please enter a date in the format MM/DD/YYYY");
      }
      
      GregorianCalendar date = new GregorianCalendar(intYear, intMonth, intDay);
      
      int dayOfYear = date.get(GregorianCalendar.DAY_OF_YEAR);
      
      String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
      
      int x = intMonth - 1;
      
      JOptionPane.showMessageDialog(null,
         "Date is " + monthName[x] + " " + intDay + ", " + intYear +
         "\nIt is the " + dayOfYear + " day of the year!");        
   }
}