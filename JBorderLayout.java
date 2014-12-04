import javax.swing.*;
import java.awt.*;
public class JBorderLayout extends JFrame
{
   private JButton nb = new JButton("North");
   private JButton sb = new JButton("South");
   private JButton wb = new JButton("West");
   private JButton eb = new JButton("East");
   private JButton cb = new JButton("Center");
   
   
   public JBorderLayout()
   {
      setLayout(new BorderLayout());
      add(nb, BorderLayout.NORTH);
      add(sb, BorderLayout.SOUTH);
      add(wb, BorderLayout.WEST);
      add(eb, BorderLayout.EAST);
      add(cb, BorderLayout.CENTER);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public static void main(String[] args)
   {
      JBorderLayout jbl = new JBorderLayout();
      jbl.setSize(250, 250);
      jbl.setVisible(true);
   }
}