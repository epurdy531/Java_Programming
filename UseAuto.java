//Filename is UseAuto.java
//Written by Erica Peharda
//Written on November 6th, 2013

public class UseAuto
{
   public static void main(String[] args)
   {
      Ford myFord = new Ford();
      Chevy myChevy = new Chevy();
      myFord.setAutoMake("Ford");
      myChevy.setAutoMake("Chevy");
      myFord.setPrice();
      myChevy.setPrice();

      
      System.out.print("The first Automobile is a " + myFord.getAutoMake()
         + ", which costs $" + myFord.getPrice() + ".");
         
      System.out.print("\n\nThe second Automobile is a " + myChevy.getAutoMake()
         + ", which costs $" + myChevy.getPrice() + ".");
   }
}