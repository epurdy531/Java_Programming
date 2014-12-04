//Filename Fees.java
//Written by Erica Peharda
//Written on August 11th, 2013

import java.util.Scanner;
public class Fees
{
   public static void main(String[] args)
   {
      int creditHours;
      double bookMoney;
      Scanner keyBoard = new Scanner(System.in);
      System.out.print("Enter the number of credit \nhours you are enrolled in. ");
      creditHours = keyBoard.nextInt();
      System.out.print("Enter the amount of money you spent on books. $");
      bookMoney = keyBoard.nextDouble();
      System.out.print("Thanks!  Since each credit hour costs $85, \nyour"+
         " fee breakdown is:"+ "\n" +
         "\n$"+ (85*creditHours) + "($85 times " + creditHours + " credit hours)"+ 
         "\n+ $65 (athletic fee)" + 
         "\n+$" + bookMoney + "(cost of books)" +
         "\n_______________" + 
         "\n$"+ (85*creditHours + bookMoney + 65) + " Total Fees!");
   }
}