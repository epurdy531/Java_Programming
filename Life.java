//Filename is Life.java
//Written by Erica Peharda
//Written on November 7th, 2013

import javax.swing.*;
public class Life extends Insurance
{ 
   public Life()
   {
      super("Life");
   }
   public void setCost()
   {
      monthPrice = 36;     
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