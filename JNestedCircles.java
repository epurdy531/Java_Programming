//Course: CIS 263AA
//Section Number: 33254
//Filename is JNestedCircles.java
//Written by Erica Peharda
//Written on December 15th, 2013

import javax.swing.*;
import java.awt.*;
public class JNestedCircles extends JFrame
{
   
   public JNestedCircles()
   {
      super("Bull's Eye");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   public void paint(Graphics pen)
   {
      super.paint(pen);
      int x = 180;
      int y = 10;
      
      for(int a = 1; a < 16; ++ a)
      {
         pen.drawOval(x, x, y, y);    
         x = x - 10;
         y = y + 20;
      }
   }
   public static void main(String[] args)
   {
      JNestedCircles frame = new JNestedCircles();
      frame.setSize(400, 400);
      frame.setVisible(true);
   }
}