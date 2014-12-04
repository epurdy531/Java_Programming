//Filename is UseOrder.java
//Written by Erica Peharda
//Written on October 31st, 2013

import javax.swing.JOptionPane;
public class UseOrder
{
   public static void main(String[] args)
   {      
      String customerName;
      int customerNumber;
      String custNum;
      int quantityOrdered;
      String quantOr;
      double unitPrice;
      String uniPri;
      double totalPrice;
      
      //instantiating an object from the super class- Order
      Order order1 = new Order();

      customerName = JOptionPane.showInputDialog(null, 
         "Please enter a customer name:");
      order1.setCustomerName(customerName);
            
      custNum = JOptionPane.showInputDialog(null,
         "Please enter a customer number:");
      customerNumber = Integer.parseInt(custNum);
      order1.setCustomerNumber(customerNumber);
      
      quantOr = JOptionPane.showInputDialog(null,
         "Please enter a quantity ordered:");
      quantityOrdered = Integer.parseInt(quantOr);
      order1.setQuantityOrdered(quantityOrdered);
      
 
      uniPri = JOptionPane.showInputDialog(null,
         "Please enter the unit price:");
      unitPrice = Double.parseDouble(uniPri);
      order1.setUnitPrice(unitPrice);
      
      order1.computeTotalPrice(quantityOrdered, unitPrice);
      
      
      JOptionPane.showMessageDialog(null,
         "\nThe following is an object instantiated \nfrom the super class: Order >>");
      order1.displayValues();
      
      //instantiating an object from the subclass- Shipped Order
      ShippedOrder shippedOrder1 = new ShippedOrder();
      
      customerName = JOptionPane.showInputDialog(null, 
         "Please enter a customer name:");
      shippedOrder1.setCustomerName(customerName);
      
      custNum = JOptionPane.showInputDialog(null,
         "Please enter a customer number:");
      customerNumber = Integer.parseInt(custNum);
      shippedOrder1.setCustomerNumber(customerNumber);
      
      quantOr = JOptionPane.showInputDialog(null,
         "Please enter a quantity ordered:");
      quantityOrdered = Integer.parseInt(quantOr);
      shippedOrder1.setQuantityOrdered(quantityOrdered);
      
      uniPri = JOptionPane.showInputDialog(null,
         "Please enter the unit price:");
      unitPrice = Double.parseDouble(uniPri);
      shippedOrder1.setUnitPrice(unitPrice);
      
      shippedOrder1.computeTotalPrice(quantityOrdered, unitPrice);
      
      JOptionPane.showMessageDialog(null,
         "\nThe following is an object instantiated \nfrom the subclass: ShippedOrder >>");
      shippedOrder1.displayValues();
   }
}