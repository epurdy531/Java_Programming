//Course: CIS 263AA
//Section Number: 33254
//Filename is JPoliticalFrame.java
//Written by Erica Peharda
//Written on November 25th, 2013

import javax.swing.*;
import java.awt.*;
public class JPoliticalFrame extends JFrame
{
   private JButton lw = new JButton("Bill Clinton");
   private JButton rw = new JButton("George Bush");
   private JButton cw = new JButton("Gary Johnson");
   
   private Container con = getContentPane();
   
   public JPoliticalFrame()
   {
     con.setLayout(new BorderLayout());
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     con.add(lw, BorderLayout.WEST);
     con.add(rw, BorderLayout.EAST);
     con.add(cw, BorderLayout.CENTER);
     setSize(450, 100);
   }
   
   public static void main(String[]args)
   {
      JPoliticalFrame frame = new JPoliticalFrame();
      frame.setVisible(true);      
   }
}