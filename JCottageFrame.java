//Course: CIS 263AA
//Section Number: 33254
//Filename is JCottageFrame.java
//Written by Erica Peharda
//Written on November 18th, 2013

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JCottageFrame extends JFrame implements ItemListener
{
   //declaring both constant and variable items
   final int ONE_BEDROOM = 600;
   final int TWO_BEDROOM = 850;
   final int ROW_BOAT = 60;
   int totalPrice = 0;
   
   //creating some font options
   Font titleFont = new Font("Arial", Font.BOLD, 18);
   Font subTitleFont = new Font("Arial", Font.ITALIC, 14);
   
   //creating three checkboxes
   JCheckBox oneBedroom = new JCheckBox
      ("One-bedroom cottage for one week is $" + ONE_BEDROOM + ".", false);
   JCheckBox twoBedroom = new JCheckBox
      ("Two-bedroom cottage for one week is $" + TWO_BEDROOM + ".", false);
   JCheckBox rowBoat = new JCheckBox
      ("One week rowboat rental is $" + ROW_BOAT + ".", false);
   
   //creating a button group so that one and two bedroom buttons
   //are mutually exclusive   
   ButtonGroup aGroup = new ButtonGroup();
   
   //creating some labels and a text field for display of total price   
   JLabel kochCottageLabel = new JLabel("Koch's Cottages Weekend Getaway");
   JLabel priceLabel = new JLabel("Your total price for one week stay is:");
   JTextField totPrice = new JTextField(5);
   JLabel optionExplainLabel = new JLabel
      ("Please check the options you want for your vacation!");
   
   public JCottageFrame()
   {
      //creating a title and some formatting for the JFrame
      super("Koch's Cottages Vacation");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      //adding various labels and checkboxes
      add(kochCottageLabel);
      kochCottageLabel.setFont(titleFont);
      add(optionExplainLabel);
      optionExplainLabel.setFont(subTitleFont);
 
      //adding the mutually exclusive 
      //one and two bedroom button group     
      aGroup.add(oneBedroom);
      aGroup.add(twoBedroom);
      
      add(oneBedroom);
      add(twoBedroom);
      add(rowBoat);
      add(priceLabel);
      add(totPrice);
  
      //adding the total price and action commands for
      //one-bed two-bed and rowboat    
      totPrice.setText("$" + totalPrice);
      oneBedroom.addItemListener(this);
      twoBedroom.addItemListener(this);
      rowBoat.addItemListener(this);      
   }
   
   public void itemStateChanged(ItemEvent event)
   {
      Object source = event.getSource();
      int select = event.getStateChange();
      
      //series of if-then statements to distinguish
      //which vacation option was checked and adjust
      //the total price accordingly   
      if(source == oneBedroom)
         if(select == ItemEvent.SELECTED)
            totalPrice += ONE_BEDROOM;
         else
            totalPrice -= ONE_BEDROOM;
      else if(source == twoBedroom)
      {
         if(select == ItemEvent.SELECTED)
            totalPrice += TWO_BEDROOM;
         else
            totalPrice -= TWO_BEDROOM;
      }
      else if (source == rowBoat)
      {
         if(select == ItemEvent.SELECTED)
            totalPrice += ROW_BOAT;
         else
            totalPrice -= ROW_BOAT;
      }
      
      totPrice.setText("$" + totalPrice);
   }
   
   public static void main(String[] args)
   {
      //creating an aFrame object and it's specifications
      JCottageFrame aFrame = new JCottageFrame();
      final int WIDTH = 400;
      final int HEIGHT = 200;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }
}