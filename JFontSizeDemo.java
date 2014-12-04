//Course: CIS 263AA
//Section Number: 33254
//Filename is JFontSizeDemo.java
//Written by Erica Peharda
//Written on December 15th, 2013

import javax.swing.*;
import java.awt.*;
public class JFontSizeDemo extends JFrame
{
   //creating the string containing my first name
   String firstName = new String("Erica");
   //creating the JFontSizeDemo class
   public JFontSizeDemo()
   {
      super("Ascending Name");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   //below I'm painting all of the appropriate sizes for my first name
   //I decided to alternate the font style from row to row to
   //differentiate each line a bit more
   public void paint(Graphics pen)
   {
      super.paint(pen);
      pen.setFont(new Font("Arial", Font.ITALIC, 4));
      pen.drawString(firstName, 30, 80);
      pen.setFont(new Font("Arial", Font.BOLD, 6));
      pen.drawString(firstName, 30, 90);
      pen.setFont(new Font("Arial", Font.ITALIC, 8));
      pen.drawString(firstName, 30, 100);
      pen.setFont(new Font("Arial", Font.BOLD, 10));
      pen.drawString(firstName, 30, 120);
      pen.setFont(new Font("Arial", Font.ITALIC, 12));
      pen.drawString(firstName, 30, 140);
      pen.setFont(new Font("Arial", Font.BOLD, 14));
      pen.drawString(firstName, 30, 160);
      pen.setFont(new Font("Arial", Font.ITALIC, 16));
      pen.drawString(firstName, 30, 190);
      pen.setFont(new Font("Arial", Font.BOLD, 18));
      pen.drawString(firstName, 30, 220);
      pen.setFont(new Font("Arial", Font.ITALIC, 20));
      pen.drawString(firstName, 30, 250);
      pen.setFont(new Font("Arial", Font.BOLD, 22));
      pen.drawString(firstName, 30, 280);
      pen.setFont(new Font("Arial", Font.ITALIC, 24));
      pen.drawString(firstName, 30, 310);       
   }
   //below is the main method instantiating the JFontSizeDemo object 
   //creating the frame size and setting it visible
   public static void main(String[] args)
   {
      JFontSizeDemo frame = new JFontSizeDemo();
      frame.setSize(200, 400);
      frame.setVisible(true);
   }
   
}