//Filename is Insurance.java
//Written by Erica Peharda
//Written on November 7th, 2013

public abstract class Insurance
{
   protected String insuranceType;
   protected double monthPrice;
   
   
   public Insurance(String insType)
   {
      insuranceType = insType;
   }
    
   public abstract void setCost();
   public abstract void display();
}