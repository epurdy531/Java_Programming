import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoPaint extends JFrame implements ActionListener
{
   JButton pressButton = new JButton("Press");
   
   public JDemoPaint()
   {
      setTitle("Paint Demo");
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(pressButton);
      pressButton.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      System.out.print("Button pressed.");
      repaint();
   }
   
   public void paint(Graphics g)
   {
      super.paint(g);
      System.out.println("In paint method.");
   }
   public static void main(String[] args)
   {
      JDemoPaint frame = new JDemoPaint();
      frame.setSize(150,100);
      frame.setVisible(true);
   }
}