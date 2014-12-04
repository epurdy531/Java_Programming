import javax.swing.*;
public class DinnerPartyWithConstructor extends PartyWithConstructor
{
   private int dinnerChoice;
   final int BEEF_CHOICE = 1;
   final int CHICKEN_CHOICE = 2;
   
   public void displayDinnerChoice()
   {
      if(dinnerChoice == BEEF_CHOICE)
         JOptionPane.showMessageDialog(null,
            "Dinner choice is beef");
      else
         JOptionPane.showMessageDialog(null,
            "Dinner choice is chicken");
   }
   
   public void inputDinnerChoice()
   {
      String choice;
      choice = JOptionPane.showInputDialog(null,
         "Enter a dinner choice\n" + BEEF_CHOICE + " for beef, " +
         CHICKEN_CHOICE + " for chicken");
      dinnerChoice = Integer.parseInt(choice);
   }
}