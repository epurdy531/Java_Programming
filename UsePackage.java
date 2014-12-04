//Filename is UsePackage.java
//Written by Erica Peharda
//Written on October 31st, 2013

public class UsePackage
{
   public static void main(String[] args)
   {
   
      Package package1 = new Package();
         package1.calculateCost(3,'A');
      Package package2 = new Package();
         package2.calculateCost(10,'M');
      Package package3 = new Package();
         package3.calculateCost(21,'T');
      
      //displaying the shipping chart at the beginning using one object
      package1.displayChart();
      
      //displaying shipping calculations based on first three super objects
      System.out.println("UNINSURED SHIPMENTS:");
      package1.displayResults(3,'A');
      package2.displayResults(10,'M');
      package3.displayResults(21,'T');
      
      InsuredPackage insuredPackage1 = new InsuredPackage();
         insuredPackage1.calculateCost(3,'A');
         insuredPackage1.calculateInsuredCost();
      InsuredPackage insuredPackage2 = new InsuredPackage();
         insuredPackage2.calculateCost(10,'M');
         insuredPackage2.calculateInsuredCost();
      InsuredPackage insuredPackage3 = new InsuredPackage();
         insuredPackage3.calculateCost(21,'T');
         insuredPackage3.calculateInsuredCost();
      
      //displaying shipping calculations based on last three subclass objects
      System.out.println("INSURED SHIPMENTS:");
      insuredPackage1.displayResults(3,'A');
      insuredPackage2.displayResults(10,'M');
      insuredPackage3.displayResults(21,'T');

   }
}