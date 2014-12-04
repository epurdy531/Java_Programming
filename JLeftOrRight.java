//Course: CIS 263AA
//Section Number: 33254
//Filename is JLeftOrRight.java
//Written by Erica Peharda
//Written on December 8th, 2013

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JLeftOrRight extends JFrame implements MouseListener
{
   private JLabel label = new JLabel("Press a mouse button.");
   private JLabel answer = new JLabel(""); 
   
   public JLeftOrRight()
   {
      setTitle("Left or Right");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      addMouseListener(this);
      add(label);
      add(answer);
   }
   
   public void mouseClicked(MouseEvent e)
   {
      int intValue = e.getModifiers();
      int leftOrRight = e.getButton();
      
      answer.setText("The integer value for the mouse button " +
            "pressed is: " + intValue + ".");
            
      if(leftOrRight == MouseEvent.BUTTON1)
         label.setText("You pressed the LEFT button!");
      else if(leftOrRight == MouseEvent.BUTTON2)
         label.setText("You pressed the RIGHT button!");
      else if(leftOrRight == MouseEvent.BUTTON3)
         label.setText("You pressed the MIDDLE button!");  
   }
   
   public void mouseEntered(MouseEvent e)
   {
   }
   
   public void mouseExited(MouseEvent e)
   {
   }
   
   public void mousePressed(MouseEvent e)
   {
   }
   
   public void mouseReleased(MouseEvent e)
   {
   }
   
   public static void main(String[] args)
   {
      final int WIDTH = 500;
      final int HEIGHT = 200;
      JLeftOrRight jlr = new JLeftOrRight();
      jlr.setSize(WIDTH, HEIGHT);
      jlr.setVisible(true);      
   }
}