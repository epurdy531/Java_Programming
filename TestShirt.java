//Filename is TestShirt
//Written by Erica Peharda
//Written on August 18th, 2013

public class TestShirt
{
   public static void main(String[] args)
   {
      Shirt option1 = new Shirt(17.5, 86, 2);
      Shirt option2 = new Shirt(18.0, 87, 0);
      Shirt option3 = new Shirt(16.5, 79, 1);
      
      option1.display();
      option2.display();
      option3.display();
   }
}