//Filename is Auto.java
//Written by Erica Peharda
//Written on November 6th, 2013
public abstract class Auto
{
   public abstract void setPrice();
   private String autoMake;
   protected int autoPrice;
   
   public String getAutoMake()
   {
      return autoMake;
   }
      
   public void setAutoMake(String carMake)
   {
      autoMake = carMake;
   }  
}