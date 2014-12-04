//Course: CIS 263AA
//Section Number: 33254
//Filename is JBasketball.java
//Written by Erica Peharda
//Written on November 18th, 2013
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JBasketball extends JFrame implements ActionListener
{
   //creating an array for basketball teams, then it's combo box, 
   //and label for final selection!
   String[] basketballArray = {"Bulls", "Spurs", "Nuggets", "Cavs", "Wizzards"};
   JComboBox basketball = new JComboBox(basketballArray); 
   JLabel basketballChoice = new JLabel(""); 
   Font choiceFont = new Font("Arial", Font.BOLD, 18);
   
   public JBasketball()
   {
      //giving JBasketball JFrame a title, telling it to exit on close
      //and adding a flowlayout to organize the items added so that they
      //don't write over each other
      super("Favorite Team");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      basketballChoice.setFont(choiceFont);
      add(basketball); 
      //enabling the event listener
      basketball.addActionListener(this);
      add(basketballChoice);
   }
   
   public void actionPerformed(ActionEvent e)
   {
      //creating an integer to identify the user choice and display it
      int x = basketball.getSelectedIndex();
      String team = basketballArray[x];
      basketballChoice.setText("You selected " + team + "!");   
   }
   
   public static void main(String[] args)
   {  
      //creating a JBasketball object to display with 
      //certain specifications
      JBasketball aFrame = new JBasketball();
      final int WIDTH = 400;
      final int HEIGHT = 100;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);             
   }
}