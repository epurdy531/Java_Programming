//Filename is Package.java
//Written by Erica Peharda
//Written on October 31st, 2013

public class Package
{
   private int ounceWeight;
   private char shipMethod;
   protected double shipCost;
   
   public void calculateCost(int ounceWeight, char shipMethod)
   {
      if(ounceWeight > 0 && ounceWeight < 9)
      {
         if(shipMethod == 'A')
            shipCost = 2.00;
         else if (shipMethod == 'T')
            shipCost = 1.50;
         else if (shipMethod == 'M')
            shipCost = 0.50;
         else 
            System.out.println("Invalid shipping method");
      }
      
      else if(ounceWeight > 9 && ounceWeight < 17)
      {
         if(shipMethod == 'A')
            shipCost = 3.00;
         else if (shipMethod == 'T')
            shipCost = 2.35;
         else if (shipMethod == 'M')
            shipCost = 1.50;
         else 
            System.out.println("Invalid shipping method");
      }
      
      else if(ounceWeight > 17)
      {
         if(shipMethod == 'A')
            shipCost = 4.50;
         else if (shipMethod == 'T')
            shipCost = 3.25;
         else if (shipMethod == 'M')
            shipCost = 2.15;
         else 
            System.out.println("Invalid shipping method");
      }
   }
   
   public void displayChart()
   {
      System.out.println("The following is a table of shipping costs:\n" +
         "Weight(oz.)   Air($)   Truck($)    Mail($)\n" +
         "1 to 8        2.00     1.50        0.50\n" +
         "9 to 16       3.00     2.35        1.50\n" +
         "17 & over     4.50     3.25        2.15\n");              
   }
   
   public void displayResults(int ounceWeight, char shipMethod)
   {
      System.out.println("\nInformation Provided: ShipMethod = " + 
         shipMethod + ", Weight = " + ounceWeight + " oz.");    
      System.out.println("\nYour shipping cost is: $" + shipCost + "\n\n");
   }
}