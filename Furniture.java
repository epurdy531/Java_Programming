//Filename is Furniture.java
//Written by Erica Peharda
//Written on August 24th, 2013
import java.util.Scanner;
public class Furniture
{
   public static void main(String[] args)
   {
      int tableType;
      int chairs;
      String chosenWood = "";
      double chosenRate = 0;
      final int PINE_CODE = 1;
      final int OAK_CODE = 2;
      final int MAHOGANY_CODE = 3;
      final int PINE_RATE = 100;
      final int OAK_RATE = 225;
      final int MAHOGANY_RATE = 310;
      final String PINE_CHOICE = "pine";
      final String OAK_CHOICE = " oak";
      final String MAHOGANY_CHOICE = " mahogany";
      boolean choiceIsGood = true;
      
      Scanner input = new Scanner(System.in);
      System.out.println("What type of wood would you like?");
      System.out.println("Enter " + PINE_CODE + " for pine, " + 
         "enter " + OAK_CODE + " for oak, and enter " + MAHOGANY_CODE +
         " for mahogany...");
      tableType = input.nextInt();
      System.out.println("Would you like chairs? Type 1 for yes 2 for no...");
      chairs = input.nextInt();
      
      if(tableType == PINE_CODE)
      {
         chosenWood = PINE_CHOICE;
         chosenRate = PINE_RATE;
         if(chairs == 1)
         {
            chosenRate = PINE_RATE + 250;
         }
      }
      else 
         if(tableType == OAK_CODE)
         {
            chosenWood = OAK_CHOICE;
            chosenRate = OAK_RATE;
            if(chairs == 1)
            {
               chosenRate = OAK_RATE + 250;
            }
         }
         else
            if(tableType == MAHOGANY_CODE)
            {
               chosenWood = MAHOGANY_CHOICE;
               chosenRate = MAHOGANY_RATE;
               if(chairs == 1)
               {
                  chosenRate = MAHOGANY_RATE + 250;
               }
            }
            else
               choiceIsGood = false;
        
        System.out.println("You chose " + chosenWood + "!" +
         " Your total will be $" + chosenRate);
   }
   
   
}