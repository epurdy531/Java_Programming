//Course: CIS 263AA
//Section Number: 33254
//Filename is Employee.java
//Written by Erica Peharda
//Written on November 8th, 2013

public class Employee
{
      int idNum;
      double hourlyWage;
      
      public Employee( int idNum, double hourlyWage) throws EmployeeException
      {
         this.idNum = idNum;
         this.hourlyWage = hourlyWage;     
         if(hourlyWage < 6.00)
            throw(new EmployeeException("A"));
         if(hourlyWage > 50.00)
            throw(new EmployeeException("B"));
      }
}