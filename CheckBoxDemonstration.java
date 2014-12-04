import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CheckBoxDemonstration
   extends JFrame implements ItemListener
{
   //adds items instead of replacing them
   FlowLayout flow = new FlowLayout();
   JLabel label = new JLabel("What would you like to drink?");
   //adds checkboxes with its name followed by "false" meaning it's unchecked
   JCheckBox coffee = new JCheckBox("Coffee", false);
   JCheckBox cola = new JCheckBox("Cola", false);
   JCheckBox milk = new JCheckBox("Milk", false);
   JCheckBox water = new JCheckBox("Water", false);
   
   String output, insChosen;
   
   public CheckBoxDemonstration()
   {
      //sends the title to JFrame
      super("CheckBox Demonstration");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      label.setFont(new Font("Arial", Font.ITALIC, 22));
      //now this adds item listeners to each checked input-
      //VERY important to remember
      coffee.addItemListener(this);
      cola.addItemListener(this);
      milk.addItemListener(this);
      water.addItemListener(this);
      //then it adds each to the Jlabel
      add(label);
      add(coffee);
      add(cola);
      add(milk);
      add(water);
   }
   public void itemStateChanged(ItemEvent check)
   {
      //Actions based on choice go here
   }
   public static void main(String[] arguments)
   {
      final int FRAME_WIDTH = 350;
      final int FRAME_HEIGHT = 120;
      
      CheckBoxDemonstration frame = new CheckBoxDemonstration();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setVisible(true);
   }   
}