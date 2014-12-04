//Course: CIS 263AA
//Section Number: 33254
//Filename is JCatchTheMouse.java
//Written by Erica Peharda
//MEID: ERI2203192
//Written on December 19th, 2013

//use 48 JButtons instead of JPanels
//once the user clicks the 10th correct button display 
//your name, course, section #, and MEID using JOptionPane

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JCatchTheMouse extends JFrame implements ActionListener
{
   int catchCount = 0;
   int missCount = 0;
   private JButton[] button = {
      new JButton(), new JButton(), new JButton(), new JButton(),
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(),
      new JButton(), new JButton(), new JButton(), new JButton(),
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton(), 
      new JButton(), new JButton(), new JButton(), new JButton()};
   private Container con = getContentPane();
   int moveTo = (int)(Math.random()*49);

   
   public JCatchTheMouse()
   {
      super("Get the X!");
      con.setLayout(new GridLayout(8, 6));
      button[moveTo].setText("X");
         for(int x = 0; x < 48; ++x)
         {
            con.add(button[x]);
            button[x].addActionListener(this);
         } 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   } 
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      if(source == button[moveTo])
      {
         moveTo = (int)(Math.random()*49);
      
         for(int x = 0; x < 48; ++x)
         {
            if(source == button[x])
            {
               button[x].setText(" ");
               button[moveTo].setText("X");
               ++catchCount;
            }
         }
      }
      else
      {
         ++missCount;
      }
      
      if(catchCount == 10)
      {         
         JOptionPane.showMessageDialog(null, "Author: Erica Peharda" + "\nCourse: CIS 263AA" +
            "\nSection Number: 33254" + "\nMEID: ERI2203192");
      }      
   }
   
   public static void main(String[] args)
   {
      final int WIDTH = 400;
      final int HEIGHT = 250;
      JCatchTheMouse mouseFrame = new JCatchTheMouse();
      mouseFrame.setSize(WIDTH, HEIGHT);
      mouseFrame.setVisible(true);
   }   
}