//Filename is MadLib.java
//Written by Erica Peharda
//Written on October 3rd, 2013

//Course Number: CIS 163AA
//Section Number: 11133
//MEID:  ERI2203192

import javax.swing.*;
public class MadLib
{
   public static void main(String[] args)
   {
   String adjective1;
   String noun1;
   String adjective2;
   String noun2;
   String verb1;
   String adjective3;
   String adjective4;
   int selection;
   boolean isYes = true;
   
   while(isYes == true)
   {
      adjective1 = JOptionPane.showInputDialog(null,
         "Please enter an adjective >>");
      noun1 = JOptionPane.showInputDialog(null,
         "Please enter a noun >>");
      adjective2 = JOptionPane.showInputDialog(null,
         "Please enter another adjective >>");
      noun2 = JOptionPane.showInputDialog(null,
         "Please enter another noun >>");
      verb1 = JOptionPane.showInputDialog(null,
         "Please enter a verb >>");
      adjective3 = JOptionPane.showInputDialog(null,
         "Please enter another adjective >>");
      adjective4 = JOptionPane.showInputDialog(null,
         "Please enter the another adjective >>");
   
      JOptionPane.showMessageDialog(null,
         "\nOne day you decided to visit the " + adjective1 + " zoo." +
         "\nOn your trip to the " + adjective1 + " zoo, you met a " + noun1 + "." +
         "\nYou soon realized that this was no ordinary " + adjective1 + " zoo." +
         "\nThe next exhibit contained very " + adjective2 + " " + noun2 + ". " + 
         "\nYou " + verb1 + "ed with excitement; this was exactly trip you had hoped for!" +
         "\nAfter such a long trip, you decided it was time to go to your " + adjective3 +" home, " +
         "\nand visit your " + adjective4 +" family.");
   
      selection = JOptionPane.showConfirmDialog(null,
         "Do you want to play again?");
   
      isYes = (selection == JOptionPane.YES_OPTION);
   }
   
   }
      

}