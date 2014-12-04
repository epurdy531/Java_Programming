//Filename is ComparisonCase.java
//Written by Erica Peharda
//Written on September 8th, 2013

public class ComparisonCase
{
   public static void main(String[] args)
   {
      String name1 = "Erica", name2 = "erica";

      System.out.println("When " + name1 + " and " + name2 +
         " are compared using the \nequals() method, the result is " +
         name1.equals(name2) + "!");
   
      System.out.println("However, when " + name1 + " and " + name2 +
         " are compared using the \nequalsIgnoreCase() method, " +
         "the result is " + name1.equalsIgnoreCase(name2) + "!");
   }
}