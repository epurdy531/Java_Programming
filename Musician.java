//Filename is Musician.java
//Written by Erica Peharda
//Written on November 8th, 2013

import javax.swing.*;
public class Musician implements Player
{
   public void play()
   {
      JOptionPane.showMessageDialog(null,
         "As a verb it is to perform on, or as if on" 
         +"\na stage- in this case with an instrument"
         +"\nsuch as a voice, piano, guitar, etc.");
   }
}