//Filename is PetAdvice.java
//Written by Erica Peharda
//Written on August 24th, 2013
import java.util.Scanner;
public class PetAdvice
{
   public static void main (String[] args)
   {
      int hoursHome;
      int residence;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the number of hours you are"
         + " home during the day.");
      System.out.println("Enter 1 for 18 or more hours," +
         "\nEnter 2 for 10 to 17 hours" +
         "\nEnter 3 for 8 to 9 hours" +
         "\nEnter 4 for 6 to 7 hours" +
         "\nEnter 5 for 0 to 5 hours");
      hoursHome = input.nextInt();      
      System.out.println("Please enter your type of residence.");
      System.out.println("Enter 1 for apartment, \nEnter 2 for house, \nOr enter 3 for dormitory...");
      residence = input.nextInt();
      
      switch(residence)
      {
         case 1:
            System.out.println("You entered 1 for apartment.");
            break;
         case 2:
            System.out.println("You entered 2 for house.");
            break;
         case 3:
            System.out.println("You entered 3 for dormitory.");
            break;
         default:
            System.out.println("Invalid residence.");
      }
      
      if (residence == 2 && hoursHome == 1)
         System.out.println("We recommend a Pot-bellied pig!");
      else
         if (residence == 2 && hoursHome == 2)
            System.out.println("We recommend a Dog!");
            else
               if (residence == 2 && hoursHome >= 3)
               System.out.println("We recommend a Snake!");
                  else
                     if (residence == 1 && hoursHome <= 2)
                     System.out.println("We recommend a Cat!");
                        else
                           if (residence == 1 && hoursHome >= 3)
                           System.out.println("We recommend a Hamster!");
                              else
                                 if (residence == 3 && hoursHome <= 4)
                                 System.out.println("We recommend a Fish!");
                                    else
                                       if (residence == 3 && hoursHome == 5)
                                       System.out.println("We recommend an Ant Farm!");
      
   }
}