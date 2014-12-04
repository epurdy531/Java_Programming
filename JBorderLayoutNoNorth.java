import javax.swing.*;
import java.awt.*;
public class JBorderLayoutNoNorth extends JFrame
{
   private JButton sb = new JButton("South");
   private JButton wb = new JButton("West");
   private JButton eb = new JButton("East");
   private JButton cb = new JButton("Center");
   
   
   public JBorderLayoutNoNorth()
   {
      setLayout(new BorderLayout());
      add(sb, BorderLayout.SOUTH);
      add(wb, BorderLayout.WEST);
      add(eb, BorderLayout.EAST);
      add(cb, BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args)
   {
      JBorderLayoutNoNorth jbl = new JBorderLayoutNoNorth();
      jbl.setSize(250, 250);
      jbl.setVisible(true);
   }
}