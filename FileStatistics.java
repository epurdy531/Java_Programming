//Filename is FileStatistics.java
//Written by Erica Peharda
//Written on November 10th, 2013
//Class: CIS263AA
//Section: 33254

import java.io.*;
public class FileStatistics
{
   public static void main(String[] args)
   {
      File testFile = new File("SampleFile.txt");
      
      if (testFile.exists())
      {
         System.out.println("The file name is : " + testFile.getName() + "."
            + "\nThe file is " + testFile.length() + " bytes long."
            + "\nThe last time of modification was: " + testFile.lastModified() + ".");
      }
      else
         System.out.println("Sorry, but the file does not exist.");      
   }
}