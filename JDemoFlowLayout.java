import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JDemoFlowLayout extends JFrame implements ActionListener
{
   private JButton lb = new JButton("L Button");
   private JButton rb = new JButton("R Button");
   //in every app you create a container to put the buttons in- you'll see con.add to add them
   private Container con = getContentPane();
   //below we chose flowlayout- you could also choose border layout
   private FlowLayout layout = new FlowLayout();
   public JDemoFlowLayout()
   {
      //need this also to set either border or flow layout
      con.setLayout(layout);
      con.add(lb);
      con.add(rb);
      //below we're adding a command or reaction to pressing each button
      lb.addActionListener(this);
      rb.addActionListener(this);
      setSize(500, 100);
   }
   
   public void actionPerformed(ActionEvent event)
   {
      Object source = event.getSource();
      //below sets buttons left or right depending on action
      if(source == lb)
         layout.setAlignment(FlowLayout.LEFT);
      else
         layout.setAlignment(FlowLayout.RIGHT);
      //not sure what this does!
      //says on pg. 709 that INVALIDATE call marks the contaner as needed to be laid out
      //VALIDATE call causes components to be rearranged based on the newly assigned layout
      con.invalidate();
      con.validate();    
   }
   
   public static void main(String[] args)
   {
      JDemoFlowLayout frame = new JDemoFlowLayout();
      frame.setVisible(true);
   }
}