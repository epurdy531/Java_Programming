//Filename is Sum50.java
//Written by Erica Peharda
//Written on August 31st, 2013

public class Sum50
{
   public static void main(String[] args)
   {
      int number = 1;
      final int LIMIT = 50;
      int sum = 0;
      
      for (number = 1; number <= 50; ++number)
         sum = sum + number;
         
      System.out.println("Your original number is " + LIMIT + ".");
      System.out.println("The sum of each number up to " + LIMIT + 
         " is " + sum + "!");     
   }
}