//Filename is FileStatistics2.java
//Written by Erica Peharda
//Written on November 10th, 2013
//Class: CIS263AA
//Section: 33254

import java.io.*;
public class FileStatistics2
{
   public static void main(String[] args)
   {
      //Here I am creating two file objects- one for the txt version and one for the doc
      File quoteTxt = new File("Quote.txt");
      File quoteDoc = new File("Quote.doc");
      
      if (quoteTxt.exists()  && quoteDoc.exists())
      {
         System.out.println("The TXT file is: " + quoteTxt.length()
            + " bytes." + "\nWhile the DOC file is: " + quoteDoc.length()
            + " bytes." + "\n\nThe ratio of TXT to DOC is: " +
            quoteTxt.length() + "/" + quoteDoc.length() + ".");
      }
      else
         System.out.println("Sorry, one or both files do not exist \nso they cannot be compared.");      
   }
}