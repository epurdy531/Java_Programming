//File name is Household.java
//Written by Erica Peharda
//Written on August 18th, 2013

public class Household
{
   private int numberOfOccupants;
   private double annualIncome;
   public Household()
   {
      numberOfOccupants = 1;
      annualIncome = 0.0;
   }
   public Household(int numberOfOccupants1)
   {
      numberOfOccupants = numberOfOccupants1;
   }
   public Household(int numberOfOccupants1, double annualIncome1)
   {
      numberOfOccupants = numberOfOccupants1;
      annualIncome = annualIncome1;
   }
   public void display()
   {
      System.out.println("There are " + numberOfOccupants + 
      " person(s) living in this house and their annual income is $"
      + annualIncome);
   }
   
}