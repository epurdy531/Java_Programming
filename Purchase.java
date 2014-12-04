//Filename is Purchase.java
//Written by Erica Peharda
//Written on August 31st, 2013

public class Purchase
{
   int invoiceNumber;
   double salePrice;
   double salesTax;
   
   public void setInvoiceNumber(int invoice)
   {
      invoiceNumber = invoice;
   }
   
   public void setSalesAmount(double salesAmount)
   {
      salePrice = salesAmount;
      salesTax = salesAmount * 0.05;
   }
   
   public void displaySalesAmount()
   {
      System.out.println("Your invoice number is " + invoiceNumber + ".");
      System.out.println("Your sale price is $" + salePrice + ".");
      System.out.println("Your sales tax is $" + salesTax + ".");
      System.out.println("Your grand total comes to $" + (salePrice +
         salesTax) + "!");
   }
   
}