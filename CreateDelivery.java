//Filename is CreateDelivery.java
//Written by Erica Peharda
//Written on August 31st, 2013

import java.util.Scanner;
public class CreateDelivery
{
   public static void main(String[] args)
   {
      int year;
      int deliveryNumber;
      int deliveryWeight;
      int deliveryArea;
      int overnightDelivery;
      boolean isOvernight = true;


      Delivery completedDelivery = new Delivery();
   
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a four-digit year" +
         "\nbetween 2001 and 2025 (inclusive)>>");
      year = input.nextInt();
      
      System.out.println("Please enter a delivery number for the year" +
         "\nbetween 1 and 9999 inclusive>>");
      deliveryNumber = input.nextInt();
      
      System.out.println("Please enter a package weight" + 
         "\nbetween 0.10 lb and 100 lbs (inclusive)>>");
      deliveryWeight = input.nextInt();
      
      System.out.println("Please enter 1 if this is a local deliver" +  
         " \nand 2 if this is a long distance delivery>>");
      deliveryArea = input.nextInt();
      
      System.out.println("Would you like overnight delivery?");
      System.out.println("Type 1 for 'yes' or 2 for 'no'");
      overnightDelivery = input.nextInt();
      
    

      while(year < 2001 || year > 2025)
      {
         System.out.println("Your entry for year was invalid.");
         System.out.println("Please enter a valid year" +
            "\nbetween 2001 and 2025 (inclusive)>>");
         year = input.nextInt();   
      }
      while(deliveryNumber < 1 || deliveryNumber > 9999)
      {
         System.out.println("Your entry for delivery number was invalid.");
         System.out.println("Please enter a valid delivery number" +
            "\nbetween 1 and 9999 (inclusive)>>");
         deliveryNumber = input.nextInt();
      }
      while(deliveryWeight < 0.10 || deliveryWeight > 100)
      {
         System.out.println("Your entry for delivery weight was invalid.");
         System.out.println("Please enter a valid delivery weight" +
            "\nbetween 0.10 lb and 100 lbs (inclusive)>>");
         deliveryWeight = input.nextInt();
      }
      while(!(deliveryArea == 1 || deliveryArea == 2))
      {
         System.out.println("You entered an invalid code for delivery area.");
         System.out.println("Please enter 1 for a local delivery" + 
            "\nor 2 for a long distance delivery>>");
         deliveryArea = input.nextInt();
      }
            
      if(overnightDelivery == 1)
      {
         isOvernight = true;
      }
      else if(overnightDelivery == 2)
      {
         isOvernight = false;
      }
      else if(!(overnightDelivery == 1 || overnightDelivery == 2))
      {
         System.out.println("Your choice for overnight delivery is invalid");
         System.out.println("Please enter 1 for overnight delivery, or " +
            "\n2 for no overnight delivery>>");
         overnightDelivery = input.nextInt();
      }

      completedDelivery.setDeliveryNumber(year, deliveryNumber);
      completedDelivery.setDeliveryWeight(deliveryWeight);
      completedDelivery.setDeliveryArea(deliveryArea);
      completedDelivery.setFee(deliveryWeight, deliveryArea, isOvernight);    
      completedDelivery.displayDelivery();         
   }
}