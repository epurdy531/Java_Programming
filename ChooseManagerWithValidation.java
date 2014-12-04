//Filename is ChooseManagerWithValidation.java
//Written by Erica Peharda
//Written on August 31st, 2013

import java.util.Scanner;
public class ChooseManagerWithValidation
{
   public static void main(String[] args)
   {
      int eventType;
      String chosenManager;
      final int PRIVATE_CODE = 1;
      final int CORPORATE_CODE = 2;
      final String PRIV_MANAGER = "Dustin Britt";
      final String CORP_MANAGER = "Carmen Lindsey";
      Scanner input = new Scanner(System.in);
      System.out.println("What type of event are you scheduling?");
      System.out.println("Enter " + PRIVATE_CODE + " for private, " + 
         CORPORATE_CODE + " for corporate...");
      eventType = input.nextInt();
      
      while(eventType != PRIVATE_CODE && eventType != CORPORATE_CODE)
      {
         System.out.println("You made an invalid selection");
         System.out.println("\nYou entered " + eventType);
         System.out.println("Please enter " + PRIVATE_CODE + 
            " for private, " + CORPORATE_CODE + " for corporate...");
         eventType = input.nextInt();
      }
      
      if(eventType == PRIVATE_CODE)
         chosenManager = PRIV_MANAGER;
      else
         chosenManager = CORP_MANAGER;
         
      System.out.println("You entered " + eventType);
      System.out.println("\nManager for this event will be " +
         chosenManager);
   }
}