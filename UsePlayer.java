//Filename is UsePlayer.java
//Written by Erica Peharda
//Written on November 8th, 2013

import javax.swing.*;
public class UsePlayer
{
   public static void main(String[] args)
   {
      String entry;
      int userChoice;
      
      entry = JOptionPane.showInputDialog(null,
         "Please choose a word in which PLAY can be defined:" +
         "\n1- CHILD\n2-ACTOR\n3-MUSICIAN");
      userChoice = Integer.parseInt(entry);
      
      if(userChoice == 1)
      {
         Child myChild = new Child();
         myChild.play();
      }
      else if (userChoice == 2)
      {
         Actor myActor = new Actor();
         myActor.play();
      }
      else if (userChoice == 3)
      {
         Musician myMusician = new Musician();
         myMusician.play();
      }
      else
         JOptionPane.showMessageDialog(null, "Invalid choice");
      
   }
}