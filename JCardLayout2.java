import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCardLayout2 extends JFrame implements ActionListener
{
   private JButton nb = new JButton("North");
   private JButton sb = new JButton("South");
   private JButton wb = new JButton("West");
   private JButton eb = new JButton("East");
   private JButton cb = new JButton("Center");
   CardLayout cardLayout = new CardLayout();
   
   
   public JCardLayout2()
   {
      setLayout(cardLayout);
      add("north", nb);
      add("south", sb);
      add("west", wb);
      add("east", eb);
      add("center", cb);
      nb.addActionListener(this);
      sb.addActionListener(this);
      wb.addActionListener(this);
      eb.addActionListener(this);
      cb.addActionListener(this);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      cardLayout.next(getContentPane());
   }
   
   public static void main(String[] args)
   {
      JCardLayout2 jcl = new JCardLayout2();
      jcl.setSize(250, 250);
      jcl.setVisible(true);
   }
}