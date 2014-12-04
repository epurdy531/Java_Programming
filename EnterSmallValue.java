//Filename is EnterSmallValue
//Written by Erica Peharda
//Written on August 27th, 2013

import java.util.Scanner;
public class EnterSmallValue
{
   public static void main(String[] args)
   {
      int userEntry;
      final int LIMIT = 3;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter an integer no higher than " +
         LIMIT + " > ");
      userEntry = input.nextInt();
      while(userEntry > LIMIT)
      {
         System.out.println("The number you entered was too high");
         System.out.println("Please enter an integer no higher than " +
            LIMIT + " > ");  
         userEntry = input.nextInt(); 
      }
      System.out.println("You correctly entered " + userEntry + "!");
   }
}