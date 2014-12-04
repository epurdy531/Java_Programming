//Filename is Calculate.java
//Written by Erica Peharda
//Written on August 24th, 2013
import java.util.Scanner;
public class Calculate
{
   public static void main(String[] args)
   {
      int firstNumber;
      int secondNumber;
      int menuOption;
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter your first integer...");
      firstNumber = input.nextInt();
      System.out.println("Please enter a second integer...");
      secondNumber = input.nextInt();
      
      System.out.println("Please enter an operation to perform on your two integers.");
      System.out.println("Enter 1 to add, enter 2 to subtract the second from the first," +
         " enter 3 to multiply, and 4 to divide the first by the second.");
      menuOption = input.nextInt();
      
      switch(menuOption)
      {
         case 1:
            System.out.println("The sum of your two numbers is " +
               (firstNumber + secondNumber) + "!");
            break;
         case 2:
            System.out.println("Your first number minus your second number is "
               + (firstNumber - secondNumber) + "!");
            break;
         case 3:
            System.out.println("The product of your two numbers is "
               + (firstNumber * secondNumber) + "!");
            break;
         case 4:
            System.out.println("The result of the 1st divided by the 2nd is "
               + (firstNumber/secondNumber) + "!");
            break;
         default:
            System.out.println("Invalid choice.");
            
      }
   }
}