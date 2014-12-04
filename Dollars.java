//Filename Dollars.java
//Written by Erica Peharda
//Written on August 11th, 2013

import java.util.Scanner;
public class Dollars
{
   public static void main(String[] args)
   {
      int dollars;
      Scanner keyBoard = new Scanner(System.in);
      System.out.print("Enter a number of dollars $");
      dollars = keyBoard.nextInt();
      System.out.print("\nHere is a denomination breakdown:");
      System.out.print("\n\nThere are " + dollars / 20 + " twent(y/ies).");
      dollars = dollars % 20;
      System.out.print("\nThere are " + dollars / 10 + " ten(s).");
      dollars = dollars % 10;
      System.out.print("\nThere are " + dollars / 5 + " five(s).");
      dollars = dollars % 5;
      System.out.print("\nThere are " + dollars + " one(s).");
   }
}