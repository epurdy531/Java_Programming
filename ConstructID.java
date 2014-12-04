//Filename is ConstructID.java
//Written by Erica Peharda
//Written on September 8th, 2013

import javax.swing.*;
public class ConstructID
{
   public static void main(String[] args)
   {
      
      String name, namePart, address, addressPart;
      char one, two, three;
      int a, b, c;
      
      name = JOptionPane.showInputDialog(null,
         "Please enter your full name.");
         
      one = name.charAt(0);
      
      a = name.indexOf(" ");
      ++a;
      
      two = name.charAt(a);
      
      name = name.substring(a , name.length());
      
      b = name.indexOf(" ");
         if(b == -1)
         {
           namePart = "" + one + two; 
         }
         else
         {
            ++b;
            three = name.charAt(b);
            namePart = "" + one + two + three;
         }
         
      address = JOptionPane.showInputDialog(null,
         "Please enter your street address.");
         
      c = address.indexOf(" ");
      
      addressPart = address.substring(0,c);
      
      JOptionPane.showMessageDialog(null,
         "Your new ID will be " + namePart + addressPart); 
      
      
      
   }
}