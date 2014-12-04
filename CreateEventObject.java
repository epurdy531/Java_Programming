//Filename is CreateEventObject
//Written by Erica Peharda
//Written on August 24th, 2013

import java.util.Scanner;
public class CreateEventObject
{
   public static void main(String[] args)
   {
      int eventType;
      String chosenManager = "";
      double chosenRate = 0;
      Event scheduledEvent = new Event();
      final int PRIVATE_CODE = 1;
      final int CORPORATE_CODE = 2;
      final int NONPROFIT_CODE = 3;
      final String PRIVATE_MANAGER = "Dustin Britt";
      final String CORP_MANAGER = "Carmen Lindsey";
      final String NONPROFIT_MANAGER = "Robin Armenetti";
      final double PRIVATE_RATE = 47.99;
      final double CORP_RATE = 75.99;
      final double NONPROFIT_RATE = 40.99;
      boolean choiceIsGood = true;
      
      Scanner input = new Scanner(System.in);
      System.out.println("What type of event are you scheduling?");
      System.out.println("Enter " + PRIVATE_CODE + " for private, " +
         CORPORATE_CODE + " for corporate, or " + NONPROFIT_CODE + 
         " for nonprofit...");
      eventType = input.nextInt();
      
      if(eventType == PRIVATE_CODE)
      {
         chosenManager = PRIVATE_MANAGER;
         chosenRate = PRIVATE_RATE;
      }
      else
         if(eventType == CORPORATE_CODE)
         {
            chosenManager = CORP_MANAGER;
            chosenRate = CORP_RATE;
         }
         else
            if(eventType == NONPROFIT_CODE)
            {
               chosenManager = NONPROFIT_MANAGER;
               chosenRate = NONPROFIT_RATE;
            }
            else
               choiceIsGood = false;
               
       if(choiceIsGood)
       {
         scheduledEvent.setType(eventType);
         scheduledEvent.setManager(chosenManager);
         scheduledEvent.setRate(chosenRate);
       }
       else
         System.out.println("You enetered " + eventType +
            " which is invalid!");
       
       System.out.println("Scheduled event:");
       System.out.println("Type: " + scheduledEvent.getType() +
         " Manager: " + scheduledEvent.getManager() + " Rate: " +
         scheduledEvent.getRate() + " per hour.");
   }
}