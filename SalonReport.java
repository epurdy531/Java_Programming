//Filename is SalonReport.java
//Written by Erica Peharda
//Written on October 6th, 2013

//Course Number: CIS 163AA
//Section Number: 11133
//MEID:  ERI2203192

import java.util.Scanner;
public class SalonReport
{
   public static void main(String[] args)
   {
      String title;
      String author;
      int pages;
      int selection;
      Service temp;
   
      Scanner input = new Scanner(System.in);

      Service[] someService= new Service[6]; 
      
      someService[0] = new Service(      "Cut",  8.00, 14);
      someService[1] = new Service(  "Shampoo",  4.00, 10);
      someService[2] = new Service( "Manicure", 18.00, 30);
      someService[3] = new Service(    "Style", 48.00, 55);
      someService[4] = new Service("Permanent", 18.00, 35);
      someService[5] = new Service(     "Trim",  6.00,  5);
      
      boolean sort = true;
      
      do
      {
         System.out.println("\n\nHow would you like the services menu sorted?" + 
            "\nSelect a number from the options below");
         System.out.println("\n1)Sort by Service\n2)Sort by Price\n3)Sort by Time (Minutes)" + 
            "\n4)Exit Menu");
         selection = input.nextInt();
         input.nextLine();
         
         switch(selection)
         {
            case 1:
               for (int x = 0; x < someService.length - 1; ++x)
               {
                  for (int y = 0; y < someService.length - 1; ++y)
                  {
                     if(someService[y].getDescription().charAt(0) > someService[y + 1].getDescription().charAt(0))
                     {
                        temp = someService[y];
                        someService[y] = someService[y + 1];
                        someService[y + 1] = temp;
                     }
                  }
               }
               break;
            case 2:
               for (int x = 0; x < someService.length - 1; ++x)
               {
                  for (int y = 0; y < someService.length - 1; ++y)
                  {
                     if(someService[y].getPrice() > someService[y + 1].getPrice())
                     {
                        temp = someService[y];
                        someService[y] = someService[y + 1];
                        someService[y + 1] = temp;
                     }
                  }
               }
               break;
            case 3:
               for (int x = 0; x < someService.length - 1; ++x)
               {
                  for (int y = 0; y < someService.length - 1; ++y)
                  {
                     if(someService[y].getMinutes() > someService[y + 1].getMinutes())
                     {
                        temp = someService[y];
                        someService[y] = someService[y + 1];
                        someService[y + 1] = temp;
                     }
                  }
               }
   
               break;
            case 4:
               System.out.println("You have selected EXIT, goodbye.");
               sort = false;
               break;
         }      
            
         if(selection > 0 && selection < 4)
         {
            System.out.print("After sorting, the result of the salon service menu is:");      
               
            for(int x = 0; x < someService.length; ++x)
            {
               System.out.print("\nService Description:  " + someService[x].getDescription() + 
                                "\n                                     Cost:   $" + someService[x].getPrice() + 
                                "\n                                     Time:  " + someService[x].getMinutes() + "min."); 
            }
         }
      
      }while(sort == true);      
   }
}