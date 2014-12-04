//Course: CIS 263AA
//Section Number: 33254
//Filename is JEmployeeTitle2.java
//Written by Erica Peharda
//Written on December 17th, 2013
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JEmployeeTitle2 extends JApplet implements ActionListener
{
   String[] empName = {"Matt", "Erica", "Nick", "Lindsay", "Arthur"};
   String[] empJob = {"Engineering Technologist", "Associate Application Developer", 
      "Accountant", "Nurse", "Unemployeed"};      
   JTextField answer = new JTextField(30);
   JLabel directions = new JLabel("Please enter an employee name or job title.");
   JButton enter = new JButton("Enter");
   JLabel correspondingInfo = new JLabel();
   Container con = getContentPane();
   Font font1 = new Font("Arial", Font.ITALIC, 16);
   
   public void init()
   {
      con.setLayout(new FlowLayout());
      directions.setFont(font1);
      con.add(directions);
      con.add(answer);
      con.add(enter);
      answer.addActionListener(this);
      enter.addActionListener(this); 
   }
   public void actionPerformed(ActionEvent e)
   {
      String infoEntered = answer.getText();

     
      for(int x = 0; x < 5; ++x)
      {
         if(infoEntered.equalsIgnoreCase(empName[x])||
            infoEntered.equalsIgnoreCase(empJob[x]))
         {
            con.remove(directions);
            con.remove(answer);
            con.remove(enter);
            correspondingInfo.setText("Employee Name: " + empName[x] 
            + " Job Title: " + empJob[x]);
            con.add(correspondingInfo);
            con.setBackground(Color.GREEN);
         }
      }
      validate();
   }
  
   
   
   
}