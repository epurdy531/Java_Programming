//Filename is Service.java
//Written by Erica Peharda
//Written on October 6th, 2013

//Course Number: CIS 163AA
//Section Number: 11133
//MEID:  ERI2203192

public class Service
{
   String description;
   double price;
   int minutes;
   
   public Service(String d, double p, int m)
   {
      description = d;
      price = p;
      minutes = m;
   }
   
   public String getDescription()
   {
      return description;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public int getMinutes()
   {
      return minutes;
   }
}