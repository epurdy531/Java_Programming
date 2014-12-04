import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JResortCalculator extends JFrame implements ItemListener
{
   //declare the named constants that hold the base price for a resort
   //room and the premium amounts for a weekend stay including
   //breakfast and a round of golf
   //also included is a variable to hold total price of stay!
   final int BASE_PRICE = 200;
   final int WEEKEND_PREMIUM = 100;
   final int BREAKFAST_PREMIUM = 20;
   final int GOLF_PREMIUM = 75;
   int totalPrice = BASE_PRICE;
   
   //declaring three JCheckBox objects (each starting as unselected b/c false)
   JCheckBox weekendBox = new JCheckBox
      ("Weekend premium $" + WEEKEND_PREMIUM, false);
   JCheckBox breakfastBox = new JCheckBox
      ("Breakfast $" + BREAKFAST_PREMIUM, false);
   JCheckBox golfBox = new JCheckBox
      ("Golf $" + GOLF_PREMIUM, false);
      
   //here are some JLabels to hold user instructions and info
   //and a JTextField in which to display total price
   JLabel resortLabel = new JLabel("Resort Price Calculator");
   JLabel priceLabel = new JLabel("The price for your stay is");
   JTextField totPrice = new JTextField(4);
   JLabel optionExplainLabel = new JLabel
      ("Base price for a room is $" + BASE_PRICE + ".");
   JLabel optionExplainLabel2 = new JLabel
      ("Check the options you want.");
   
   //now is the JResortCalculator class constructor
   //it includes instructions to set teh title by passing it to the JFrame
   //parent class constructor, to set the defualt close program, and to set 
   //layout manager
   public JResortCalculator()
   {
      super("Resort Price Estimator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(resortLabel);
      add(optionExplainLabel);
      add(optionExplainLabel2);
      add(weekendBox);
      add(breakfastBox);
      add(golfBox);
      add(priceLabel);
      add(totPrice);
      //setting the text of totPrice JTextField to display a dollar
      //sign and the totalPrice value.
      totPrice.setText("$" + totalPrice);
      weekendBox.addItemListener(this);
      breakfastBox.addItemListener(this);
      golfBox.addItemListener(this);
   }
   
   //this will execute when the user selects or deselects JCheckBox
   //THIS is where tot price is calculated!
   public void itemStateChanged(ItemEvent event)
   {
      Object source = event.getSource();
      int select = event.getStateChange();
      
      if(source == weekendBox)
         if(select == ItemEvent.SELECTED)
            totalPrice += WEEKEND_PREMIUM;
         else
            totalPrice -= WEEKEND_PREMIUM;
      else if (source == breakfastBox)
      {
         if(select == ItemEvent.SELECTED)
            totalPrice += BREAKFAST_PREMIUM;
         else
            totalPrice -= BREAKFAST_PREMIUM;
      }
      else      //if(source == golfBox) by default
         if(select == ItemEvent.SELECTED)
            totalPrice += GOLF_PREMIUM;
         else
            totalPrice -= GOLF_PREMIUM;
         totPrice.setText("$" + totalPrice);
   }
   
   public static void main(String[] args)
   {
      JResortCalculator aFrame = new JResortCalculator();
      final int WIDTH = 300;
      final int HEIGHT = 200;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }
}