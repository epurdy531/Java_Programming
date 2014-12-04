import javax.swing.*;
import java.awt.*;
public class JCardLayout extends JFrame
{
   private JButton nb = new JButton("North");
   private JButton sb = new JButton("South");
   private JButton wb = new JButton("West");
   private JButton eb = new JButton("East");
   private JButton cb = new JButton("Center");
   
   
   public JCardLayout()
   {
      setLayout(new CardLayout());
      add("north", nb);
      add("south", sb);
      add("west", wb);
      add("east", eb);
      add("center", cb);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args)
   {
      JCardLayout jcl = new JCardLayout();
      jcl.setSize(250, 250);
      jcl.setVisible(true);
   }
}