//Filename is Order.java
//Written by Erica Peharda
//Written on October 31st, 2013

import javax.swing.JOptionPane;
public class Order
{
   private String customerName;
   private int customerNumber;
   protected int quantityOrdered;
   protected double unitPrice;
   protected double totalPrice;
   
   //below are the get methods for each
   public String getCustomerName()
   {
      return customerName;
   }
   public int getCustomerNumber()
   {
      return customerNumber;
   }
   public int getQuantityOrdered()
   {
      return quantityOrdered;
   }
   public double getUnitPrice()
   {
      return unitPrice;
   }
   
   //below are the set methods for each
   public void setCustomerName(String custName)
   {
      customerName = custName;
   }
   public void setCustomerNumber(int custNumber)
   {
      customerNumber = custNumber;
   }
   public void setQuantityOrdered(int quantOrd)
   {
      quantityOrdered = quantOrd;
   }
   public void setUnitPrice(double unPr)
   {
      unitPrice = unPr;
   }
   
   public void computeTotalPrice(int quantityOrdered, double unitPrice)
   {
      totalPrice = quantityOrdered * unitPrice;
   }
   
   public void displayValues()
   {
      JOptionPane.showMessageDialog(null,
         "Customer Name: " + customerName + ".\n" +
         "Customer Number: " + customerNumber + ".\n" +
         "Quantity Ordered: " + quantityOrdered + ".\n" +
         "Unit Price: $" + unitPrice + ".\n" + 
         "Total Price: $" + totalPrice + ".\n");
   }  
}