//Filename is DisplayBook.java
//Written by Erica Peharda
//Written on November 10th, 2013
//Class: CIS263AA
//Section: 33254

import java.io.*;
import java.util.Scanner;

public class DisplayBook
{
   public static void main(String[] args)
   {
   
         try
         {
            File myFavoriteBook = new File("FavoriteBook.txt");
            
            if(myFavoriteBook.exists())
            {
               int letter;
               FileInputStream in = new FileInputStream(myFavoriteBook);
               while ((letter = in.read()) != -1)
               {
                  System.out.print((char)letter);
               }
            }	
            
            else
            {
               FileOutputStream out = new FileOutputStream(myFavoriteBook);//opens file for writing
               System.out.print("Enter your favorite book title: ");
               Scanner input = new Scanner(System.in);
               String answer = input.nextLine();
               
               for(int x = 0; x < answer.length(); ++x)
                  out.write(answer.charAt(x));
                  
               out.close();
               
               int letter;
               FileInputStream in = new FileInputStream(myFavoriteBook);
               while ((letter = in.read()) != -1)
               {
                  System.out.print((char)letter);
               }
               
            }	
         }					
         
         catch (IOException exc)
         {
            System.out.println(exc.getMessage());
         }
   }
}