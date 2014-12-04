//Course: CIS 263AA
//Section Number: 33254
//Filename is JPasswordB.java
//Written by Erica Peharda
//Written on December 17th, 2013
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JPasswordB extends JApplet implements ActionListener
{
   JLabel enterPassword = new JLabel("Please enter a password!");
   Font font1 = new Font("Arial", Font.ITALIC, 34);
   Font font2 = new Font("Arial", Font.BOLD, 46);
   JTextField answer = new JTextField(10);
   JButton enter = new JButton("Enter");
   JLabel granted = new JLabel("Access Granted!");
   JLabel denied = new JLabel("Access Denied!");
   Container con = getContentPane();
   public void init()
   {
      con.setLayout(new FlowLayout());
      enterPassword.setFont(font1);
      granted.setFont(font2);
      denied.setFont(font2);
      con.add(enterPassword);
      con.add(answer);
      con.add(enter);
      con.setBackground(Color.PINK);     
      enter.addActionListener(this);
      answer.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e)
   {
      String userPassword = answer.getText();
      con.remove(enterPassword);
      con.remove(enter); 
      con.remove(answer); 
      if(userPassword.equalsIgnoreCase("Rosebud"))
      {
         con.setBackground(Color.GREEN);
         con.add(granted);
      }
      else
      {
         con.setBackground(Color.RED);
         con.add(denied);
      }     
      validate();
   }
}