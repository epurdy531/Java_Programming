//Filename is UseInsurance.java
//Written by Erica Peharda
//Written on November 8th, 2013

import javax.swing.*;
public class UseInsurance
{
   public static void main(String[] args)
   {
      String entry;
      int userChoice;
   
      entry = JOptionPane.showInputDialog(null,
         "Which type of insurance would you like?" + 
         "\nEnter 1 for Life or 2 for Health");
      userChoice = Integer.parseInt(entry);
      
      if(userChoice == 1)
      {
         Life myLife = new Life();
         myLife.display();
      }
      else
      {
         Health myHealth = new Health();
         myHealth.display();
      }
   }   
}