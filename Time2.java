//Filename Time2.java
//Written by Erica Peharda
//Written on August 11th, 2013

import java.util.Scanner;
public class Time2
{
   public static void main(String[] args)
   {
      int minutes;
      Scanner keyBoard= new Scanner(System.in);
      System.out.print("How many minutes did you work? ");
      minutes = keyBoard.nextInt();
      System.out.print("You worked for " + minutes + " minutes.");
      System.out.print("\nThis means you worked for " + minutes / 60 + " hours ");
      System.out.print("and " + minutes % 60 + " minutes!");    
   }
}