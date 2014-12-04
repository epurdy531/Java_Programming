//Filename is RandomGuess3.java
//Written by Erica Peharda
//Written on October 6th, 2013

//Course Number: CIS 163AA
//Section Number: 11133
//MEID:  ERI2203192

import java.util.Scanner;
public class RandomGuess3
{
   public static void main(String[] args)
   {
      final int HIGHEST_VALUE_WANTED = 1000;
      final int LOWEST_VALUE_WANTED = 1;
      int playerGuess;
      boolean correctNumber = false, playAgain = false;

   
      int computerNumber = ((int)(Math.random()*1000)% HIGHEST_VALUE_WANTED + LOWEST_VALUE_WANTED);
   
      do
      {
         
         Scanner input = new Scanner(System.in);
         System.out.println(computerNumber);
         System.out.println("Guess a number between 1 and 1,000.  Then press the return key>>");
         playerGuess = input.nextInt();
         input.nextLine();
         if(computerNumber > playerGuess)
            System.out.println("Your number was too low.");
         else if(computerNumber < playerGuess)
            System.out.println("Your number was too high.");
         else if(computerNumber == playerGuess)
         {
            System.out.println("You guessed it!"); 
                    
            computerNumber = ((int)(Math.random()*1000)% HIGHEST_VALUE_WANTED + LOWEST_VALUE_WANTED);
            
            System.out.println("Would you like to play again? Enter Y for yes, or any key for no. >>");
            String entry2 = input.nextLine();
            if (entry2.equalsIgnoreCase("y"))
            {
               correctNumber = false;
               playAgain = true;
            } 
            else
               correctNumber = true;
         }
         playAgain = true;   
      } while(playAgain == true && correctNumber == false); 
   
      System.out.println("Thank you for playing!"); 
   }
}