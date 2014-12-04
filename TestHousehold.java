//Filename is TestHousehold.java
//Written by Erica Peharda
//Written on August 18th, 2013

public class TestHousehold
{
   public static void main(String[] args)
   {
      Household fam1 = new Household();
      Household fam2 = new Household(3);
      Household fam3 = new Household(5, 135051.32);
      fam1.display();
      fam2.display(); 
      fam3.display();     
   }

}