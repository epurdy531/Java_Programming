//Filename is CreatePurchase.java
//Written by Erica Peharda
//Written on August 31st, 2013

import java.util.Scanner;
public class CreatePurchase
{
   public static void main(String[] args)
   {
      int invoice;
      double salesAmount;
      Purchase completedPurchase = new Purchase();
      
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter an invoice number >>");
      invoice = input.nextInt();
      System.out.println("Please enter a sales amount >>$");
      salesAmount = input.nextDouble(); 
      salesAmount = salesAmount * 100;
      salesAmount = salesAmount + 0.5;
      salesAmount = (int) salesAmount;
      salesAmount = salesAmount / 100;
      
      while (invoice < 1000 || invoice > 8000)
      {
         System.out.println("You entered in invalid invoice number, " + 
            "\nPlease enter an invoice number " +
            "\nbetween 1000 and 8000 (inclusive) >>");
         invoice = input.nextInt(); 
      }
      
      while (salesAmount < 0)
      {
         System.out.println("You entered an invalid sales amount,");
         System.out.println("\nPlease enter a non-negative sales amount >>$");
         salesAmount = input.nextDouble();
      }
   
      
      completedPurchase.setInvoiceNumber(invoice);
      completedPurchase.setSalesAmount(salesAmount);
   
      completedPurchase.displaySalesAmount();   
   }
}