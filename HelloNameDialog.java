import javax.swing.JOptionPane;
public class HelloNameDialog
{
   public static void main(String[] args)
   {
      String result;
      result = JOptionPane.showInputDialog(null, "What is your name?", "Name", JOptionPane.INFORMATION_MESSAGE);
      JOptionPane.showMessageDialog(null, "Hello, " + result + "!", "Greeting", JOptionPane.PLAIN_MESSAGE);
      JOptionPane.showInputDialog(null, "What is your area code?", "Area Code Information", JOptionPane.QUESTION_MESSAGE);
   }
}