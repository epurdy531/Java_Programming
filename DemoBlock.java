public class DemoBlock
{
   public static void main (String[] args)
   {
      System.out.println("Demonstrating block scope");
      int x = 2323;
      System.out.println("In the first block x is " + x);
      {
         int y = 4242;
         System.out.println("In the second block x is " + x);
         System.out.println("In the second block y is " + y);
      }
      {
         int y = 1515;
         System.out.println("In the third block x is " + x);
         System.out.println("In the third block y is " + y);
         demoMethod();
         System.out.println("After method x is " + x);
         System.out.println("After method block y is " +y);
      }
      System.out.println("At the end x is " + x);
   }
   public static void demoMethod()
   {
      int x = 7234, y = 9898;
      System.out.println("In demoMethod x is " + x);
      System.out.println("In demoMethod block y is " + y);
   }
}
