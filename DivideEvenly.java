//Filename is DivideEvenly.java
//Written by Erica Peharda
//Written on August 31st, 2013

public class DivideEvenly
{
   public static void main(String[] args)
   {
      final int LIMIT = 100;
      int var;
      System.out.print(LIMIT + " is evenly divisible by ");
      
      //for loop that varies var from 1 through 100
      for(var = 1; var <= LIMIT; ++var)
         if(LIMIT % var ==0)
            System.out.print(var + " ");
            //display the number and two spaces
      System.out.println();
   }
}