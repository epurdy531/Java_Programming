//Filename is Life.java
//Written by Erica Peharda
//Written on November 7th, 2013

import javax.swing.*;
public class Health extends Insurance
{
   public Health()
   {
      super("Health");
   }
   public void setCost()
   {
      monthPrice = 196;     
   }
   public double getCost()
   {
      return monthPrice;
   }

   
   public void display()
   {
      setCost();
      JOptionPane.showMessageDialog(null,
         "The type of insurance is: " + insuranceType +
         "\nThe cost per month is: $" + getCost()); 
   }
}