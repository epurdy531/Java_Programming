//Course: CIS 263AA
//Section Number: 33254
//Filename is JColorFrame.java
//Written by Erica Peharda
//Written on December 5th, 2013

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JColorFrame extends JFrame implements ActionListener
{
   private JButton cb = new JButton("Click Me!");
   private JPanel nb = new JPanel();
   private JPanel sb = new JPanel();
   private JPanel eb = new JPanel();
   private JPanel wb = new JPanel();  
   public JColorFrame()
   {
      setTitle("Color Frame Demo");
      setLayout(new BorderLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      add(cb, BorderLayout.CENTER);
      add(nb, BorderLayout.NORTH);
      add(sb, BorderLayout.SOUTH);
      add(eb, BorderLayout.EAST);
      add(wb, BorderLayout.WEST);
      cb.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      Object source = e.getSource();
      Container con = getContentPane();
   //below is the array from which to generate a random number (that will represent a region)   
      int [] regionNumber = {1, 2, 3, 4};

      int number = (int)(Math.random()*(regionNumber.length + 1));
   //this code will randomly generate a region.  If the region is already colored, it will not 
   //repeat the coloring   
      if(source == cb)
      {
            if(number == 1)
               sb.setBackground(Color.YELLOW);
            else if(number == 2)
               nb.setBackground(Color.RED);
            else if(number == 3)
               eb.setBackground(Color.MAGENTA);
            else if(number == 4)
               wb.setBackground(Color.BLUE);
      }      
   }
   
   public static void main(String[] args)
   {
      JColorFrame jcf = new JColorFrame();
      final int WIDTH = 250;
      final int HEIGHT = 200;
      jcf.setSize(WIDTH, HEIGHT);
      jcf.setVisible(true);
   }   
}