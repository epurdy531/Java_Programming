//You Do It
//Using Fonts and Colors

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class JDemoGraphics2 extends JFrame
{
   String movieQuote = new String("You takin' to me?");
   Font bigFont = new Font("Boopee", Font.ITALIC, 30);
   public JDemoGraphics2()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void paint(Graphics gr)
   {
      super.paint(gr);
      gr.setFont(bigFont);
      gr.setColor(Color.MAGENTA);
      gr.drawString(movieQuote, 30, 100);
      gr.setColor(Color.BLUE);
      gr.drawString(movieQuote, 4, 50);
   }
   public static void main(String[] args)
   {
      JDemoGraphics2 frame = new JDemoGraphics2();
      frame.setSize(320, 150);
      frame.setVisible(true);
   }
}