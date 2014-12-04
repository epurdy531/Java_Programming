//Course: CIS 263AA
//Section Number: 33254
//Filename is JDemoResistance.java
//Written by Erica Peharda
//Written on November 18th, 2013
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoResistance extends JFrame implements ActionListener
{
   //creating all of the JButtons that give reasons for
   //opting out of purchasing a specific product
   JButton expensive = new JButton("Too Expensive");
   JButton color = new JButton("Wrong Color");
   JButton small = new JButton("Too Small");
   JButton large = new JButton("Too Large");
   JButton material = new JButton("Wrong Material");
   
   Font explainFont = new Font("Arial", Font.BOLD, 18);
   
   //I added a label to explain the buttons
   JLabel buttonExplain1 = new JLabel("Please select the reason(s)");
   JLabel buttonExplain2 = new JLabel("the item was not purchased:");
   
   public JDemoResistance()
   {
      super("Product Feedback");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      //these are to explain the buttons that are displayed
      add(buttonExplain1);
      add(buttonExplain2);
      buttonExplain1.setFont(explainFont);
      buttonExplain2.setFont(explainFont);
      
      //adding buttons
      add(expensive);
      add(color);
      add(small);
      add(large);
      add(material);
  
      //enabling the action listener to identify the event 
      //that takes place    
      expensive.addActionListener(this);
      color.addActionListener(this);
      small.addActionListener(this);
      large.addActionListener(this);
      material.addActionListener(this);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      //actionPerformed method specifies which buttons
      //were pressed and removes those buttons
      Object source = e.getSource();
      
      if(source == expensive)
         remove(expensive);
      else if(source == color)
         remove(color);
      else if (source == small)
         remove(small);
      else if (source == large)
         remove(large);
      else if (source == material)
         remove(material);
   }
   
   public static void main(String[] args)
   {
      //the main method instantiates the JDemoResistance object
      //as well as specifying size of the JFrame
      JDemoResistance aFrame = new JDemoResistance();
      final int WIDTH = 300;
      final int HEIGHT = 215;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }   
}