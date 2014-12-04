//Filename is ShippedOrder.java
//Written by Erica Peharda
//Written on October 31st, 2013

public class ShippedOrder extends Order
{
   public void computeTotalPrice(int quantityOrdered, double unitPrice)
   {
      totalPrice = quantityOrdered * unitPrice + 4.00;
   }
}