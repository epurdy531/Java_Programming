public class DemoRaise
{
   public static void main(String[] args)
   {
      double mySalary = 200.00;
      double moneyAmount = 800.00;
      System.out.println("Demonstrating some raises");
      predictRaise(400.00);
      predictRaise(mySalary);
      predictRaise(moneyAmount);
   }
   
   public static void predictRaise(double moneyAmount)
   {
      double newAmount;
      final double RAISE = 1.10;
      newAmount = moneyAmount * RAISE;
      System.out.println("With raise, salary is " + newAmount);
   }
}