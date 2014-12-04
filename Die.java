//Filename is Die.java
//Written by Erica Peharda
//Written on October 3rd, 2013

//Course Number: CIS 163AA
//Section Number: 11133
//MEID:  ERI2203192

import java.util.Scanner;
public class Die
{
   public static void main(String[] args)
   {
      int throw1, throw2;
      final int HIGHEST_DIE_VALUE = 6;
      final int LOWEST_DIE_VALUE = 1;
      boolean cont = true;
      String entry;

     
      
      
      while(cont == true)
      {
         throw1 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + 
            LOWEST_DIE_VALUE);
            
         throw2 = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE + 
            LOWEST_DIE_VALUE); 
            
         int[][] dieThrows = new int[throw1][throw2];
         
         System.out.println("This round the computer threw " + throw1 + 
            ", and you threw " + throw2 + "!");         
         
         Scanner input = new Scanner(System.in);
         System.out.print("Would you like to throw again? \nEnter Y for yes, or N for no >>");
         entry = input.nextLine();
   
         if(entry.equalsIgnoreCase("n"))
            cont = false; 
      }
         
   
   }
}