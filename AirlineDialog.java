import javax.swing.JOptionPane;
public class AirlineDialog
{
   public static void main(String[] args)
   {
      int selection;
      boolean isYes;
      selection = JOptionPane.showConfirmDialog(null,
         "Do you want to upgrade to first class?", 
         "Seat Preference", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
      isYes = (selection == JOptionPane.YES_OPTION);
      JOptionPane.showMessageDialog(null, "You responded " + isYes + "!");
   }
}