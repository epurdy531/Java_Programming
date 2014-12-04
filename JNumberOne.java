//Course: CIS 263AA
//Section Number: 33254
//Filename is JNumberOne.java
//Written by Erica Peharda
//Written on December 17th, 2013
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class JNumberOne extends JApplet implements ActionListener
{
   Font buttonFont = new Font("Arial", Font.BOLD, 24);
   private JButton numberOne = new JButton("Who's number one?");
   Font sox = new Font("Arial", Font.ITALIC, 40);
   JLabel chicagoWhiteSox = new JLabel("Chicago White Sox!!");
   Container con = getContentPane();
   public void init()
   {
      numberOne.setFont(buttonFont);
      con.setLayout(new FlowLayout());
      numberOne.addActionListener(this);
      con.add(numberOne);
      chicagoWhiteSox.setFont(sox);
   }
   public void actionPerformed(ActionEvent event)
   {
      con.remove(numberOne);
      con.add(chicagoWhiteSox);
      validate();
   }
}