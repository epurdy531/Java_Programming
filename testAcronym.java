import javax.swing.*;
public class testAcronym
{
   public static void main(String[] args)
   {
      String name;
      int x;
      
      name = JOptionPane.showInputDialog(null,
         "Please enter a word");
      
      x = name.charAt(0);
      
      JOptionPane.showMessageDialog(null,
         "Your character is " + name.substring(0,1));
   
   }
}