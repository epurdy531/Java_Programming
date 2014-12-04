//Course: CIS 263AA
//Section Number: 33254
//Filename is EmployeeException.java
//Written by Erica Peharda
//Written on November 8th, 2013

public class EmployeeException extends Exception
{
   public EmployeeException(String code)
   {
      String message = code;
      
      if(message == "A")
         System.out.println("\nYour hourly wage is below the acceptable range.");
      else
         System.out.println("\nYour hourly wage is above the acceptable range.");      
   }
}