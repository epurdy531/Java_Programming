//Filename is ThreeLetterAcronym.java
//Written by Erica Peharda
//Written on September 8th, 2013

import javax.swing.*;
public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      String phrase, newPhrase;
      int a,b,c;
      char one, two, three;
      
      phrase = JOptionPane.showInputDialog(null, 
         "Please enter a 3 word phrase to be" + 
         "\ntranslated into an acronym");
         
      phrase = phrase.toUpperCase();
      
      one = phrase.charAt(0);
      
      b = phrase.indexOf(" ");
      ++b;
      two = phrase.charAt(b);
      
      phrase = phrase.substring(b + 1, phrase.length());
      
      c = phrase.indexOf(" ");
         if(c == -1)
            {
               JOptionPane.showMessageDialog(null,
                  "You did not enter 3 words.");
            }
         else
            ++c;
      three = phrase.charAt(c);
         

         
         JOptionPane.showMessageDialog(null,
            "Your acronym is " + one + two + three);
     
   }
}