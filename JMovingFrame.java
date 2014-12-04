//Course: CIS 263AA
//Section Number: 33254
//Filename is JMovingFrame.java
//Written by Erica Peharda
//Written on December 8th, 2013

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JMovingFrame extends JFrame implements ActionListener
{
   int x = 1;

   private JButton button = new JButton("Click here!");
   private JLabel message = new JLabel("Move Me!");
   private JPanel panel01 = new JPanel(new FlowLayout());
   private JPanel panel02 = new JPanel(new FlowLayout());
   private JPanel panel03 = new JPanel(new FlowLayout());
   private JPanel panel04 = new JPanel(new FlowLayout());   
   
   public JMovingFrame()
   {
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      add(panel01, BorderLayout.WEST);
      add(panel02, BorderLayout.NORTH);
      add(panel03, BorderLayout.EAST);
      add(panel04, BorderLayout.CENTER);
      
      panel04.add(button);     
      panel01.add(message);
      
      button.addActionListener(this);     
   }
   
   public void actionPerformed(ActionEvent e)
   {
      
      if(x == 1)
      {
         panel01.remove(message);
         panel01.repaint();        
         panel02.add(message);
         x = 2;
      }
      else if(x == 2)
      {
         panel02.remove(message);
         panel02.repaint();        
         panel03.add(message);
         x = 3;
      }
      else if(x == 3)
      {
         panel03.remove(message);
         panel03.repaint();
         panel01.add(message);
         x = 1;
      }
      validate();      
   }
   
   public static void main(String[] args)
   {
      final int WIDTH = 400;
      final int HEIGHT = 200;
      JMovingFrame jmf = new JMovingFrame();
      jmf.setSize(WIDTH, HEIGHT);
      jmf.setVisible(true);
   }
}