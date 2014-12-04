//Filename is Shirt.java
//Written by Erica Peharda
//Written on August 18th, 2013

public class Shirt
{
   private double collarSize;
   private int sleeveLength;
   private int numberOfPockets;
   final static String MATERIAL = "cotton"; 
   
   public Shirt(double collar, int sleeve, int pockets)
   {
      collarSize = collar;
      sleeveLength = sleeve;
      numberOfPockets = pockets;
      
   }  
   public void display()
   {
      System.out.println("The collar size for your shirt is "
         + collarSize + " in." + "\nThe sleeve length of your shirt is "
         + sleeveLength + " in." + "\nThe number of pockets on your shirt is/are "
         + numberOfPockets + "." + "\nThe shirt is made out of " + MATERIAL + ".");
   }
}