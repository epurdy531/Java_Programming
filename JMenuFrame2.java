import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
public class JMenuFrame2 extends JFrame
{
   private JMenuBar mainBar = new JMenuBar();
   private JMenu menu1 = new JMenu("File");
   private JCheckBoxMenuItem check1 = new
      JCheckBoxMenuItem("Check box A");
   private JCheckBoxMenuItem check2 = new
      JCheckBoxMenuItem("Check box B");
   private JRadioButtonMenuItem radio1 = new
      JRadioButtonMenuItem("Radio option 1");
   private JRadioButtonMenuItem radio2 = new
      JRadioButtonMenuItem("Radio option 2");
   private JRadioButtonMenuItem radio3 = new
      JRadioButtonMenuItem("Radio option 3");
   private ButtonGroup group = new ButtonGroup();
   
   public JMenuFrame2()
   {
      setTitle("Menu Demonstration");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      setJMenuBar(mainBar);
      mainBar.add(menu1);
      menu1.add(check1);
      menu1.add(check2);
      menu1.addSeparator();
      menu1.add(radio1);
      menu1.add(radio2);
      menu1.add(radio3);
      group.add(radio1);
      group.add(radio2);
      group.add(radio3);
   }
   
   public static void main(String[] args)
   {
      JMenuFrame2 Frame = new JMenuFrame2();
      final int WIDTH = 150;
      final int HEIGHT = 200;
      Frame.setSize(WIDTH, HEIGHT);
      Frame.setVisible(true);
   }
}