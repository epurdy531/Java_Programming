//Course: CIS 263AA
//Section Number: 33254
//Filename is TryToParseString.java
//Written by Erica Peharda
//Written on November 8th, 2013

import javax.swing.*;
public class TryToParseString
{
   public static void main(String[] args)
   {
      String entry;
      int intEntry;
      
      try
      {
         entry = JOptionPane.showInputDialog(null,
            "Please enter an integer value >>");
         intEntry = Integer.parseInt(entry);
         JOptionPane.showMessageDialog(null,
            "Excellent!  Thank you for choosing: " + intEntry + "!");
      }
      
      catch(NumberFormatException mistake)
      {
         JOptionPane.showMessageDialog(null,
            "I'm sorry. \nYou have failed to enter an integer value.");
      }
      
   }
}