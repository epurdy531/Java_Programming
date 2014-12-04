//Filename is Delivery.java
//Written by Erica Peharda
//Written on August 31st, 2013

public class Delivery
{
   int number;
   int year;
   int area;
   int weight;
   double fee;
   boolean isOvernight;



   
   public void setDeliveryNumber(int year, int deliveryNumber)
   {
      year = year * 10000;
      number = deliveryNumber + year;
   }
   
   public void setDeliveryWeight(int deliveryWeight)
   {
      weight = deliveryWeight;
   }
   
   public void setDeliveryArea(int deliveryArea)
   {
      area = deliveryArea;
   }
   
   public void setFee(int weight, int area, boolean isOvernight)
   { 
      if(area == 1 && weight < 5)
         fee = 12.00;
      if(area == 1 && weight >= 5 && weight <= 20)
         fee = 16.50;
      if(area == 1 && weight > 20)
         fee = 22.00;
      if(area == 2 && weight < 5)
         fee = 35.00;
      if (area == 2 && weight >= 5) 
         fee = 47.95;
         
      if(isOvernight == true)
         fee = fee + 35.00;
   } 
   

   public void displayDelivery()
   {
      System.out.println("Your delivery number is " + number);
      System.out.println("The code you entered for delivery area was " + area);
      System.out.println("The weight, in pounds, of your delivery is " + weight);
      System.out.println("The fee for your delivery is $" + fee);
   }
}