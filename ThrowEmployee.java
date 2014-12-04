//Course: CIS 263AA
//Section Number: 33254
//Filename is ThrowEmployee.java
//Written by Erica Peharda
//Written on November 8th, 2013

public class ThrowEmployee
{
   public static void main(String[] args)
   {
      try
      {
         Employee emp1 = new Employee(123, 2.00);
         System.out.println("An employee was successfully created!");
      }
      
      catch(EmployeeException error)
      {
         System.out.println("I'm sorry, invalid employee.");
      }

      try
      {
         Employee emp1 = new Employee(456, 65.00);
         System.out.println("An employee was successfully created!");
      }
      
      catch(EmployeeException error)
      {
         System.out.println("I'm sorry, invalid employee.\n");
      }      

      try
      {
         Employee emp1 = new Employee(789, 32.00);
         System.out.println("An employee was successfully created!");
      }
      
      catch(EmployeeException error)
      {
         System.out.println("I'm sorry, invalid employee.");
      }
   }
}