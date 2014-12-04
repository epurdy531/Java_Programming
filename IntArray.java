//Filename is IntArray.java
//Written by Erica Peharda
//Written on September 16th, 2013

public class IntArray
{
   public static void main(String[] args)
   {
      int[] numbers = {1, 2, 3, 4, 5};
      
      System.out.println("Numbers from first to last are: ");
      for(int x = 0; x < numbers.length; ++x)
         System.out.println(numbers[x]);
      
      System.out.println("Numbers from last to first are: ");
      for(int x = 4; x > -1; --x)
         System.out.println(numbers[x]);
   }
}