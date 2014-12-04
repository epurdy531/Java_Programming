//Course: CIS 263AA
//Section Number: 33254
//Filename is GoTooFar.java
//Written by Erica Peharda
//Written on November 8th, 2013
import javax.swing.*;
public class GoTooFar
{
   public static void main(String[] args)
   {
      int x;
      int[] numbers = {35, 84, 25, 51, 96};
      
      try
      {
         for(x = 0; ; ++x)
         {
            JOptionPane.showMessageDialog(null,"The integer in position: " + (x + 1)
               + " is " + numbers[x]);
         }
      }
      catch(ArrayIndexOutOfBoundsException mistake)
      {
         JOptionPane.showMessageDialog(null, "Now you've gone too far!");
      }
   }
}