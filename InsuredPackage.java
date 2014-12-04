//Filename is InsuredPackage
//Written by Erica Peharda
//Written on October 31st, 2013

public class InsuredPackage extends Package
{
   public void calculateInsuredCost()
   {
      if(shipCost >= 0.0 && shipCost <= 1.00)
         shipCost = shipCost + 2.45;
      else if(shipCost > 1.00 && shipCost <= 3.00)
         shipCost = shipCost + 3.95;
      else if(shipCost >= 3.01)
         shipCost = shipCost + 5.55;
   }
}