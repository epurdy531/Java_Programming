//Filename Time.java
//Written by Erica Peharda
//Written on August 11th, 2013

public class Time
{
   public static void main(String[] args)
   {
      int minutes;
      minutes = 132;
      System.out.print("You worked for " + minutes + " minutes.");
      System.out.print("\nThis means you worked for " + minutes / 60 + " hours ");
      System.out.print("and " + minutes % 60 + " minutes!");    
   }
}