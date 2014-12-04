import javax.swing.*;
import java.awt.*;
public class JGridLayout extends JFrame
{
   private JButton nb = new JButton("North");
   private JButton sb = new JButton("South");
   private JButton wb = new JButton("West");
   private JButton eb = new JButton("East");
   private JButton cb = new JButton("Center");
   
   
   public JGridLayout()
   {
      setLayout(new GridLayout(2,3,2,4));
      add(nb);
      add(sb);
      add(wb);
      add(eb);
      add(cb);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args)
   {
      JGridLayout jgl = new JGridLayout();
      jgl.setSize(250, 250);
      jgl.setVisible(true);
   }
}