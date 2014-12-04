//makes swing and AWT components available
import javax.swing.*;
import java.awt.*;
public class JFrameWithComponents extends JFrame
{
   //contains components of: a label, field, and button.
   JLabel label = new JLabel("Enter your name");
   JTextField field = new JTextField(12);
   JButton button = new JButton("OK");
   
   //set Jframe title, and close program when Jframe is closed
   //also set layout manager
   public JFrameWithComponents()
   {
      super("Frame with Components");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(label);
      add(field);
      add(button);
   }
}